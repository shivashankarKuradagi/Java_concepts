package com.shiv.trees;

import java.util.Arrays;
import java.util.List;

public class BondaryTraversial {

	public static void main(String[] args) {
					// a1
			//b2    	   c3
		//d4     	e5   n13  o14
	//f6   	g7 	  h8  i9
	   //j10	k11
		  //m12

		/*
		 * Node o = new Node(14, null, null); Node n = new Node(13, null, null); Node m
		 * = new Node(12, null, null); Node k = new Node(11, null, null); Node j = new
		 * Node(10, null, m); Node f = new Node(6, null, j); Node g = new Node(7, null,
		 * null); Node h = new Node(8, k, null); Node i = new Node(9, null, null); Node
		 * d = new Node(4, f, g); Node e = new Node(5, h, i); Node b = new Node(2, d,
		 * e); Node c = new Node(3, n, o); Node a = new Node(1, b, c);
		 * System.out.println("######## LEFT ###########"); getLeftNodes(a);
		 * System.out.println("######## RIGHT ###########"); getRightNodes(a.right);
		 * System.out.println("######## LEAF ###########"); getLeafNode(a);
		 */
		
		System.out.println(getCelebratingEarnings(Arrays.asList(34))); 
		
	}
	
public static int getCelebratingEarnings(List<Integer> ars){
        
        int earnigs = 0;
        
        for (Integer i : ars) {
            
            if (earnigs < 0) {
               earnigs = 0; 
            } 
            earnigs = earnigs + i;
        }
        
        
        return earnigs;
    }

	private static void getLeafNode(Node a) {
		if (a != null) {

			if (a.left != null || a.getRight() != null) {
				getLeafNode(a.getLeft());
				getLeafNode(a.getRight());
			}
			
			if (a.left == null && a.right == null) {
				System.out.println(a.getValue());
			}	
		}

	}

	private static void getLeftNodes(Node a) {
		if (a.left != null) {
			System.out.println(a.getValue());
			getLeftNodes(a.getLeft());
		} else if (a.right !=null) {
			System.out.println(a.getValue());
			getLeftNodes(a.right);
		}
		
	}
	
	private static void getRightNodes(Node a) {
		if (a.right != null) {
			System.out.println(a.getValue());
			getLeftNodes(a.getRight());
		} else if (a.left !=null) {
			System.out.println(a.getValue());
			getLeftNodes(a.left);
		}
		
	}

}
