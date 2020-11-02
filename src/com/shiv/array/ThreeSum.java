package com.shiv.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public static void main(String[] args) {

		int[] temp =  new int[]{-1,2,1,-4,-4, 0};
		//System.out.println(threeSum(temp));
		//System.out.println(threeSumClosest(temp, 1));
		int[] nums =  new int[]{1,1,1,2, 2,3};
		removeDuplicates(nums);
	}

	private static List<int[]> threeSum(int[] temp) {
		List<int[]> list = new ArrayList<int[]>();
		return null;
	}

	
    public static int removeDuplicates(int[] nums) {
        int count = 1, index = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[index-1]){
                if(count > 0){
                    nums[index++] = nums[i];
                    count--;
                } 
            } else {
                count = 1; //reset counter
                nums[index++] = nums[i];
            }
        }
        return index;
    }	

    public static int threeSumClosest(int[] n, int target) {
        if(n.length < 3){
            return 0;
        }
        //-1,2,1,-4, -4, 0
        //[-4, -4, -1, 0, 1, 2]
        Arrays.sort(n);
        int result = 0;
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<n.length-2; i++){
            
            int start=i+1;
            int end= n.length -1;
            
            while(start < end){
            
                int temp = Math.abs(Math.abs(n[i] + n[start]+n[end])-Math.abs(target));
                
                if(temp==0){
                    return 0;
                }
                
                if( diff >  temp ){
                    result = (n[i] + n[start]+n[end]);
                    diff = temp;
                }
                if((n[i] + n[start]+n[end]) < target){
                      start++;
                  } else {
                    end --;
                }
                
            }
            
        }
        
        return result;
    }

}
