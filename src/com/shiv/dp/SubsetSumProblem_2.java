package com.shiv.dp;

import java.util.Arrays;

public class SubsetSumProblem_2 {

	public static void main(String[] args) {
		int[] a = new int[] {2,4,11,10,5};
		System.out.println(equalPartition(a.length, a));

	}


	static int equalPartition(int N, int arr[]) {
	    
	    int sum = 0;
	    int length = arr.length;
	    Arrays.sort(arr);
	    for(int i=0; i< length;i++){
	        sum += arr[i]; 
	    }
	    
	    
	    
	    int[][] mm = new int[length+1][sum/2];
	    
        for(int i=0; i< length ; i++){
        	mm[i][0] = 1;
        }
	    
	    
	    for(int i=1; i< length+1 ; i++){
	            for(int j=1; j<= sum/2 ; j++){
	                if(arr[i-1] == j){
	                    mm[i-1][j] = 1;
	                    continue;
	                }else if(i != 0 && arr[i-1] < j){
	                    mm[i][j] = mm[i-1][j];
	                    
	                }else if(i !=0 && j > arr[i-1]){
	                    mm[i][j] = mm[i-1][j] + mm[i-1][j-arr[i-1]] > 0 ? 1 : 0;
	                }
	            }
	        }
	    
	        
	        int count = 0;
	        for(int i=0; i< length ; i++){
	            count = mm[i][sum/2];
	        }
	    
	    return count == 2 ? 1 : 0;
	    
	}	


}
