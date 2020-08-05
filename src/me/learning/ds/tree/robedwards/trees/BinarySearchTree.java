package me.learning.ds.tree.robedwards.trees;

/*
 * In Binary tree, each Node will have two child Node. More than two Nodes are not allowed
 * Binary Search tree is type of Binary tree with below conditions. 
 * 		-the value of the left node should be less than root node
 * 		-the value of the right node should be greater than root node
 * Plain Binary Tree and Binary Search Tree is not balanced trees. We use rotations to balance a tree.
 * AVL, Red-Black, 2-3 trees are balanced trees  
 */

public class BinarySearchTree<T extends Comparable<T>> {
	
	Node<T> root;
	
	public void addNode(T value) {
		this.root = addNode(root, value);
	}
	
	private Node<T> addNode(Node<T> tree, T value) {
		if(tree == null)
			return new Node<>(value);
		if(value.compareTo(tree.data)>0) {
			if(tree.right == null)
				tree.right = new Node<>(value);
			else
				addNode(tree.right,value);
		} else {
			if(tree.left == null)
				tree.left = new Node<>(value);
			else
				addNode(tree.left, value);
		}
		return tree;
	}
	
	
	public void printInOrder() {
		printInOrder(this.root);
	}
	
	private void printInOrder(Node<T> node) {
		if(node == null)
			return;
		if(node.left != null) {
			printInOrder(node.left);
		}
		System.out.println(node.data);
		if(node.right != null) {
			printInOrder(node.right);
		}		
	}
	

}
