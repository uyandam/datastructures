/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uyanda;
import com.uyanda.bst.*;
/**
 *
 * @author uyanda
 */
public class Main {
    public static void main (String [] args){
        System.out.println("Hello World!");
        
        BinarySearchTree node = new BinarySearchTree();
        node.add(10);
        node.add(5);
        node.add(15);
        node.add(3);
        node.add(7);
        node.add(13);
        node.add(18);
        node.add(9);
        node.viewInorder();
        node.removeNode(5);
        node.removeNode(3);
        node.removeNode(18);
        node.viewInorder();
        
        
        BinarySearchTree cloneNode = new BinarySearchTree();
        cloneNode.setTreeCopy(node.getTreeCopy());
        
        cloneNode.viewInorder();
        
    }
}
