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
		if(this.data.compareTo(value)<0) {
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
	
	public void insertIterative(T value) {
		
	}
	
	public boolean contains(T value) {		
		if(this.data.compareTo(value)==0)
			return true;
		if(this.data.compareTo(value)>0 && this.left != null)
			return this.left.contains(value);	
		if(this.data.compareTo(value)<0 && this.right != null)
			return this.right.contains(value);	
		return false;
	}
	
	public T delete(T value) {
		
		
		
		return this.data;
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
		System.out.println(this.data);
		if(this.left != null) {
			this.left.printPreOrder();
		}
		if(this.right != null) {
			this.right.printPreOrder();
		}		
	}
	
	//left, right and parent
	public void printPostOrder() {
		if(this.left != null) {
			this.left.printPostOrder();
		}
		if(this.right != null) {
			this.right.printPostOrder();
		}	
		System.out.println(this.data);
	}
	
	

}
