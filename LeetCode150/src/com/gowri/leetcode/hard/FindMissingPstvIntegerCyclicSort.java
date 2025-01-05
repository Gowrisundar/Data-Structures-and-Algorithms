package com.gowri.leetcode.hard;

public class FindMissingPstvIntegerCyclicSort {
	
	public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int res = nums.length;
        for(int i=0; i<n; i++) {
            while(nums[i] >= 1 && nums[i] <=n && nums[i] != nums[nums[i]-1]) {
                int temp = nums[i];
                nums[i] = nums[nums[i]-1];
                nums[temp-1] = temp;
            }
        }

        for(int i=0; i<n; i++) {
            if(nums[i] != i+1) {
                res = i+1;
                return res;
            } 
        }

        return res+1;
        
    }

}
