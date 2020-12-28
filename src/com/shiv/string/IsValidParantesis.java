/**
 * 
 */
package com.shiv.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/**
 * @author shivshankar
 *
 */
public class IsValidParantesis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(ispar("{[(])}"));
	}

	
	static boolean ispar(String x)
	{
	        List<String> list = Arrays.asList("}",")","]");
	        Map<String, String> map = new HashMap<String, String>();
	        map.put("{","}");
	        map.put("(",")");
	        map.put("[","]");
	        Stack<String> par = new Stack<String>();
	        
	        for(int i=0; i< x.length(); i++){
	            String s = x.charAt(i) + "";
	            if(list.contains(s)){
	            	if(par.size() == 0) {
	            		return false;
	            	}
	            	
	            	if (!s.equals(map.get(par.pop()))) {
						return false;
					}
	            }else {
	            	par.push(s);
	            }
	            
	        }
			return par.size()==0;
	        
	        
	}
}
