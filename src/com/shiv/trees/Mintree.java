/**
 * 
 */
package com.shiv.trees;

/**
 * @author shivshankar
 *
 */
public class Mintree {

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
		System.out.println(minValue(root));
	}
	
    static int  minValue(Node node)
    {
        if(node.left == null){
            return node.getValue();
        }
        
        return minValue(node.left);
    }

}
