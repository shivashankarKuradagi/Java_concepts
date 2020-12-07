package com.shiv.string;

public class LongestSubString {

	public static void main(String[] args) {
		
		String s = "aaabbaa";
		
		String ans = longestSubString(s);
		
		System.out.println("ANS : " + ans);
		
		
	}

	private static String longestSubString(String s) {
		char[] str = s.toCharArray();
		int[][] temp = new int[s.length()][s.length()];
		int start = 0;
		int end = 1;
		for(int i =0; i < s.length(); i++ ) {
			temp[i][i] = 1;
			temp[start][end] = (str[start] == str[end] ? 1 : 0);
			start++;
			end++;
		}
		
		int count = s.length() -2;
		
		while(count < s.length()) {
			start =0;
			end = count +1;
			while (end < s.length()) {
				if(str[start] == str[end] && str[start+1] == str[end-1]) {
					temp[start][end] = 1;
				}	
				start++;
				end++;
			}
		}
		int max = 0 ;
		
		/*
		 * for (int i = 0; i < temp.length; i++) {
		 * 
		 * temp[i][temp.length -1];
		 * 
		 * }
		 */
		
		
		return null;
	}

}
