package com.gowri.dsa.arrays.ds;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 */
public class Dynamic2DList {
	
	public static List<Integer> getLastAnswerList(int noOfEmptyArray, List<List<Integer>> queries) {
		
		int lastAnswer = 0;
        List<Integer> lastAnswerList = new ArrayList<>();
        List<List<Integer>> empty2DList = new ArrayList<List<Integer>>();
        for(int i=0; i<noOfEmptyArray; i++) {
            empty2DList.add(new ArrayList<Integer>());
        }
        for(List<Integer> idvQuery: queries) {
            if(idvQuery.get(0) == 1) {
                int idx = (((idvQuery.get(1)) ^ lastAnswer) % noOfEmptyArray);
                empty2DList.get(idx).add(idvQuery.get(2));
            } else {
                int idx = (((idvQuery.get(1)) ^ lastAnswer) % noOfEmptyArray);
                int innerArrIdx = idvQuery.get(2) % empty2DList.get(idx).size();
                lastAnswer = empty2DList.get(idx).get(innerArrIdx);
                lastAnswerList.add(lastAnswer);
            }
        }
        
        return lastAnswerList;
		
	}
}
