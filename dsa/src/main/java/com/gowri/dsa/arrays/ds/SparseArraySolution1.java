package com.gowri.dsa.arrays.ds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * This solution uses n * n big o notation resulting in O(n^2)
 * This is not suitable for large data set
 */
public class SparseArraySolution1 {

	public static List<Integer> getResult(List<String> stringList, List<String> queries) {
		List<Integer> resultList = new ArrayList<Integer>();

		for (String query : queries) {
			int count =0;
			for (String element : stringList) {
				if(query.equals(element)) {
					count++;
				}
			}
			resultList.add(count);
		}

		return resultList;

	}

}
