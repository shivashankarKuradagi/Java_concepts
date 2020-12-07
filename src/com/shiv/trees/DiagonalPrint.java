package com.shiv.trees;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class DiagonalPrint {

	public static void main(String[] args) {
		
					// a1
			//b2    	   c3
		//d4     e5
	//f6   	g7    h8  i9
		//j10	k11
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
		
		Queue<Node> queue = new LinkedList<Node>();
		printDiagonal(a, queue);
		
	}

	private static void printDiagonal(Node a, Queue<Node> queue) {
		
		if (a != null) {
			queue.add(a);
			System.out.println(a.value);
			printDiagonal(a.getRight(), queue);
		} else if (!queue.isEmpty()) {
			printDiagonal(queue.poll().getLeft(), queue);
		} 
		
		
	}

}
