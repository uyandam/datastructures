package com.uyanda.heap;

import java.util.ArrayList;
import java.util.Collections;

public class Heap {
	
	public Heap() {
		this.nodeList = new ArrayList<Integer>();
	}
	
	public void printList() {
		for(int data:this.nodeList) {
            System.out.println(data);
        } 
	}
	
	public void add(int data) {
		this.nodeList.add(data);
		
		if (this.nodeList.size() > 1) {
			moveElementUp();
		}
		
	}
	
	private void moveElementUp() {
		int k = this.nodeList.size() - 1;
		
		if(k == 0)
			return;
		int p = (k - 1)/2;
		
		while(k != 0) {
			if(this.nodeList.get(k) > this.nodeList.get(p)) {
				Collections.swap(this.nodeList, k, p);
				k = p;
				p = (k - 1)/2;
			}
			else {
				break;
			}
		}
	}
	
	
	private ArrayList<Integer> nodeList;
}
