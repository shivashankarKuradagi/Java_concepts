/**
 * 
 */
package com.shiv.dp;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author shivshankar
 *
 */
public class MaximumSumIncreasingSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] a = new int[] {27,39,22,35,3,38,48,4,19};
		System.out.println(maxSumIS(a, a.length));
	}
	
	public static int maxSumIS(int a[], int n)  
	{  
		
	    int max = 0;
	    int[] t = new int[n];
	    int[] ind = new int[n];
	    for(int i=0; i < n ; i++){
	        t[i] = a[i];
	        ind[i] = i;
	    }
	    for(int i=1; i < n ; i++){
	        for(int j=0; j < i; j++){
 	            if(a[j] < a[i] && t[i] < t[j]+a[i]){
	                t[i] = t[j]+a[i];
	                ind[i] = j;
	                max = Math.max(max, t[i]);
	            }
	        }
	    }
	    
	    int maxInd = 0;
	    
	    for (int i = 0; i < n; i++) {
			if(t[i] == max) {
				maxInd = i;
				break;
			}
		}
	    
	    List<Integer> list = new ArrayList<Integer>();
    	list.add(a[maxInd]);
	    while(maxInd != 0){
	    	maxInd = ind[maxInd];
	    	list.add(a[maxInd]);
	    }
	    
	    
	    System.out.println(Arrays.toString(ind));
	    System.out.println("List : " + list);
	    return max;
	} 

}
