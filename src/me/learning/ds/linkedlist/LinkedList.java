package me.learning.ds.linkedlist;

public class LinkedList {
	
	Node head = null;
	
	public LinkedList insertNodeAtEnd(LinkedList lList, Integer data) {
		Node temp = new Node();
		temp.data = data;
		temp.nextNode = null;
		if(lList.head == null)
			lList.head = temp;
		else {
			Node lastNode = lList.head;
			while(lastNode.nextNode != null) {
				lastNode = lastNode.nextNode;
			}
			lastNode.nextNode = temp;
		}
		
		return this;
	}
	
	public LinkedList insertNodeAtPosition(LinkedList lList, Integer data, Integer value) {
		Node temp = new Node();
		temp.data = data;
		temp.nextNode = null;
		if(lList.head == null)
			lList.head = temp;
		else {
			Node node = lList.head;
			while(node.data != value) {
				node = node.nextNode;
			}
			temp.nextNode = node.nextNode;
			node.nextNode = temp;			
		}
		
		return this;
	}
	
	public void printLinkedList(LinkedList lList) {		
		Node node = lList.head;
		while(node.nextNode != null) {
			System.out.println(node.data+":"+node.nextNode+"-->");
			node = node.nextNode;
		}
		System.out.println(node.data+":"+node.nextNode);
	}
	
	
}
