package com.shiv.freshToHome;

public class EggProblem {

	public static void main(String[] args) {

		int[][] soldEggs = {{79,82,42,44,43,55,62,87,85,88,89,81},{81,77,45,41,39,48,71,78,81,84,82,72},{77,53,33,32,49,53,68,71,0,0,0,0}};
		
		System.out.println(getEggsCount(soldEggs));
		
	}

	private static int getEggsCount(int[][] soldEggs) {
		int count = 0;
		int length = soldEggs.length;
		// perdect 3rd day 6PM to 10PM eggs data  based on the previous 2 days data
		for (int i = 8; i < soldEggs[0].length; i++) {
			soldEggs[length-1][i] = (soldEggs[length-3][i] + soldEggs[length-2][i])/2; 
		}
		
		// Predect  next day total eggs count based on the previous 2 days data
		for (int i = 0; i < soldEggs[0].length; i++) {
			count = count + (soldEggs[length-1][i] + soldEggs[length-2][i])/2; 
		}
		
		return count;
		
	}

	private static void predect6To10Eggs(int[][] soldEggs) {
		

		
	}

}
