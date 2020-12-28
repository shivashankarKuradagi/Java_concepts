package com.shiv.string;

import java.util.HashMap;
import java.util.Map;

public class LosngestSubString {

	public static void main(String[] args) {
		System.out.println(longestSubstring("abcad"));
		// System.out.println("idea l : " + getUniqueCharacterSubstring("abcab"));
	}

	private static String longestSubstring(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		int start = 0;
		int end = 0;
		int max = 0;
		int tempMax = 0;
		while (end < str.length()) {
			Character c = str.charAt(end);
			if (!map.containsKey(c)) {
				map.put(c, end);
				tempMax++;
			} else {
				if (tempMax >= max) {
					max = tempMax;
					start = map.get(c);
				}
				map.put(c, end);
			}
			end++;
		}
		if (tempMax > max) {
			max = tempMax;
			start = start + 1;
		}
		System.out.println("Temp Max : " + max);
		System.out.println("String : " + str.substring(start, start + max));
		return str.substring(start, start + max);
	}

	static String getUniqueCharacterSubstring(String input) {
		Map<Character, Integer> visited = new HashMap<>();
		String output = "";
		for (int start = 0, end = 0; end < input.length(); end++) {
			char currChar = input.charAt(end);
			if (visited.containsKey(currChar)) {
				start = Math.max(visited.get(currChar) + 1, start);
			}
			if (output.length() < end - start + 1) {
				output = input.substring(start, end + 1);
			}
			visited.put(currChar, end);
		}
		return output;
	}

}
