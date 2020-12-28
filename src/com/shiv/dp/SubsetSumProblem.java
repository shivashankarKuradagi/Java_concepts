/**
 * 
 */
package com.shiv.dp;

/**
 * @author shivshankar
 *
 */
public class SubsetSumProblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] {1,5,11};
		System.out.println(equalPartition(a.length, a));
	}

	
    public static int equalPartition(int N, int arr[])
    {
        int sum = 0;
        int max = 0;
        for(int i =0; i < N; i++ ){
            max = Math.max(max, arr[i]);
            sum += arr[i]; 
        }
        return (sum-max) == max ?  1 : 0;
        
    }
}
