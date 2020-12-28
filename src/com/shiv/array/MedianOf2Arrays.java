/**
 * 
 */
package com.shiv.array;

/**
 * @author shivshankar
 *
 */
public class MedianOf2Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] n1 = new int[] { 1, 3 };
		int[] n2 = new int[] { 2 };

		System.out.println(findMedianSortedArrays(n1, n2));

	}

	public static double findMedianSortedArrays(int[] n1, int[] n2) {

		int a = n1.length;
		int b = n2.length;
		int m = 0;
		int p1 = 0;
		int p2 = 0;
		int median = 0;
		
		if ((a + b) % 2 != 0) {
			m = (a + b) / 2 + 1;
			while (p1 + p2 < m && n1.length  > p1 && n2.length  > p2) {
				if (n1[p1] < n2[p2]) {
					median = n1[p1];
					p1++;
				} else {
					median = n2[p2];
					p2++;
				}
			}

			if (n1.length == p1) {
				while (p2 + p1 > m) {
					median = n2[p2];
					p2++;
				}
			} else if (n2.length  == p2){
				while (p1 + p2 > m) {
					median = n1[p1];
					p1++;
				}

			}
			return median;
		} else {
			m = a + b / 2;
			while (p1 + p2 < m && n1.length  > p1 && n2.length  > p2) {
				if (n1[p1] < n2[p2]) {
					median = n1[p1];
					p1++;
				} else {
					median = n2[p2];
					p2++;
				}
			}

			if (n1.length == p1) {
				while (p2 + p1 > m) {
					median = n2[p2];
					p2++;
				}
			} else if (n2.length  == p2){
				while (p1 + p2 > m) {
					median = n1[p1];
					p1++;
				}

			}
			return median;
		}

	}

}
