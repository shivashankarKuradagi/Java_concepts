/**
 * 
 */
package com.shiv.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author shivshankar
 *
 */
public class WordBreak {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("i", "like", "sam", "sung", "samsung", "mobile",
				"ice","cream", "icecream", "man", "go", "mango" );
		
		System.out.println( wordBreak("ilikesamsung", list ));
		System.out.println( wordBreakDP("ilikesamsung", list ));
	}

	
	 public static boolean wordBreakDP(String A, List<String> B )
	    {
		 	int n = A.length();
		 	boolean dp[] = new boolean[A.length()+1];
		 	dp[0] = true;
		 	
		 	for (int i = 0; i <= n; i++) {
		 		for (int j = 0; j < i; j++) {
					if(dp[j] && B.contains(A.substring(j, i))) {
						dp[i]=true;
						break;
					}
				}
				
			}
		 	
		 	return dp[n];
	        
	    }
	
	
	 public static int wordBreak(String A, List<String> B )
	    {
		 	if(A.length() == 0){
		 		return 1;
		 	}

		 	for(String str : B) {
		 		if (A.startsWith(str)) {
				return	wordBreak(A.substring(str.length()), B);
				}
		 	}
		 	return 0;
	        
	    }
}
