/**
 * 
 */
package com.shiv.string;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shivshankar
 *
 */
public class Anagram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(isAnagram("aacc", "ccac"));
	}

	 public static boolean isAnagram(String s, String t) {
	        
	        if(null == s || null == t){
	            return false;
	        }
	        
	        if(s.length() != t.length()){
	            return false;
	        }
	            
	        
	        Map<Character,Integer> map = new HashMap<Character,Integer>();
	        
	        for(int i=0; i < s.length(); i++){
	            if(map.containsKey(s.charAt(i))){
	                map.put(s.charAt(i),map.get(s.charAt(i)) +1 );
	            } else {
	                map.put(s.charAt(i), 1);   
	            }
	        }
	        
	                
	        for(int i=0; i < t.length(); i++){
	            if(map.containsKey(t.charAt(i))){
	                map.put(s.charAt(i), map.get(t.charAt(i)) -1);   
	            } else {
	               return false;
	            }
	        }
	        
	        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
	            if(entry.getValue() != 0){
	                return false;
	            }
	        }

	        return true;
	        
	    }

	
}
