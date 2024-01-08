package com.gowri.dsa.arrays.ds;

import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * This is a complex solution and end up in n X n loop( Big O is n^2 ). 
 * This solution is not suitable for data structure of large size
 */
public class RotateLeftArraySolutionOne {
	
	public static List<Integer> rotate(int noOfRotation, List<Integer> arrayToBeRotated) {
		List<Integer> rotateList = arrayToBeRotated;
	    int arrSize = arrayToBeRotated.size();
	    for(int rotate = 0; rotate < noOfRotation; rotate++) {
	        int tmp = rotateList.get(0);
	        for(int idx =0; idx < arrSize; idx++) {
	            if(idx==arrSize-1) {
	                rotateList.set(idx, tmp);
	            } else {
	                rotateList.set(idx, rotateList.get(idx+1));
	            }
	        }
	    }
	    
	    return rotateList;
	}
}
