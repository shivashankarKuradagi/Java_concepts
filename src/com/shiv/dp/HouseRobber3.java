/**
 * 
 */
package com.shiv.dp;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import com.shiv.trees.Node;

/**
 * @author shivshankar
 *
 */
public class HouseRobber3 {

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
		root.left.left.left = new Node(20);
		root.left.right.right = new Node(7);
		
		//System.out.println(maxRob(root));
		System.out.println(rob(root));
		
	}
	
	
    public static int rob(Node root) {
        
        if(root == null){
            return 0;
        }
        
        int val = 0;
        
        if(null != root.left){
            val += ((null == root.left.left) ? 0 : root.left.left.getValue()) + ((null == root.left.right) ? 0 : root.left.right.getValue());
        }
        
        if(null != root.right){
            val +=  ((null ==  root.right.left) ?  0: root.right.left.getValue()) + ((null == root.right.right) ? 0 : root.right.right.getValue());
        }
        
       return Math.max(root.getValue() + val, rob(root.left) + rob(root.right));
        
    }

	

	private static int maxRob(Node root) {
		
		if (root == null) {
			return 0;
		}
		
		Queue<Node> list = new LinkedList<Node>();
		list.add(root);
		
		int lev0 = 0;
		int lev1 = 0;
		boolean even = false;
		
		while (!list.isEmpty()) {
			
			Queue<Node> temp = new LinkedList<Node>();
			
			while (!list.isEmpty()) {
				temp.add(list.poll());
			}
			
			while (!temp.isEmpty()) {
				Node n1 = temp.poll();
				if (even) {
					lev0 = lev0 + n1.getValue();
				} else {
					lev1 = lev1 +  n1.getValue();	
				}
				if (null != n1.getLeft()) {
					list.add(n1.left);
				}
				if (null != n1.getRight()) {
					list.add(n1.right);
				}
			}
			even = !even;
		}
		
		return Math.max(lev0,  lev1);
	}

}
