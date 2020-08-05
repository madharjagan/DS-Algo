package me.learning.ds.linkedlist.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 1) Singly Linked List Implementation using Generic
 2) Using Tail pointer to improve time complexity of 
 		a) addNodeAtEnd() - with tail Constant time
 3) currentSize - Tracks the number of Nodes in the Linked list to improve the time complexity of 
 		a) size() - Constant time
 */
public class LinkedList<T> implements Iterable<T>{
	
	Node<T> head = null;
	Node<T> tail = null;
	int currentSize = 0;
	
	private class ForwardIterator<T> implements Iterator<T>, Iterable<T> {
		
		Node<T> head = null;
		
		public ForwardIterator(Node<T> head) {
			this.head = head;
		}

		@Override
		public Iterator<T> iterator() {
			return this;
		}

		@Override
		public boolean hasNext() {			
			return head != null;
		}

		@Override
		public T next() {
			if(hasNext()) {
				T element = head.data;
				head = head.nextNode;
				return element;
			}	
			return null;
		}
		
	}
	
	
	/* 
	 * Time Complexity - O(1)
	 * Space Complexity - O(1)
	 */	
	public int size(){
		return currentSize;
	}
	
	/* 
	 * Time Complexity - O(1)
	 * Space Complexity - O(1)
	*/
	public void addNodeAtBegin(T data){
		Node<T> newNode = new Node<>(data);
		newNode.nextNode = head;
		head = newNode;	
		currentSize++;			
	}
	
	/* 
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
	public void add(T data, int position) {
		Node<T> newNode = new Node<>(data);
		int pointerCount = 0;
		
		if(head == null) {
			newNode.nextNode = head;
			head = newNode;
			currentSize++;
			return;
		}
		
		Node<T> temp = head;
		Node<T> previous = head;
		
		while(temp.nextNode != null & pointerCount<position) {
			previous = temp;
			temp = temp.nextNode;
			pointerCount++;
		}

		previous.nextNode = newNode;
		newNode.nextNode = temp.nextNode;
		currentSize++;
			
	}
	
	
	
	/* 
	 * Time Complexity - 
	 * Space Complexity -
	*/
	public void addAtMiddle(T data) {
		add(data, (int)Math.ceil(currentSize/2));
	}
	
	/* 
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
	public void addNodeAtEndWithoutTail(T data) {
		Node<T> newNode = new Node<>(data);
		if(head == null){
			head = newNode;
			currentSize++;
			return;
		}		
		Node<T> temp = head;		
		while(temp.nextNode != null) {
			temp = temp.nextNode;
		}
		
		temp.nextNode = newNode;
		currentSize++;		
	}
	
	/* 
	 * Time Complexity - O(1)
	 * Space Complexity - O(1)
	*/
	public void addNodeAtEnd(T data) {
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
	

	
	/* 
	 * Time Complexity - O(1)
	 * Space Complexity - O(1)
	*/
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
	
	/* 
	 * Time Complexity - 
	 * Space Complexity -
	*/
	public T remove(T data) {
		if(head == null)
			return null;
		T removedNodeData = head.data;
		if(head == tail){
			head = tail = null;
			currentSize--;
			return removedNodeData;
		}
		
		Node<T> current = head, previous = null;
		while(current.nextNode != null) {
			if(((Comparable<T>)data).compareTo(current.data) == 0) {
				if(previous!=null) {
				previous.nextNode = current.nextNode;
				} else {
					head = head.nextNode;
				}
				currentSize--;
				return current.data;
			}
			previous = current;
			current = current.nextNode;
		}
		
		return null;		
	}
	
	
	/* 
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
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
	
	/* 
	 * No change other than updating tail.
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
	public T removeLastWithoutTail() {
		return null;
	}
	
	public T removeNthFromEnd(int n) {
		
		
		
		return null;
	}
	
	/* 
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
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
	
	/* 
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
	public void printUsingIterator() {
		
		for(T nodeData : this) {
			System.out.print(nodeData+"==>");
		}
		
		System.out.println("NULL");
	}
	
	public void printLinkedListReverse(Node<T> head) {
		if(head == null)
			return;
		printLinkedListReverse(head.nextNode);
		System.out.println(head.data);
	}

	@Override
	public Iterator<T> iterator() {		
		return new ForwardIterator<>(head);
	}
	
}
