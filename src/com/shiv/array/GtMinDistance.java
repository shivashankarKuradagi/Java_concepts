/**
 * 
 */
package com.shiv.array;

import java.util.Arrays;
import java.util.Stack;

import com.shiv.trees.Node;

/**
 * @author shivshankar
 *
 */
public class GtMinDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[] arr = {2,6,3,4,7,2,10,3,2,1};
		System.out.println(getMinDiff(arr, 10, 5));

	}
	
	
    static int getMinDiff(int[] arr, int n, int k) {

    	
    	
        Arrays.sort(arr);
        
        int min = arr[0];
        int max = arr[n-1];
        int mid = (max + min )/2;
        
        int i = 0;
        while(i < n){
            if(arr[i] < mid){
                arr[i] = arr[i]+k;
            }else{
                arr[i] = (arr[i]-k) < 0 ? arr[i] : arr[i]-k;
            } 
            i++;
        }
        Arrays.sort(arr);
        return arr[n-1] - arr[0];
        
    }

}
