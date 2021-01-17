/**
 * 
 */
package com.shiv.dp;

/**
 * @author shivshankar
 *
 */
public class LongestCommonSubsiquence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String s2 = "longest";
		String s1 = "stone";
		System.out.println(
		lcs(s1.length(), s2.length(), s1, s2));
		
	}

	public static int lcs(int x, int y, String s1, String s2){
	    int[][] m = new int[x+1][y+1];
	    for(int i=1; i<= x; i++){
	        for(int j=1; j <= y; j++){
	            
	            if(s1.charAt(i-1) == s2.charAt(j-1)){
	                m[i][j] = m[i-1][j-1] + 1;
	            } else{
	                m[i][j] = Math.max(m[i][j-1], m[i-1][j]);
	            }
	        }
	    }
	    return m[x][y];
	}
}
