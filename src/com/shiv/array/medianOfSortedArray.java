package com.shiv.array;

import java.util.Stack;

public class medianOfSortedArray {

	public static void main(String[] args) {
		int[] n1 = new int[] {1,4,8,9};
		int[] n2 = new int[] {2,3,5,6,10};
		Stack<Character> st = new Stack<Character>();
		
		System.out.println("ans : "+ medianOfTwoArrays(n1, n2));
	}

	private static double medianOfTwoArrays(int[] n1, int[] n2) {
        int n = n1.length;
        int m = n2.length;
        boolean even =( (n+m) % 2 == 0 );
        int middle = (n+m)/2;
        int i =0;
        int j =0;
        double element = 0L;
        if(even){
            int temp =2;
            middle = middle +1;
            while(middle > temp){
                if(n1[i]<n2[j]){
                	i++;
                }else{
                    j++;
                }
                temp++;
            }
            double sum =0;
            if(n1[i] > n2[j]){
            	sum = n1[i] + (n1[--i] > n2[j] ?  n1[i] :n2[j]);
            } else {
            	sum = n2[j] + (n1[i] > n2[--j] ?  n1[i] :n2[j]);
            }
            element = sum/2;
            
        }else {
            int temp =2;
            middle = middle +1;
            while(middle > temp){
                if(n1[i]<n2[j]){
                	i++;
                }else{
                    j++;
                }
                temp++;
            }
            element = n1[i] > n2[j] ? n1[i] : n2[j];
            
        }
        
		return element;
	}
	
	
}
