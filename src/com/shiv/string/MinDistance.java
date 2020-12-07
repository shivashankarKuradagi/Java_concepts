package com.shiv.string;

public class MinDistance {

	public static void main(String[] args) {
		try {
			System.out.println(getMinEditDistance("shiv", null));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getMinEditDistance(String s1, String s2) {
		int[][] temp = new int[s2.length() + 1][s1.length() + 1];
		for (int i = 0; i < s2.length(); i++) {
			temp[i][0] = i;
		}
		for (int i = 0; i < s1.length(); i++) {
			temp[0][i] = i;
		}
		for (int i = 0; i < s2.length(); i++) {
			for (int j = 0; j < s1.length(); j++) {
				if (s2.charAt(i) == s1.charAt(j)) {
					temp[i + 1][j + 1] = temp[i][j];
				} else {
					temp[i + 1][j + 1] = Math.min(Math.min(temp[i][j], temp[i][j + 1]), temp[i + 1][j]) + 1;
				}
			}
		}
		return temp[s2.length()][s1.length()];
	}

}
