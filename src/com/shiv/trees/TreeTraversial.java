package com.shiv.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TreeTraversial {

	public static void main(String[] args) {
		
		int [] arr = new int[] {1, 2, 3, 4, 5, 6};
		
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);
		
		
		System.out.println("########## In Oredr ##########");
		inOrder(root);
		System.out.println();
		System.out.println("######### Pre Order ##########");
		preOrder(root);
		System.out.println();
		System.out.println("######### Post Order ##########");
		postOrder(root);
		System.out.println();
		System.out.println("######### level Order ##########");
		levelOrder(root);
		System.out.println();
		System.out.println("######### zig Order ##########");
		zigZogOrder(root);
	}


	private static void zigZogOrder(Node root) {
		Stack<Node> stack1 = new Stack<Node>();
		Stack<Node> stack2 = new Stack<Node>();
		stack1.push(root);
		boolean leftToright = false;
		while (!stack1.isEmpty()) {
			Node node = stack1.pop();
			System.out.print(node.value + ", ");
			if (!leftToright) {
				if (node.left != null) {
					stack1.push(node.left);	
				}
				if (node.right != null) {
					stack1.push(node.right);
				}
			} else {
				if (node.right != null) {
					stack2.push(node.right);
				}
				if (node.left != null) {
					stack2.push(node.left);	
				}
			}
			if (stack1.isEmpty()) {
				leftToright = !leftToright;
				Stack<Node> temp = stack1;
				stack1 = stack2;
				stack2 = temp;
			}
		}
	}


	private static void levelOrder(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.print(node.value + ", ");
			if (node.left != null) {
				queue.add(node.left);
			}

			if (node.left != null) {
				queue.add(node.right);
			}

		}
	}

	private static void postOrder(Node node) {
		if (node == null) {
			return;
		}
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.value + ", ");
	}

	private static void preOrder(Node node) {
		
		if (node == null) {
			return;
		}
		System.out.print(node.value + ", ");
		
		preOrder(node.left);
		preOrder(node.right);
		
	}

	private static void inOrder(Node node) {
		if (node == null) {
			return;
		}
		inOrder(node.left);
		System.out.print(node.value +  ", ");
		inOrder(node.right);
	}
	
	
	
	

}
