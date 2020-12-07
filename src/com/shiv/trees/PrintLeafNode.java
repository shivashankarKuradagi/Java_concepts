package com.shiv.trees;

import java.util.HashSet;
import java.util.Set;

public class PrintLeafNode {

	public static void main(String[] args) {

					// a1
			//b2    	   c3
		//d4     	e5
//	f6   	g7    h8  i9
//     j10		 k11

		Node k = new Node(11, null, null);
		Node j = new Node(10, null, null);
		Node f = new Node(6, null, j);
		Node g = new Node(7, null, null);
		Node h = new Node(8, k, null);
		Node i = new Node(9, null, null);
		Node d = new Node(4, f, g);
		Node e = new Node(5, h, i);
		Node b = new Node(2, d, e);
		Node c = new Node(3, null, null);
		Node a = new Node(1, b, c);
		Set<Integer> set = new HashSet<Integer>();
		printLeafNode(a, set);
		System.out.println(set);
	}

	private static void printLeafNode(Node node, Set<Integer> set) {
		if (node != null) {
			if (null != node.getLeft()) {
				printLeafNode(node.getLeft(), set);
			}
			if (null != node.getRight()) {
				printLeafNode(node.getRight(), set);
			}
			if (node.left == null && node.right == null) {
				set.add(node.getValue());
				//System.out.println(node.getValue());
			}
		}
	}

}
