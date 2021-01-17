package com.shiv.binarySerch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NonRepetingelementInSortedArray {

	public static void main(String[] args) {

		String s = "abbb*ab*ab*a";
		/*
		 * System.out.println(Arrays.asList(s.split("\\*")));
		 * System.out.println(Math.sqrt(20148714));
		 */
		int[] a = new int[] { 0, 0 };
		int h = a.length;
		//System.out.println(get1Position(a, 0, h / 2, h - 1));

		int[][] maxtri = new int[][] {{0,0,0,0,1,1,1,1}, {0,0,1,1,1,1,1}, {0,0,0,0,0,0,1,1}};
		
		System.out.println(Arrays.toString(getMinPosition(maxtri)));
		
		
		
	}

	private static int[] getMinPosition(int[][] m) {
		
		int[]  res = new int[2];
		
		System.out.println(m.length);
		System.out.println(m[0].length);
		System.out.println(Arrays.toString(m[0]));
		
		int min = m[0].length;
		for (int i = 0; i < m.length; i++) {
			int temp = get1Position(m[i], 0, (m[i].length-1)/2, (m[i].length-1));
			System.out.println("Min : " + temp);
			if(min > temp) {
				min = temp;
				res[0] = i;
				res[1]=min;
			}
			
		}
		return res;
	}

	private static int get1Position(int[] a, int l, int m, int h) {
		
		if(a[l] == 1) {
			return l;
		}
	
		if(a[h] == 0){
			return -1;
		}
		
		while(l <= h) {
			if(a[m] == 0 && a[m+1] == 1) {
				return m+1;
			}
			if(a[m] == 1 && a[m-1] == 1) {
				return m-1;
			}
			if(a[m] == 0) {
				l = m;
				m = l + (h-l)/2;
			}
			if(a[m] == 1) {
				h = m;
				m=h/2;
			}	
			//System.out.println("l : " + l + " , m : " + m + " , h : " + h);
		}
		return -1;
		
	}

	private static int getElement(int[] a, int n) {

		if (a[0] != a[1]) {
			return a[0];
		}

		if (a[n - 1] != a[n - 2]) {
			return a[n - 1];
		}

		int l = 0;
		int h = n - 1;
		int m = 0;

		return -1;
	}

}
