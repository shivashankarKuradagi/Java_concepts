/**
 * 
 */
package com.shiv.dp;

/**
 * @author shivshankar
 *
 */
public class LongestIncreatingSubsequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] {59,93,22,84,42,61,92,7,38};
		System.out.println(longestSubsequence(a.length, a));
	}
	
    static int longestSubsequence(int n, int a[]){
        int[] t = new int[n];
        for(int i=0;i<n;i++){
            t[i] = 1;
        }
        int max  = 1;
        for(int i = 1; i< n; i++){
            for(int j=0; j < i; j++){
            
                if(a[i] > a[j] && t[i] < (t[j] + 1)){
                    t[i] =  t[j] + 1 ;
                    max = Math.max(t[i], max);
                }
            }
        }
        return max;
    }

}
