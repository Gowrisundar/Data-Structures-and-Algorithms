package com.gowri.dsa.arrays.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * This solution uses  big o notation resulting in O(n)
 * This solution uses two separate loops not nested loops so it can be suitable for large datasets
 */
public class SparseArraySolution2 {

	public static List<Integer> getResult(List<String> stringList, List<String> queries) {
		List<Integer> resultList = new ArrayList<Integer>();

		Map<String, Integer> occurenceMap = new HashMap<String, Integer>();

		for (String element : stringList) {
			if(occurenceMap.containsKey(element)) {
				occurenceMap.put(element, occurenceMap.get(element) + 1);
			} else {
				occurenceMap.put(element, 1);
			}

		}

		for (String query: queries) {
			if(occurenceMap.containsKey(query)) {
				resultList.add(occurenceMap.get(query));
			} else {
				resultList.add(0);
			}
		}

		return resultList;

	}

}
