package com.shiv.freshToHome;

import java.awt.image.RescaleOp;
import java.util.Arrays;

public class PackagingProblem {

	public static void main(String[] args) {		
		int[] workersAndItems = new int[] {4, 17};
		int[] time = new int[] {7, 11, 13, 9};
		int totalTime =  getMinimumTime(workersAndItems, time);	
		System.out.println("Total Time : " + totalTime);
	}

	private static int getMinimumTime(int[] workersAndItems, int[] time) {
		
		int counter = 1;
		// N workers
		int[] tempCal = new int[workersAndItems[0]];
		// Iterate for M items
		while (counter < workersAndItems[1]) {
			int min = Integer.MAX_VALUE;
			int index = 0;
			// Iterate for N workers
			// Create Memo Matrix, when the time is less then add the Total per day time and update it 
			for (int i = 0; i < tempCal.length; i++) {
				int temp = 0;
				if (tempCal[i] == 0) {
					temp = time[i];
				} else {
					temp = tempCal[i];
				}
				if (temp < min) {
					min = temp;
					index = i;
				}
			}
			tempCal[index] =  tempCal[index] == 0 ? min : min + time[index];
			counter++;
		}
		int minTime = Integer.MIN_VALUE;
		for (int i : tempCal) {
			if (i > minTime ) {
				minTime = i;
			}
		}
		return minTime;
	}
}
