package com.gowri.leetcode.easy;

import java.util.HashMap;

public class TwoSum {
	
	public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> intMap = new HashMap<Integer, Integer>();
        for(int i=0; i<n; i++) {
            if(intMap.containsKey(target - nums[i])) {
                return new int[]{intMap.get(target - nums[i]), i};
            } else {
                intMap.put(nums[i], i);
            }
        }
        

        return new int[] {};
    }

}
