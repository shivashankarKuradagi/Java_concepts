/**
 * 
 */
package com.shiv.array;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author shivshankar
 *
 */
public class Sort012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = new int[] { 0, 2, 1, 2, 0, 0, 1 };

		sort012(a, a.length);
	}

	public static void sort012(int a[], int n) {
		int lo = 0;
		int hi = n - 1;
		int mid = 0, temp = 0;

		System.out.println("@@ lo :" + lo + ", mid :" + mid + ", hi : "+ hi + " | arr : " + Arrays.toString(a));
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}

			System.out.println("lo :" + lo + ", mid :" + mid + ", hi : "+ hi + " | arr : " + Arrays.toString(a));
		}
		System.out.println(a);
	}
}
