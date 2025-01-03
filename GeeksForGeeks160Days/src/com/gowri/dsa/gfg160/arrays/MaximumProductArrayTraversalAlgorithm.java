package com.gowri.dsa.gfg160.arrays;

public class MaximumProductArrayTraversalAlgorithm {
	
	int maxProduct(int[] arr) {
        int leftToRight = 1;
        int rightToLeft = 1;
        int n = arr.length;
        int maxPrd = Integer.MIN_VALUE;
        int i,j;
        for(i=0,j = n-1; i < n && j>=0; i++, j--) {
            if(leftToRight == 0) {
                leftToRight = 1;
            }
            if(rightToLeft == 0) {
                rightToLeft = 1;
            }
            
            leftToRight*=arr[i];
            rightToLeft*=arr[j];
            
            maxPrd = Math.max(maxPrd, Math.max(leftToRight, rightToLeft));
            
        }
        
        
        
        return maxPrd;
	}

}
