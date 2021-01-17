package com.shiv.freshToHome;

import java.util.Arrays;
import java.util.List;

public class airbnb {

	public static void main(String[] str) {
		System.out.println(minimumCandiesPerHour(Arrays.asList(4, 9, 11, 17), 8));

	}

	public static int minimumCandiesPerHour(List<Integer> candyPiles, int numHours) {

		// Write your code here
		int ans = 0;
		boolean gotans = true;
		int temp = 1;
		int[] a = new int[candyPiles.size()];
		while (gotans) {
			int j = 0;
			int i = 0;
			for (int m = 0; m < candyPiles.size(); m++) {
				a[m] = candyPiles.get(m);
			}
			while (i < numHours) {
				if (a[j] > 0) {
					a[j] = a[j] - temp;
					i++;
				} else {
					j++;
					i++;
					if (j == candyPiles.size()) {
						break;
					}
					a[j] = a[j] - temp;

				}
			}
			if (a[candyPiles.size() - 1] < 0) {
				break;
			}
			temp++;
		}
		return temp;
	}
}