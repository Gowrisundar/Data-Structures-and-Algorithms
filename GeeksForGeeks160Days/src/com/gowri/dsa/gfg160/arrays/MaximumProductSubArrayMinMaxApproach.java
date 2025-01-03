package com.gowri.dsa.gfg160.arrays;

public class MaximumProductSubArrayMinMaxApproach {
	
	public int maxProduct(int[] nums) {

        int n = nums.length;

        int currMin = nums[0];
        int currMax = nums[0];
        int maxProd = nums[0];

        for(int i=1; i<n; i++) {
            int temp = Math.max(nums[i], Math.max(nums[i]*currMin, nums[i]*currMax));
            currMin = Math.min(nums[i], Math.min(nums[i]*currMin, nums[i]*currMax));
            currMax = temp;
            maxProd = Math.max(maxProd, currMax);
        }

        return maxProd;
	}

}
