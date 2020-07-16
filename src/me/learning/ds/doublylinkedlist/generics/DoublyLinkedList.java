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
	
	Node<T> head = null;
	Node<T> tail = null;
	int currentSize = 0;
	
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
		
		while(temp.nextNode != null & pointerCount<position) {
			temp = temp.nextNode;
			pointerCount++;
		}
		
		newNode.nextNode = temp.nextNode;
		newNode.preNode = temp;
		temp.nextNode = newNode;
		newNode.nextNode.preNode = newNode;
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
		if(head == null)
			return null;
		T removedNodeData = head.data;
		if(head == tail){
			head = tail = null;
			currentSize--;
			return removedNodeData;
		}
		
		removedNodeData = tail.data;
		tail.preNode.nextNode = null;
		tail = tail.preNode;
		
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
	public void printUsingIterator(DoublyLinkedList<T> linkedList) {
		
		for(T nodeData : linkedList) {
			System.out.println(nodeData+"==>");
		}
		
		System.out.println("NULL");
	}

	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>() {
			
			Node<T> index = head;
			
			@Override
			public boolean hasNext() {
				return index !=null;
			}

			@Override
			public T next() {
				if(!hasNext())
					throw new NoSuchElementException();
				T element = index.data;
				index = index.nextNode;
				return element;
			}
			
		};
	}

}
