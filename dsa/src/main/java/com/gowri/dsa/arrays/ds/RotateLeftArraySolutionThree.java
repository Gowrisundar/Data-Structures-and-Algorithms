package com.gowri.dsa.arrays.ds;

import java.util.Arrays;
import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * This is effective solution which uses only one for loop and one data structure
 */
public class RotateLeftArraySolutionThree {
	
	public static List<Integer> rotate(int noOfRotation, List<Integer> arrayToBeRotated) {
		List<Integer> rotatedList = Arrays.asList(new Integer[arrayToBeRotated.size()]);
	    for(int idx =0 ; idx < arrayToBeRotated.size(); idx++) {
	        int rotatedIdx = (idx+arrayToBeRotated.size() - noOfRotation) % arrayToBeRotated.size();
	        rotatedList.set(rotatedIdx, arrayToBeRotated.get(idx));
	    }	    
	    return rotatedList;
	}

}
