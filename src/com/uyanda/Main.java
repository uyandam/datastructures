/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uyanda;
import com.uyanda.bst.*;
import com.uyanda.heap.*;
/**
 *
 * @author uyanda
 */
public class Main {
    public static void main (String [] args){
        System.out.println("Hello World!");
        
       Heap heap = new Heap();
       heap.add(12);
       heap.add(17);
       heap.add(40);
       heap.add(3);
       heap.add(13);
       heap.add(19);
       
       heap.printList();
        
    }
}
