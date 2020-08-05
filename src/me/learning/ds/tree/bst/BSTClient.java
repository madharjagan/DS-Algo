package me.learning.ds.tree.bst;

public class BSTClient {

	public static void main(String[] args) {
		Node<Integer> rootNode = new Node<>(10); 
		rootNode.insert(5);
		rootNode.insert(15);
		rootNode.insert(20);
		rootNode.printInOrder();
		System.out.println(rootNode.contains(5));
		System.out.println(rootNode.contains(50));
		
		
		Node<String> rootStringNode = new Node<>("jagan"); 
		rootStringNode.insert("Devi");
		rootStringNode.insert("Rethu");
		rootStringNode.insert("kalaivani");
		rootStringNode.printInOrder();
	}

}
