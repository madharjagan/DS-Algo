package me.learning.ds.tree.bst;

/*Binary Search Tree implementation using recursion
 * left node should be less than parent 
 * right node should be greater than parent 
 * T extends Comparable<T> - Node Type should implement compareTo inorder to get it inserted in Binary search tree */
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
	
	//left parent right
	public void printInOrder() {
		if(this.left != null) {
			this.left.printInOrder();
		}
		System.out.println(this.data);
		if(this.right != null) {
			this.right.printInOrder();
		}		
	}
	
	// Parent, left and Right
	public void printPreOrder() {
		if(this.left != null) {
			this.left.printInOrder();
		}
		System.out.println(this.data);
		if(this.right != null) {
			this.right.printInOrder();
		}		
	}
	
	//left, right and parent
	public void printPostOrder() {
		if(this.left != null) {
			this.left.printInOrder();
		}
		System.out.println(this.data);
		if(this.right != null) {
			this.right.printInOrder();
		}		
	}
	
	

}
