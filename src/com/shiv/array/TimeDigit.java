package com.shiv.array;

import java.util.HashMap;
import java.util.Map;

public class TimeDigit {

	
	public static void main(String[] args) {
		
		int[] arr = new int[] {0,0,0,8};		
		System.out.println(getTime(arr));
		
	}

	private static String getTime(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int j=0; j< arr.length; j++) {

			if (map.containsKey(arr[j])) {
				map.put(arr[j], map.get(arr[j])+1);
			}else {
				map.put(arr[j], 1);
			}
		}
		
		
		int num = GetDigit(map, 2);
		String str = "";
		if (num < 0) {
			return str;
		} else if (num == 2) {
			str = str + num + GetDigit(map, 3);
		} else {
			str = str + num + GetDigit(map, 9);
		}
		str = str + GetDigit(map, 5);
		str = str + GetDigit(map, 9);
		System.out.println(str);
		
		return str;
	}

	private static int GetDigit(Map<Integer, Integer> map, int maxDigit) {
		int max =0;
		
		while (maxDigit > 0) {
			for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
				if(entry.getKey() == maxDigit && entry.getValue() > 0) {
					map.put(entry.getKey(), (entry.getValue()- 1))   ;
					return maxDigit;
				}	
			}
			maxDigit--;
		}
		
		

		return maxDigit;
	}
	
}
