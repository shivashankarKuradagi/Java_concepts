package com.shiv.dp;

public class HouseRobberProb {

	public static void main(String[] args) {

		int[] a = new int[] {2,1,1,2 };

		System.out.println("max amount : " + rob(a));
		
		System.out.println("maxLoot amount : " + maxLoot(a, a.length));

	}

	private static int rob(int[] a) {
		int rob1 = a[0];
		if(a.length == 1) {
			return rob1;
		}
		int rob2 = Math.max(rob1, a[1]);
		if (a.length == 2) {
			Math.max(rob1, rob2);
		}
		int max = 0;
		for (int i = 2; i < a.length; i++) {
			/*
			 * if (rob1 + a[i] > rob2) { rob1 = rob1 + a[i]; } else { rob1 = rob2; }
			 */
			max = Math.max(rob1 + a[i], rob2);
			rob1 = rob2;
			rob2 = max;
		}
		return max;
	}
	
	static int maxLoot(int hval[], int n) 
	{ 
		if (n == 0) 
		return 0; 

		int value1 = hval[0]; 
		if (n == 1) 
			return value1; 

		int value2 = Math.max(hval[0], hval[1]); 
		if (n == 2) 
			return value2; 
	
		// contains maximum stolen value at the end 
		int max_val = 0; 

		// Fill remaining positions 
		for (int i=2; i<n; i++) 
		{ 
			max_val = Math.max(hval[i]+value1, value2); 
			value1 = value2; 
			value2 = max_val; 
		} 

		return max_val; 
	} 

}
