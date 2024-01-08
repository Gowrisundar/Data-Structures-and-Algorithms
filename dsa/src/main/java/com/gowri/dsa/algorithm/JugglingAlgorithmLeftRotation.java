package com.gowri.dsa.algorithm;

/**
 * @author gowrisundarsuriyanarayanan
 */
public class JugglingAlgorithmLeftRotation {

	public int[] rotate(int[] nums, int k) {
        int arrLen = nums.length;
        for(int i=0; i<gcd(arrLen, k); i++) {    
            int j=i, temp = nums[i];
            while(true) {
                int d = (j+k) % arrLen;
                if(d==i) {
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
