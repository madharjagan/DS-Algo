package me.learning.ds.tree;

import java.util.ArrayList;
import java.util.List;

public class Node<T> {
	T data;
	List<Node<T>> children;
	int degreeOfNode;
	
	public Node(T data, int degreeOfNode){
		this.data = data;
		this.degreeOfNode = degreeOfNode;
	}
	
	public boolean insert(T data, int degreeOfNode) {
		if(children == null && degreeOfNode > 0) {
			children = new ArrayList<Node<T>>();
		}
		if(degreeOfNode > children.size()) {
			children.add(new Node<T>(data,degreeOfNode));
			return true;
		} else {
			insertInChildren(children, data,degreeOfNode);
		}
		 return true;
	}
	
	public void insertInChildren(List<Node<T>> children, T data, int degreeOfNode) {
		for(Node<T> child : children) {
			if(child.insert(data, degreeOfNode))
				return;
		}
	}

}
