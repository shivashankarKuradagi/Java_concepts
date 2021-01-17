/**
 * 
 */
package com.shiv.string;

import java.util.Arrays;
import java.util.List;

/**
 * @author shivshankar
 *
 */
public class LongestPalindromicSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(longestPalindrome("aabmnmbbmn"));
		//System.out.println(getUnique(Arrays.asList("a","b","c","a","a")));
		
		System.out.println(findMaxSubarraySum(Arrays.asList(1L,2L,4L,5L), 10));
		
		//System.out.println(compressedString("abaaa"));
	}

	
	
	private static String compressedString(String str) {
		
		StringBuilder a = new StringBuilder();
		
		int i = 0;
		while (i < str.length()-1) {
			if (str.charAt(i) == str.charAt(i+1)) {
				a.append(str.charAt(i));
				int temp = i;
				while (true && i < str.length()) {
					if(str.charAt(temp) != str.charAt(i)) {
						break;
					}
					i++;
				}
				a.append(i -temp);
			} else {
				a.append(str.charAt(i) );
				i++;
			}
			
		}
		
		if(str.charAt(str.length()-1) != str.charAt(str.length()-2)) {
			a.append(str.charAt(str.length()-1));
		}
		
		return a.toString();
	}



	private static long findMaxSubarraySum(List<Long> list, int sum) {
		
		System.out.println(list.toString());

		long[] arr = new long[list.size()];
		int t = 0;

		if (list.size() == 0) {
			return 0;
		}

		if (list.size() == 1) {
			return list.get(1);
		}

		for (long l : list) {
			arr[t] = l;
			t++;
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));

		long curr_sum = arr[0];
		long max_sum = 0;
		int start = 0;
		for (int i = 1; i < arr.length; i++) {
			if (curr_sum <= sum)
				max_sum = Math.max(max_sum, curr_sum);
			while (curr_sum + arr[i] > sum && start < i) {
				curr_sum -= arr[start];
				start++;
			}
			curr_sum += arr[i];
		}
		if (curr_sum <= sum)
			max_sum = Math.max(max_sum, curr_sum);
		return max_sum;
	}

	/*
	 * 
	 * static int findMaxSubarraySum(int arr[], int n, int sum) { // To store
	 * current sum and // max sum of subarrays int curr_sum = arr[0], max_sum = 0,
	 * start = 0;
	 * 
	 * // To find max_sum less than sum for (int i = 1; i < n; i++) {
	 * 
	 * // Update max_sum if it becomes // greater than curr_sum if (curr_sum <= sum)
	 * max_sum = Math.max(max_sum, curr_sum);
	 * 
	 * // If curr_sum becomes greater than // sum subtract starting elements of
	 * array while (curr_sum + arr[i] > sum && start < i) { curr_sum -= arr[start];
	 * start++; }
	 * 
	 * // Add elements to curr_sum curr_sum += arr[i]; }
	 * 
	 * // Adding an extra check for last subarray if (curr_sum <= sum) max_sum =
	 * Math.max(max_sum, curr_sum);
	 * 
	 * return max_sum; }
	 * 
	 * private static List<String> getUnique(List<String> asList) {
	 * 
	 * Map<String, Integer> map = new HashMap<String, Integer>(); List<String> ans =
	 * new ArrayList<String>(); for (String str : asList) { if
	 * (map.containsKey(str)) { ans.add(str + map.get(str)); map.put(str,
	 * map.get(str) + 1); } else { map.put(str, 1); ans.add(str); } }
	 * 
	 * return ans; }
	 * 
	 * public static String longestPalindrome(String s) {
	 * 
	 * int max = 0; int start = 0; int end = 0; int[][] m = new
	 * int[s.length()][s.length()];
	 * 
	 * for (int i = 0; i < s.length(); i++) { m[i][i] = 1; }
	 * 
	 * for (int i = 0; i < s.length()-1; i++) { m[i][i+1]= s.charAt(i) ==
	 * s.charAt(i+1) ? 2 : 0; }
	 * 
	 * for (int i = 0; i < m.length; i++) {
	 * System.out.println(Arrays.toString(m[i])); }
	 * 
	 * int t = 2; int i = 0; int j = 2; while (t < s.length()) { while(j <=
	 * s.length()-t){ if(s.charAt(i) == s.charAt(j) && m[i+1][j-1] !=0) { m[i][j] =
	 * m[i+1][j-1] + 2;
	 * 
	 * if(max < m[i][j]) { max = m[i][j]; start = i; end = j; } } i++; j++; }
	 * System.out.println("############### t : "+ t); for (int n = 0; n < m.length;
	 * n++) { System.out.println(Arrays.toString(m[n])); } t++; i=0; j=t; }
	 * 
	 * return s.substring(start, end+1); }
	 */

}
