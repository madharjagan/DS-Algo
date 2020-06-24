package me.learning.ds.linkedlist.generics;

public class LinkedListGenClient {

	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<>();
		lList.insertNodeAtEnd(lList, 1);
		lList.insertNodeAtEnd(lList, 2);
		lList.insertNodeAtEnd(lList, 4);
		lList.insertNodeAtPosition(lList, 3, 2);
		lList.printLinkedList(lList);
		
		LinkedList<String> lStringList = new LinkedList<>();
		lStringList.insertNodeAtEnd(lStringList, "Jagan");
		lStringList.insertNodeAtEnd(lStringList, "Rethu");
		lStringList.insertNodeAtEnd(lStringList, "Devi");
		lStringList.insertNodeAtPosition(lStringList, "Kalaivani", "Rethu");
		lStringList.printLinkedList(lStringList);
	}

}
