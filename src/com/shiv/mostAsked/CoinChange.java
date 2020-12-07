package com.shiv.mostAsked;

import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		
		int[] coins = new int[] {186,419,83,408};
		
		for (int i : coins) {
			System.out.println(i);
		}
		
		//System.out.println("result : " + coinChange(coins, 6249));

	}
	
	
    public static int coinChange(int[] coins, int amount) {
    	if(amount == 0) {
    		return 0;
    	}
    	
    	if(coins.length == 0) {
    		return -1;
    	}
    	
        Arrays.sort(coins);
        
        int i=coins.length -1;
        int temp = amount;
        int res = 0;
        while(i > -1){
            
            if(temp < coins[i]){
                i--;
                continue;
            }
            int val = 0;
            val = temp / coins[i];
            res = res + val;
            temp = temp - (coins[i] * val);
            
            if(temp == 0){
                break;
            }
            i--;
        }
        return temp == 0 ? res : -1;
    }

}
