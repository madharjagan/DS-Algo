package me.learning.ds.linkedlist;

public class LinkedListClient {

	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.insertNodeAtEnd(lList, 1);
		lList.insertNodeAtEnd(lList, 2);
		lList.insertNodeAtEnd(lList, 4);
		lList.insertNodeAtPosition(lList, 3, 2);
		lList.printLinkedList(lList);
	}

}
