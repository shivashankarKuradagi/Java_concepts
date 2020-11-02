package com.shiv.trees;

public class BSTSumRange {

	static int sum =0;
	public static void main(String[] args) {
		Node root = new Node(10);
		root.left = new Node(5);
		root.right = new Node(15);
		root.left.left = new Node(3);
		root.left.right = new Node(7);
		//root.right.left = new Node(null);
		root.right.right = new Node(18);
		//System.out.println("final sum : " + rangeSumBST(root, 7, 15));	

		System.out.println("final sum : " + rangeSumBSTFast(root, 7, 15));	
	}

	private static int rangeSumBSTFast(Node root, int L, int R) {
		if (root == null) {
			return 0;
		}
		if (root.value < L) {
			return rangeSumBSTFast(root.right, L, R);
		}
		if (root.value > R) {
			return rangeSumBSTFast(root.left, L, R);
		}
		return (root.value +
				rangeSumBSTFast(root.left, L, R) + 
				rangeSumBSTFast(root.right, L, R));
	}

	public static int rangeSumBST(Node root, int L, int R) {
        
    	
        if(null == root){
            return 0;
        }
        
        if(L <= root.value && root.value <= R){
            sum = sum + root.value;
        System.out.println("val : " + root.value + " sum : " + sum);
        }
        
        rangeSumBST(root.left, L, R);
        rangeSumBST(root.right, L, R);
        
        return sum;
    }

}
