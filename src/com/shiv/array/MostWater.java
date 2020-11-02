package com.shiv.array;

public class MostWater {

	public static void main(String[] args) {
		int[] a = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(a.length);
		
		System.out.println(maxArea(a));
	}

	private static int maxArea(int[] a) {
		 int n = a.length-1;
	        int i = 0;
	        int j = a.length-1;
	        int area = 0;
	        
	        while(i<=j){
	            int temp = 0;
	            if(a[i] <= a[j]){
	               temp = a[i] * n;
	                i++;
	            } else {
	                temp = a[j] *n ;
	                j--;
	            }
	            n--;
	            area = temp > area ? temp : area;
	        }
	        
	        return area;
	}

}
