package me.learning.ds.tree.robedwards.trees;

public class BinarySearchTreeClient {

	public static void main(String[] args) {
		BinarySearchTree<Integer> bst = new BinarySearchTree<>();
		bst.addNode(6);
		bst.printInOrder();
		bst.addNode(4);
		bst.addNode(8);
		bst.printInOrder();
	}

}
