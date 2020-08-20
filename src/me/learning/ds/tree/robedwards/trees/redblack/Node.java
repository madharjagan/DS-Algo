package me.learning.ds.tree.robedwards.trees.redblack;

public class Node<T extends Comparable<T>> {
	T data;
	Node<T> left, right;
	boolean isRED;
	
	public Node(T data) {
		this.data = data;
		left=right= null;
		isRED = true;
	}

}
