package com.gowri.dsa.arrays.dsa;

import java.util.List;

/**
 * @author gowrisundarsuriyanarayanan
 *
 */
public class ReverseArray 
{
   public static List<Integer> reverse(List<Integer> intList) {
	   List<Integer> randomList = intList;
	   int listLength =randomList.size();
	   for(int i=0, j=listLength-1; i<listLength/2; i++, j--) {
		   int tmp = randomList.get(i);
		   randomList.set(i, randomList.get(j));
		   randomList.set(j, tmp);
	   }
	   return randomList;
   }
}
