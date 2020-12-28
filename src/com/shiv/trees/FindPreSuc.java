/**
 * 
 */
package com.shiv.trees;

import java.util.Stack;

/**
 * @author shivshankar
 *
 */
public class FindPreSuc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		//root.right.left = new Node(null);
		root.right.right = new Node(18);
		
		int p =0;
		int s = 0;
		int key = 8;
		findPreSuc(root, p, s, key);
		System.out.println(p + " cvsdc "+ s);

	}

    public static void findPreSuc(Node root, int  p, int s, int key)
    {
       // add your code here
    	
    	p= Integer.MIN_VALUE;

    	s= Integer.MAX_VALUE;
    	
    	Stack<Node> stack = new Stack<Node>();
    	
    	
    	while (true) {
    		
    		while (root != null) {
				stack.push(root);
				root = root.getLeft();
			}
    		
    		if (stack.isEmpty()) {
				break;
			}
    		root = stack.pop();
    		int data = root.getValue();
			if (data > p && data < key) {
				p = data;
			}

			if (data < s && data > key) {
				s = data;
			}
    	    root = root.right;
		}
       
    }
	
	
}
