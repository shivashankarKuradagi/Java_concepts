package com.shiv.trees;

public class DiameterOfTree {

	public static void main(String[] args) {
		
				//a1
		//b2    	   c3
	//d4     e5
//f6   g7  h8  i9

		Node f = new Node(6, null, null);
		Node g = new Node(7, null, null);
		Node h = new Node(8, null, null);
		Node i = new Node(9, null, null);
		Node d = new Node(4, f, g);
		Node e = new Node(5, h, i);
		Node b = new Node(2, d, e);
		Node c = new Node(3, null, null);
		Node a = new Node(1, b, c);
		int hight = diameter(a);
		System.out.println(hight);
	}

	private static int diameter(Node node) {
		if (node == null ) {
			return  0;
		}
		int lHight = hight(node.getLeft());
		int rHight = hight(node.getRight());
		int lDiameter = diameter(node.left);
		int rDiameter = diameter(node.right);
		int h = Math.max((lHight + rHight + 1), Math.max(lDiameter, rDiameter));
		System.out.println("Node : " + node.getValue() +", lHight : "+lHight +", rHight : "+ rHight +", lDiameter : "+ lDiameter +", rDiameter : "+ rDiameter + " ,  FinalHight " + h );
		return h;
	}
	
	private static int hight(Node node) {
		int h=0;
		if(node == null) {
			return h;
		}
		int left = hight(node.left);
		int right = hight(node.right);
		if (left > right) {
			h = left+1;
		} else {
			h = right+1;
		}
		//System.out.println("Node : " + node.getValue() + " , Hight" + h );
		return h;
	}
	
}
