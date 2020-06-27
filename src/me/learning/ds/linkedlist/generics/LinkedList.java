package me.learning.ds.linkedlist.generics;



public class LinkedList<T> {
	
	Node<T> head = null;
	Node<T> tail = null;
	int currentSize = 0;
	
	public int size(){
		return currentSize;
	}
	
	public void insertNodeAtEnd(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null){
			head = tail = newNode;
			currentSize++;
			return;
		}
		tail.nextNode = newNode;
		tail = newNode;
		currentSize++;
	}
	
	public void insertNodeAtBegin(T data){
		Node<T> newNode = new Node<>(data);
		newNode.nextNode = head;
		head = newNode;	
		currentSize++;			
	}
	
	
	public T removeFirst() {
		if(head == null)
			return null;
		T removedNodeData = head.data;
		if(head==tail){
			head = tail = null;
			currentSize--;
			return removedNodeData;
		}
		
		head = head.nextNode;
		currentSize--;		
		return removedNodeData;
	}
	
	
	public T removeLast() {
		if(head == null)
			return null;
		T removedNodeData = head.data;
		if(head == tail){
			head = tail = null;
			currentSize--;
			return removedNodeData;
		}
		
		Node<T> current = head, previous = null;
		
		while(current.nextNode != null){
			previous = current;
			current = current.nextNode;
		}
		previous.nextNode = null;
		tail = previous;
		currentSize--;
		return current.data;
		
	}
	
	public void printLinkedList() {
		if(head == null)
			return;
		Node<T> temp = head;
		while(temp.nextNode != null) {
			System.out.println(temp.data+":"+temp.nextNode+"-->");
			temp = temp.nextNode;
		}
		System.out.println(temp.data+":"+temp.nextNode);
	}

}
