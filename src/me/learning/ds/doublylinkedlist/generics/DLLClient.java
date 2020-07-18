package me.learning.ds.doublylinkedlist.generics;

public class DLLClient {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();
		dll.addNodeAtBegin(1);
		dll.addAtMiddle(2);
		dll.addNodeAtEnd(3);
		//dll.addNodeAtEndWithoutTail(4);
		dll.addNodeAtBegin(0);
		dll.addNodeAtBegin(5);
		dll.printUsingIterator();
		dll.printReverseUsingIterator();
		dll.removeFirst();
		dll.removeLast();
		dll.remove(1);
		dll.printUsingIterator();
		dll.printReverseUsingIterator();
	}

}
