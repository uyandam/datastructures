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
    
    public BinarySearchTree(int data){
        this.head = new Node(data);
    }
    
    
    public void add(int data){
        this.head = insertRecord(this.head, data);
    }
    
    public void viewInorder(){
        Node current = this.head;
        printInorder(current);
    }
    
    private void printInorder(Node node){
        
        if(node == null) return;
        
        printInorder(node.left);
        
        System.out.printf("%d ", node.data);
        
        printInorder(node.right);
    }
    
    private Node insertRecord(Node root, int data){
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