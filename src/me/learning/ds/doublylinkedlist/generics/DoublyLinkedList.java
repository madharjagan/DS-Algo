package me.learning.ds.doublylinkedlist.generics;

import java.util.Iterator;
import java.util.NoSuchElementException;

/*
 1) Singly Linked List Implementation using Generic
 2) Using Tail pointer to improve time complexity of 
 		a) addNodeAtEnd() - with tail Constant time
 3) currentSize - Tracks the number of Nodes in the Linked list to improve the time complexity of 
 		a) size() - Constant time
 */
public class DoublyLinkedList<T> implements Iterable<T>{
	
	Node<T> head;
	Node<T> tail;
	int currentSize;
	
	public DoublyLinkedList() {
		head = null;
		tail = null;
		currentSize = 0;
	}
	
	private class ForwardIterators<T> implements Iterator<T>, Iterable<T>{
		
		Node<T> head;
		
		public ForwardIterators(Node<T> head) {
			this.head = head;
		}

		@Override
		public boolean hasNext() {
			if(head != null)
				return true;
			return false;
		}

		@Override
		public T next() {
			if(hasNext()) {
				T element = head.data;
				head=head.nextNode;
				return element;
			}
			return null;
		}

		@Override
		public Iterator<T> iterator() {
			return this;
		}
		
	}
	
	private class ReverseIterators<T> implements Iterator<T>, Iterable<T>{
		
		Node<T> tail;
		
		public ReverseIterators(Node<T> tail) {
			this.tail = tail;
		}

		@Override
		public boolean hasNext() {
			if(tail != null)
				return true;
			return false;
		}

		@Override
		public T next() {
			if(hasNext()) {
				T element = tail.data;
				tail = tail.preNode;
				return element;
			}
			return null;
		}

		@Override
		public Iterator<T> iterator() {
			return this;
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
		if(head == null) {
			head = tail = newNode;
		}
		else {
			head.preNode = newNode;
			head = newNode;
		}
		currentSize++;			
	}
	
	/* 
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
	public void add(T data, int position) {
		int pointerCount = 0;
		
		if(head == null && position > 0)
			return;
		
		Node<T> newNode = new Node<>(data);
		
		Node<T> temp = head;
		
		while(temp.nextNode != null & pointerCount<position) {
			temp = temp.nextNode;
			pointerCount++;
		}
		
		if(temp.nextNode == null) {
			addNodeAtEnd(data);
			return;
		}
		
		newNode.preNode = temp;
		newNode.nextNode = temp.nextNode;
		temp.nextNode.preNode = newNode;
		temp.nextNode = newNode;
		tail = newNode;
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
		newNode.preNode = temp;		
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
		newNode.preNode = tail;
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
		head.preNode = null;
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
		
		Node<T> current = head;
		while(current.nextNode != null) {
			if(((Comparable<T>)data).compareTo(current.data) == 0) {
				current.preNode.nextNode = current.nextNode;
				current.nextNode.preNode = current.preNode;
				currentSize--;
				return current.data;
			}
			current = current.nextNode;
		}
		
		return null;		
	}
	
	
	/* 
	 * Time Complexity - O(1) - Constant time. Doubly Linked List changes Singly Linked List's O(n) to O(1)
	 * we need both tail and Doubly Linked List to reduce time complexity from O(n) to O(1)
	 * Space Complexity -
	*/
	public T removeLast() {
		T removedNodeData;
		if(head == null)
			return null;
		if(head == tail){
			removedNodeData = head.data;
			head = tail = null;
			currentSize--;
			return removedNodeData;
		}
		
		removedNodeData = tail.data;
		tail = tail.preNode;
		tail.nextNode = null;
		
		currentSize--;
		return removedNodeData;
		
	}
	
	/* 
	 * No change other than updating tail.
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
	public T removeLastWithoutTail() {
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
		
		System.out.print("NULL");
		System.out.println("HEAD @"+  head.data +"TAIL@"+ tail.data);
	}
	
	/* 
	 * Time Complexity - O(n)
	 * Space Complexity -
	*/
	public void printReverseUsingIterator() {
		
		ReverseIterators<T> linkedList = new ReverseIterators<>(tail);
		
		for(T nodeData : linkedList) {
			System.out.print(nodeData+"==>");
		}
		
		System.out.print("NULL");
		System.out.println("HEAD @"+  head.data +"TAIL@"+ tail.data);
	}
	
	public Iterator<T> reverseIterator() {
		return new ReverseIterators<>(tail);
	}

	@Override
	public Iterator<T> iterator() {		
		return new ForwardIterators<>(head);
	}

}
