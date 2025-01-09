package com.gowri.leetcode.medium;

public class IncreasingTriplet {
	
	public boolean increasingTriplet(int[] nums) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int n = nums.length;

        if(n < 3) {
            return false;
        }
        

        for(int i=0; i<n; i++) {
            if(nums[i] <= min1) {
                min1 = nums[i];
            } else if(nums[i] <= min2) {
                min2 = nums[i];
            } else {
                return true;
            }
            
        }

        return false;
        
    }

}
