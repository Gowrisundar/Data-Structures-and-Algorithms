package com.gowri.leetcode.easy;

public class MajorityElement {
	
	public int majorityElement(int[] nums) {
        int res = Integer.MIN_VALUE;
        int count = 0;

        for(int i =0; i< nums.length; i++) {
            if(count == 0) {
                res = nums[i];
            }
            if(nums[i] == res) {
                count++;
            } else {
                count--;
            }
        }

        return res;

        
    }

}
