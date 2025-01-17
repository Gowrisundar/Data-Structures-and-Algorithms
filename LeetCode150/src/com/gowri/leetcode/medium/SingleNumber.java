package com.gowri.leetcode.medium;

public class SingleNumber {
	public int[] singleNumber(int[] nums) {
        if(nums.length == 2) {
            return nums;
        }
        int xOrValue = 0;
        for(int num : nums) {
            xOrValue^=num;
        }

        int[] res = new int[2];
        int diff = xOrValue & -xOrValue;

        for(int num: nums) {
            if((num & diff) == 0) {
                res[0]^=num;
            } else {
                res[1]^=num;
            }
        }

        return res;
}

}
