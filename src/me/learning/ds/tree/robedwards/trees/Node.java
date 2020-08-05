package me.learning.ds.tree.robedwards.trees;

public class Node<T extends Comparable<T>> {
	T data;
	Node<T> left, right;
	
	public Node(T data) {
		this.data = data;
		left=right= null;
	}

}
