package com.gowri.leetcode.medium;

public class MaximumCircularSubArray {
	
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currMaxSum = 0;
        int currMinSum = 0;
        int maxSum = nums[0];
        int minSum = nums[0];

        for(int i =0; i<nums.length; i++) {
            currMaxSum = Math.max(currMaxSum + nums[i], nums[i]);
            maxSum = Math.max(currMaxSum, maxSum);

            currMinSum = Math.min(currMinSum + nums[i], nums[i]);
            minSum = Math.min(currMinSum, minSum);

            totalSum += nums[i];
        }

        int normalSum = maxSum;

        if(minSum == totalSum) {
            return normalSum;
        }
        int circularSum =totalSum - minSum;

        return Math.max(normalSum, circularSum);

        
    }

}
