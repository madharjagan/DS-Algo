package me.learning.ds.linkedlist.generics;



public class LinkedList<T> {
Node<T> head = null;
	
	public LinkedList<T> insertNodeAtEnd(LinkedList<T> lList, T data) {
		Node<T> temp = new Node<>();
		temp.data = data;
		temp.nextNode = null;
		if(lList.head == null)
			lList.head = temp;
		else {
			Node<T> lastNode = lList.head;
			while(lastNode.nextNode != null) {
				lastNode = lastNode.nextNode;
			}
			lastNode.nextNode = temp;
		}
		
		return this;
	}
	
	public LinkedList<T> insertNodeAtPosition(LinkedList<T> lList, T data, T value) {
		Node<T> temp = new Node<>();
		temp.data = data;
		temp.nextNode = null;
		if(lList.head == null)
			lList.head = temp;
		else {
			Node<T> node = lList.head;
			while(node.data != value) {
				node = node.nextNode;
			}
			temp.nextNode = node.nextNode;
			node.nextNode = temp;			
		}
		
		return this;
	}
	
	public void printLinkedList(LinkedList<T> lList) {		
		Node<T> node = lList.head;
		while(node.nextNode != null) {
			System.out.println(node.data+":"+node.nextNode+"-->");
			node = node.nextNode;
		}
		System.out.println(node.data+":"+node.nextNode);
	}

}
