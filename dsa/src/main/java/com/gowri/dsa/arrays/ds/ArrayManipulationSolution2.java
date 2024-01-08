package com.gowri.dsa.arrays.ds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 */
public class ArrayManipulationSolution2 {

	/*
	 * This solution solves in o(n) computation where n = array size.
	 * We have used prefix sum algorithm in reverse order
	 * 
	 * Explanation:
	 * 
	 * 
       getMaxSum(int sizeToInitialize, List<List<Integer>> queries):
       Perform array manipulation operations based on the given queries and return the maximum value.

       Parameters:
       - sizeToInitialize (int): The number of elements in the array.
       - queries (list): A list of queries where each query is a list containing three ints (a, b, k).

       Returns:
       - int: The maximum value in the resultant array.


       # Initialize the array with zeros
       array = [0] * (sizeToInitialize + 1)

       # Iterate through each query and update the array accordingly
       for query in queries:
         a, b, k = query
         array[a - 1] += k  # Add the value 'k' to the starting index 'a - 1'
         array[b] -= k  # Subtract the value 'k' from the next index 'b'

       # Initialize variables to track the maximum and current values in the array
        max_value = 0
        current_value = 0

       # Iterate through the array to find the maximum value
        for value in array:
         current_value += value
         max_value = max(max_value, current_value)

        return max_value
	 * 
	 */
	public static long getMaxSum(int sizeToInitialize, List<List<Integer>> queries) {
		List<Long> resultArray = new ArrayList<Long>();
		long max_sum = Integer.MIN_VALUE;
		long sum=0;
		for(int i=0; i<=sizeToInitialize; i++) {
			resultArray.add(0L);
		}

		for(List<Integer> query: queries) {
			int startIndex = query.get(0);
			int endIndex = query.get(1);
			long valueToSum = query.get(2);
			resultArray.set(startIndex-1, resultArray.get(startIndex-1) + valueToSum);
			resultArray.set(endIndex, resultArray.get(endIndex) - valueToSum);  
		}

		for(long result: resultArray) {
			sum+=result;
			max_sum = Math.max(max_sum, sum);
		}

		return max_sum;

	}
}
