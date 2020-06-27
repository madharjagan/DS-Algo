package me.learning.ds.linkedlist.generics;

public class LinkedListGenClient {

	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<>();
		lList.insertNodeAtEnd(1);
		lList.insertNodeAtBegin(2);
		lList.insertNodeAtEnd(4);
		//lList.insertNodeAtPosition(lList, 3, 2);
		lList.printLinkedList();
		System.out.println("Removed Item:"+ lList.removeLast());
		lList.printLinkedList();
		System.out.println("Removed Item:"+ lList.removeLast());
		lList.printLinkedList();
		System.out.println("Removed Item:"+ lList.removeLast());
		lList.printLinkedList();
		
		LinkedList<String> lStringList = new LinkedList<>();
		lStringList.insertNodeAtEnd("Jagan");
		lStringList.insertNodeAtBegin("Rethu");
		lStringList.insertNodeAtEnd("Devi");
		//lStringList.insertNodeAtPosition(lStringList, "Kalaivani", "Rethu");
		lStringList.printLinkedList();
		System.out.println("Removed Item:"+ lStringList.removeLast());
		lStringList.printLinkedList();
		System.out.println("Removed Item:"+ lStringList.removeLast());
		lStringList.printLinkedList();
		System.out.println("Removed Item:"+ lStringList.removeLast());
		lStringList.printLinkedList();
	}

}
