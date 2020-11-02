package com.shiv.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[] a = new int[] {2,7,11,15};
		
		int[] ans = twoSum(a, 9);
		System.out.println(Arrays.toString(ans));
		
		
	}

	private static int[] twoSum(int[] a, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			if(map.containsKey(target-a[i])) {
				return new int[] {map.get(target-a[i]), i};
			} 
			map.put(a[i], i);
		}
		return null;
	}

}
