/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uyanda.bst;

/**
 *
 * @author uyanda
 */
public class BinarySearchTree {
    
    
    /*
    public BinarySearchTree(int data){
        this.head = new Node(data);
    }
    */
    
    
    public void setTreeCopy(Node tree){
        this.head = tree;
    }
    
    public Node getTreeCopy(){
        if (this.head == null){
            return null;
        }
        
        Node node = treeCopy(this.head);
        
        return node;
    }
    
    
    public int getTreeHeight(){
        return treeHeight(this.head);
    }
    int treeHeight(Node root){
        if(root == null)
            return 0;
        
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        
        if(leftHeight > rightHeight)
            return leftHeight + 1;
        else
            return rightHeight + 1;
    }
    
    Node treeCopy(Node node){
        if(node == null){
            return null;
        }
        Node newNode = new Node(node.data);
        
        newNode.left = treeCopy(node.left);
        newNode.right = treeCopy(node.right);
        
        return newNode;
    }
    
    public void add(int data){
        this.head = insertRecord(this.head, data);
    }
    
    public void viewInorder(){
        Node current = this.head;
        printInorder(current);
        System.out.println("");
    }
    
    public void removeNode(int data){
        Node current = this.head;
        
        this.head = deleteNode(current, data);
    }
    
   
    
    private Node deleteNode(Node node, int data){
        
        if(node == null){
            node = null;
        }else if(data < node.data){
            node.left = deleteNode(node.left, data);
        }else if(data > node.data){
            node.right = deleteNode(node.right, data);
        } else{
            if(node.left == null && node.right == null){
                node = null;
            } else if(node.left == null ){
                node = node.right;
            } else if(node.right == null){
                node = node.left;
            } else{
                int minValue = findMin(node.right);
                node.data = minValue;
                node.right = deleteNode(node.right, minValue);
            }
        }
        return node;
        
    }
    
    private int findMin(Node node){
        Node current = node;
        
        while(current.left != null){
            current = current.left;
        }
        
        return current.data;
    }
    
    private void printInorder(Node node){
        
        if(node == null) return;
        
        printInorder(node.left);
        
        System.out.printf("%d ", node.data);
        
        printInorder(node.right);
    }
    
    public static Node insertRecord(Node root, int data){
       if (root == null){
           root = new Node(data);
           return root;
       }
       
       if(data <= root.data)
           root.left = insertRecord(root.left, data);
       else
           root.right = insertRecord(root.right, data);
       
       return root;
    }
    
    
    
    private Node head;
}

class Node {
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    int data;
    Node left;
    Node right;
}