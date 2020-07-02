package me.learning.ds.stack;

public class StackUsingLinkList<T> {
	class Node<T>{
		T data;
		Node<T> nextNode;
	}
	
	Node<T> top = null;
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public void push(T data) {
		Node<T> newNode = new Node<>();
		newNode.data = data;
		if(top==null) {
			top = newNode;
			return;
		}
		
		newNode.nextNode = top;
		top = newNode;
	}
	
	public T pop() {
		if(isEmpty())
			return null;
		
		T data = top.data;
		top = top.nextNode;
		return data;
	}
	
	public void print() {
		Node<T> tempHead = top;
		while(tempHead != null) {
			System.out.print(tempHead.data + "\t");
			tempHead = tempHead.nextNode;
		}
		System.out.println();
	}
	

}
