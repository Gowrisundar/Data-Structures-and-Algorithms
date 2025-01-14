package com.gowri.leetcode.easy;

public class HammingWeightSetBits {
	
	public int hammingWeight(int n) {

        int count = 0;
            
            while(n != 0){
                n = n & (n - 1);
                count++;
            }
            
            return count;
        
    }

}
