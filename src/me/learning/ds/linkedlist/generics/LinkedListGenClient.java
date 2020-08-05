package me.learning.ds.linkedlist.generics;

public class LinkedListGenClient {

	public static void main(String[] args) {
		LinkedList<Integer> lList = new LinkedList<>();
		lList.addNodeAtEnd(1);
		lList.addNodeAtBegin(2);
		lList.addNodeAtEnd(4);
		//lList.insertNodeAtPosition(lList, 3, 2);
		lList.printLinkedList();
		System.out.println("Removed Item:"+ lList.removeLast());
		lList.printLinkedList();
		System.out.println("Removed Item:"+ lList.remove(2));
		lList.printLinkedList();
		System.out.println("Removed Item:"+ lList.removeLast());
		lList.printLinkedList();
		
		/*LinkedList<String> lStringList = new LinkedList<>();
		lStringList.addNodeAtEnd("Jagan");
		lStringList.addNodeAtBegin("Rethu");
		lStringList.addNodeAtEnd("Devi");
		//lStringList.insertNodeAtPosition(lStringList, "Kalaivani", "Rethu");
		lStringList.printLinkedList();
		System.out.println("Removed Item:"+ lStringList.removeLast());
		lStringList.printLinkedList();
		System.out.println("Removed Item:"+ lStringList.remove("Rethu"));
		lStringList.printLinkedList();
		System.out.println("Removed Item:"+ lStringList.removeLast());
		lStringList.printLinkedList();*/
	}

}
