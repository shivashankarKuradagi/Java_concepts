/**
 * 
 */
package com.shiv.trees;

import java.util.Stack;

/**
 * @author shivshankar
 *
 */
public class ZigZagTraversial {

	/**
	 * @param args
	 */
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
		zigZagTraversial(a);
		
	}
	
	public static void zigZagTraversial(Node node) {
    	
    	Stack<Node> s1 = new Stack<Node>();
    	Stack<Node> s2 = new Stack<Node>();
        
    	s1.push(node);
    	
    	while (!s1.isEmpty() || !s2.isEmpty()) {
    		
    		while (!s1.isEmpty() ) {
    			Node n1 = s1.pop();
				System.out.println(n1.getValue());
				s2.push(n1.getLeft());
				s2.push(n1.getRight());
    		}
    		
    		while (!s2.isEmpty()) {
    			Node n2 = s2.pop();
	    		System.out.println(n2.getValue());	
	    		if (null != n2.getRight()) {
		    		s1.push(n2.getRight());
				}
	    		if (null != n2.getLeft()) {
	    			s1.push(n2.getLeft());
				}
			}
    		
		}
	}

}
