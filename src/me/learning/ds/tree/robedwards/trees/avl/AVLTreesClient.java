package me.learning.ds.tree.robedwards.trees.avl;

public class AVLTreesClient {

	public static void main(String[] args) {
		AVLTrees<Integer> avltree =  new AVLTrees<>();
		avltree.addNode(4);
		avltree.addNode(10);
		avltree.addNode(12);
		avltree.addNode(2);
		avltree.addNode(8);
		avltree.addNode(9);
		avltree.printPreOrder();
		//output: 84210912
	}

}
