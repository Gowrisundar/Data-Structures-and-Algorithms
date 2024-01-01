package com.gowri.dsa.arrays.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * This is somewhat effective solution but uses two for loops and two additional list to solve the problem. 
 * May be we need to reduce the usage of number of data structures as well to reduce memory
 */
public class RotateLeftArraySolutionTwo {

	public static List<Integer> rotate(int noOfRotation, List<Integer> arrayToBeRotated) {
		List<Integer> shiftBackList = new ArrayList<Integer>();
        List<Integer> shiftFrontList = new ArrayList<Integer>();
        
        for(int idx = 0; idx < noOfRotation; idx++) {
            shiftBackList.add(arrayToBeRotated.get(idx));
        }
        
        for(int idx = noOfRotation; idx < arrayToBeRotated.size(); idx++) {
            shiftFrontList.add(arrayToBeRotated.get(idx));
        }
        
        shiftFrontList.addAll(shiftBackList);
        
        return shiftFrontList;
	}
	
}
