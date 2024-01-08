package com.gowri.dsa.algorithm;

/**
 * @author gowrisundarsuriyanarayanan
 */
public class JugglingAlgorithmRightRotation {
	
	public int[] rotate(int[] nums, int k) {
        int arrLen = nums.length;
        k = k%arrLen;
        k = arrLen - k;
        for(int i=0; i<gcd(arrLen, k); i++) {    
            int j=arrLen-i-1, temp = nums[arrLen-i-1];
            while(true) {
                int d = (j+k) % arrLen;
                if(d==arrLen-i-1) {
                    break;
                } else {
                    nums[j] = nums[d];
                    j = d;
                }
            }
            nums[j] = temp;
        }
        return nums;
    }

    public int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
