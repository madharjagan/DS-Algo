package me.learning.ds.tree.robedwards.trees;

public class Node<E> {
	E data;
	Node<E> left, right;
	
	public Node(E data) {
		this.data = data;
		left=right= null;
	}

}
