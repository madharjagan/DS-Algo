package me.learning.ds.tree.robedwards.trees.avl;

public class AVLTrees<T extends Comparable<T>> {
	
	Node<T> root;
	
    /**
     * Returns the height of the internal AVL tree. It is assumed that the
     * height of an empty tree is -1 and the height of a tree with just one node
     * is 0.
     * 
     * @return the height of the internal AVL tree
     */
    public int height() {
        return height(root);
    }

    /**
     * Returns the height of the subtree.
     * 
     * @param x the subtree
     * 
     * @return the height of the subtree.
     */
    private int height(Node<T> x) {
        if (x == null) return -1;
        return x.height;
    }
		
	public void addNode(T value) {
		root = addNode(root, value);
	}
	
	private Node<T> addNode(Node<T> tree, T value) {
		if(tree == null)
			return new Node<>(value);
		if(value.compareTo(tree.data)>0) {
			tree.right = addNode(tree.right,value);
		} else {
			tree.left = addNode(tree.left, value);
		}
		tree.height = 1+ Math.max(height(tree.left), height(tree.right));
		return balance(tree);
		//checkBalance(tree);
	}
	
    /**
     * Restores the AVL tree property of the subtree.
     * 
     * @param x the subtree
     * @return the subtree with restored AVL property
     */
    private Node<T> balance(Node<T> x) {
        if (balanceFactor(x) < -1) {
            if (balanceFactor(x.right) > 0) {
                x.right = rotateRight(x.right);
            }
            x = rotateLeft(x);
        }
        else if (balanceFactor(x) > 1) {
            if (balanceFactor(x.left) < 0) {
                x.left = rotateLeft(x.left);
            }
            x = rotateRight(x);
        }
        return x;
    }
    
    /**
     * Returns the balance factor of the subtree. The balance factor is defined
     * as the difference in height of the left subtree and right subtree, in
     * this order. Therefore, a subtree with a balance factor of -1, 0 or 1 has
     * the AVL property since the heights of the two child subtrees differ by at
     * most one.
     * 
     * @param x the subtree
     * @return the balance factor of the subtree
     */
    private int balanceFactor(Node<T> x) {
        return height(x.left) - height(x.right);
    }
	
    /**
     * Rotates the given subtree to the right.
     * 
     * @param x the subtree
     * @return the right rotated subtree
     */
    private Node<T> rotateRight(Node<T> x) {
        Node<T> y = x.left;
        x.left = y.right;
        y.right = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }

    /**
     * Rotates the given subtree to the left.
     * 
     * @param x the subtree
     * @return the left rotated subtree
     */
    private Node<T> rotateLeft(Node<T> x) {
        Node<T> y = x.right;
        x.right = y.left;
        y.left = x;
        x.height = 1 + Math.max(height(x.left), height(x.right));
        y.height = 1 + Math.max(height(y.left), height(y.right));
        return y;
    }
    
	public void printInOrder() {
		printInOrder(this.root);
		System.out.println();
	}
	
	private void printInOrder(Node<T> node) {
		if(node == null)
			return;
		if(node.left != null) {
			printInOrder(node.left);
		}
		System.out.print(node.data);
		if(node.right != null) {
			printInOrder(node.right);
		}		
	}
	
	public void printPreOrder() {
		printPreOrder(this.root);
		System.out.println();
	}
	
	private void printPreOrder(Node<T> node) {
		if(node == null)
			return;
		System.out.print(node.data);
		if(node.left != null) {
			printPreOrder(node.left);
		}
		if(node.right != null) {
			printPreOrder(node.right);
		}		
	}
	
}
