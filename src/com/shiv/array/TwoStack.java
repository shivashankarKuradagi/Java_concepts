/**
 * 
 */
package com.shiv.array;

/**
 * @author shivshankar
 *
 */
public class TwoStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{7,15,12,0,5,18,17,2,10,15,4,2,9,15,13,12,16};
		int[] b = new int[]{12,16,6,8,16,15,18,3,11,0,17,7,6,11,14,13,15,6,18,6,16,12,16,11,16,11};
		System.out.println(twoStacks(62, a, b));

	}

	static int twoStacks(int x, int[] a, int[] b) {
		int count = 0;
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] > b[j]) {
				count = count+a[i];
				i++;
			} else {
				count = count+b[j];
				j++;
			}
			if (count > x) {
				break;
			}
		}
		if (count < x && j < a.length) {
			while (j < b.length) {
				count = count+b[j];
				j++;
				if (count > x) {
					break;
				}
			}
		}
		if (count < x && b.length == 0) {
			while (j < a.length) {
				count = count+a[i];
				i++;
				if (count > x) {
					break;
				}
			}
		}
		return i+j;
	}

}
