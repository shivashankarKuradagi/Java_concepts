package com.shiv.matrix;

public class SpiralTraversal {

	public static void main(String[] args) {
		int[][] matrix = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8  }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 }, {21, 22, 23, 24} };
		int c = matrix[0].length;
		int r = matrix.length;
		int k = 0;
		int l = matrix[0].length - 1;
		int m = 0;
		int n = matrix.length - 1;
		int i =0;
		while (k < l && m < n) {
			for (int j = m; j <= n ; j++) {
				System.out.println(matrix[k][j]);
			}
			k++;
			
			for (int j = k; j <= l; j++) {
				System.out.println(matrix[j][n]);
			}
			n--;
			
			for (int j = n; j >= m; j--) {
				System.out.println(matrix[l][j]);
			}
			l--;
			
			for (int j = l; j >= k; j--) {
				System.out.println(matrix[j][m]);
			}
			m++;
		}
	}

}
