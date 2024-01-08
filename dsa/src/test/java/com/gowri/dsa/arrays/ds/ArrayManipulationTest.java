package com.gowri.dsa.arrays.ds;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.gowri.dsa.arrays.ds.ArrayManipulationSolution1;
import com.gowri.dsa.arrays.ds.ArrayManipulationSolution2;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * Problem statement: https://www.hackerrank.com/challenges/crush/problem?isFullScreen=true
 */
public class ArrayManipulationTest {

	@Test
	public void testArrayManipulationSolution1() {
		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		int sizeToInitialize = 5;
		queries.add(Arrays.asList(1,2,100));
		queries.add(Arrays.asList(2,5,100));
		queries.add(Arrays.asList(3,4,100));
		long expectedSum = 200;
		assertEquals(expectedSum, ArrayManipulationSolution1.getMaxSum(sizeToInitialize, queries));
	}
	
	@Test
	public void testArrayManipulationSolution2() {
		List<List<Integer>> queries = new ArrayList<List<Integer>>();
		int sizeToInitialize = 5;
		queries.add(Arrays.asList(1,2,100));
		queries.add(Arrays.asList(2,5,100));
		queries.add(Arrays.asList(3,4,100));
		long expectedSum = 200;
		assertEquals(expectedSum, ArrayManipulationSolution2.getMaxSum(sizeToInitialize, queries));
	}

}
