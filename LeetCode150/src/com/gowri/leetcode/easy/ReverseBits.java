package com.gowri.leetcode.easy;

public class ReverseBits {
	
	public int reverseBits(int n) {
        int ans =0;
        for (int i =0; i< 32; i++) {
            int bit = n&1;
            ans = (ans<<1) | bit;
            n >>=1;
        }
        return ans;
    }

}
