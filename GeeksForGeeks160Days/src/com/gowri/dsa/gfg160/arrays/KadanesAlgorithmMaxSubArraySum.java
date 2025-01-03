package com.gowri.dsa.gfg160.arrays;

public class KadanesAlgorithmMaxSubArraySum {
	
	int maxSubarraySum(int[] arr) {

        int maxSum = arr[0];
        int res = arr[0];
        
        for(int i =1; i< arr.length; i++) {
            maxSum = Math.max(maxSum+arr[i], arr[i]);
            res = Math.max(res, maxSum);
        }
        
        return res;
    }

}
