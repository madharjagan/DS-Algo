package me.learning.ds.tree.bst;

public class Node<T extends Comparable<T>> {
	Node<T> left, right;
	T data;
	
	public Node(T data) {
		this.data = data;
	}
	
	public void insert(T value) {
		if(this.data.compareTo(value)>0) {
			if(this.right == null) {
				this.right = new Node<>(value);
				
			} else {
				this.right.insert(value);
			}
		} else {
			if(this.left == null) {
				this.left = new Node<>(value);
			} else {
				this.left.insert(value);
			}
		}
	}
	
	public void printInOrder() {
		if(this.left != null) {
			this.left.printInOrder();
		}
		System.out.println(this.data);
		if(this.right != null) {
			this.right.printInOrder();
		}		
	}

}
