package com.gowri.leetcode.easy;

public class RemoveDuplicatesInSortedArray {
	
	public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int currPtr = 0;
        int currValue = nums[0];

        for(int i=1; i<n; i++) {
            if(nums[i] != currValue) {
                nums[currPtr+1] = nums[i];
                currValue = nums[i];
                currPtr++;
            }
        }

        return currPtr+1;
    }

}
