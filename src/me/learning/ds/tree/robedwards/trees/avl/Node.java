package me.learning.ds.tree.robedwards.trees.avl;

public class Node<T extends Comparable<T>> {
	T data;
	Node<T> left, right;
	int height;
	
	public Node(T data) {
		this.data = data;
		left=right= null;
		height = 0;
	}

}
