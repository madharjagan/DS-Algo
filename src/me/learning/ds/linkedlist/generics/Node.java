package me.learning.ds.linkedlist.generics;

/*
 
 Nodes data can be any type - 
	 a) String, Integer, 
	 b) Custom Object, 
	 c) Key-Value pair in the symbol table
 
 */

public class Node<T> {
	T data;
	Node<T> nextNode;
	
	public Node(T data){
		this.data = data;
	}
}
