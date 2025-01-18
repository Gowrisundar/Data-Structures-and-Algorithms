package com.gowri.leetcode.medium;

public class SumOFTwoIntegersWithoutAddOperator {
	
	public int getSum(int a, int b) {
        while(b!=0) {
            int sum = a^b;
            int carry = a&b;
            a=sum;
            b=carry<<1;
        }

        return a;
    }

}
