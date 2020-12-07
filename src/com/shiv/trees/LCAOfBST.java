package com.shiv.trees;

public class LCAOfBST {

	public static void main(String[] args) {
		int [] arr = new int[] {1, 2, 3, 4, 5, 6};
		
		//					1
		//			2				3
		//		4		5		6		7
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		System.out.println(lca(root, root.left.left, root.left.right)); 
	}

	private static Node lca(Node root, Node i, Node j) {
		if(root == null) {
			return null;
		}
		if (root == i || root == j) {
			return root;
		}
		Node left = lca(root.getLeft(), i, j);
		Node right = lca(root.getRight(), i, j);
		
		if (left != null && right != null) {
			return root;
		} 
		
		return left == null ? right : left;
	}

}
