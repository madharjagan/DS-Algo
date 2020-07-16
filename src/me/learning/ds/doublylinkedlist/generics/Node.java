package me.learning.ds.doublylinkedlist.generics;

/*
 
 1) Nodes data can be any type -
	 a) String, Integer, 
	 b) Custom Object, 
	 c) Key-Value pair in the symbol table
 
 2) But should be java.lang.Comparable should override compareTo method.
 
 */

public class Node<T> {
	T data;
	Node<T> preNode;
	Node<T> nextNode;
	
	
	public Node(T data){
		this.data = data;
		preNode = null;
		nextNode = null;
	}
}
