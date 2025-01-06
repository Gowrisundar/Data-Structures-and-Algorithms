package com.gowri.leetcode.easy;

public class MoveZeros {
	
	public void moveZeroes(int[] nums) {
        int currPtr = 0;
        int n = nums.length;

        for(int i=0; i< n; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[currPtr];
                nums[currPtr] = temp;
                currPtr++;
            }
        }
        
    }

}
