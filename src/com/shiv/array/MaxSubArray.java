/**
 * 
 */
package com.shiv.array;

import javax.sound.sampled.ReverbType;

/**
 * @author shivshankar
 *
 */
public class MaxSubArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * int[] a = new int[] {-2,1,-3,4,-1,2,1,-5,4}; int s = getMax(a);
		 * System.out.println("max value : " + s); StringBuffer sb = new StringBuffer();
		 * sb.toString();
		 */
		System.out.println(reverse(-2));
	}
	
	 public static int reverse(int x) {

		 int t = x;
		 boolean b  =false;
		 if (x < 0) {
			b= true;
			t = x * -1;
		}
		/*
		 * if(t < 10) { return x; }
		 */
		 Long result = 0L;
	     int digit = t %10;
		 while(t > 0) {
			 result = result * 10 + digit; 
			 t = t/10;
			 digit = t%10;
		 }
		 
		 if (result > Integer.MAX_VALUE ) {
			return 0;
		}
		 
		 return (int) (b ? -1 *result : result);
	    }

	private static int getMax(int[] a) {
		int max = a[0];
		int temp =0;
		int start = 0;
		int end =0;
		int s= 0;
		
		for (int i = 0; i < a.length; i++) {
			temp = temp + a[i];
			if (temp > max) {
				max = temp;
				start = s;
				end = i;
			}
			
			if (temp < 0) {
				temp=0;
				s= i+1;
			}
		}
		
		System.out.println("max : "+ max + " ,start : " + start + " ,end : " + end);
		
		return max;
	}

}
