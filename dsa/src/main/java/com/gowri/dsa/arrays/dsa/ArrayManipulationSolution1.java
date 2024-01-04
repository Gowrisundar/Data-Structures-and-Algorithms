package com.gowri.dsa.arrays.dsa;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 */
public class ArrayManipulationSolution1 {

	/*
	 * This solution is a brute force solution which uses n * m -> o(n^2). we have nested 
	 * two for loops which may not be suitable for large datsets as they have time complexity for large datasets
	 */
	public static long getMaxSum(int sizeToInitialize, List<List<Integer>> queries) {
		List<Integer> resultArray = new ArrayList<Integer>();
	    long max_sum = 0;
	    for(int i=0; i<sizeToInitialize; i++) {
	        resultArray.add(0);
	    }
	    
	    for(List<Integer> query: queries) {
	        int startIndex = query.get(0);
	        int endIndex = query.get(1);
	        int valueToSum = query.get(2);
	        
	        for(int a=startIndex-1; a<=endIndex-1; a++) {
	            int element = resultArray.get(a) + valueToSum;
	            System.out.print(element);
	            if( element > max_sum ) {
	                max_sum = element;
	            } 
	            resultArray.set(a, element);
	        }
	    }
	    
	    return max_sum;
	}
	
}
