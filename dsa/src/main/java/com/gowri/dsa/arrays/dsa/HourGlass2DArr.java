package com.gowri.dsa.arrays.dsa;

import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 */

public class HourGlass2DArr {
	
	public static int getMaxSumOfHourGlassFrom(List<List<Integer>> twoDimArr) {
		//We don't know how much negative value can be there, Initializing to Zero 
		//result in negative numbers always fail because Zero is always greater than negative number
		//So initialize to minimum value integer to make sure max negative number will replace the min negative number
		int max_sum = Integer.MIN_VALUE; 
	    int curr_sum = 0;
	    
	    for(int i=0; i<4; i++) {
	        for(int j=0; j<4; j++) {
	            curr_sum = twoDimArr.get(i).get(j) + twoDimArr.get(i).get(j+1) + twoDimArr.get(i).get(j+2) 
	            + twoDimArr.get(i+1).get(j+1) + twoDimArr.get(i+2).get(j) + twoDimArr.get(i+2).get(j+1)
	            + twoDimArr.get(i+2).get(j+2);
	            if(curr_sum > max_sum) {
	                max_sum = curr_sum;
	            }
	        }
	    }
	    
	    return max_sum;
	}

}
