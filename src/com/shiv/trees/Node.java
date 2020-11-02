package com.shiv.trees;

public class Node {
	
	int value;
	Node left;
	Node right;
	
	
	
	public Node(int value, Node left, Node right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}
	
	public Node() {
	}
	
	public int getValue() {
		return value;
	}
	public Node(int value) {
		super();
		this.value = value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
}
