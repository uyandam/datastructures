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
	
	public void remove() {
		if(this.nodeList.size() == 0)
			return;
		
		if(this.nodeList.size() == 1) {
			this.nodeList.remove(0);
			return;
		}
		
		int k = this.nodeList.size() - 1;
		Collections.swap(this.nodeList, 0, k);
		this.nodeList.remove(k);
		
		siftElementDown();
		
	}
	
	private void siftElementDown() {
		int k = 0;
		int leftChild = 2*k + 1;
		int rightChild = 2*k + 2;
		
		while (k < this.nodeList.size() - 1 && k < this.nodeList.size() - 2) {
			if(this.nodeList.get(leftChild) > this.nodeList.get(rightChild)) {
				if(this.nodeList.get(k) < this.nodeList.get(leftChild)) {
					Collections.swap(this.nodeList, leftChild,k);
					k = leftChild;
					continue;
				}
				break;
			}
			else {
				if(this.nodeList.get(k) < this.nodeList.get(rightChild)) {
					Collections.swap(this.nodeList, k, rightChild);
					k = rightChild;
					continue;
				}
				break;
			}
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
