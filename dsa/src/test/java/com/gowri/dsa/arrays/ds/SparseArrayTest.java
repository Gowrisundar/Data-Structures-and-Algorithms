package com.gowri.dsa.arrays.ds;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.gowri.dsa.arrays.ds.SparseArraySolution1;
import com.gowri.dsa.arrays.ds.SparseArraySolution2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author gowrisundarsuriyanarayanan
 * Problem Statement: 
 * 
 * https://www.hackerrank.com/challenges/sparse-arrays/problem?isFullScreen=true
 * 
 */
public class SparseArrayTest extends TestCase{
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public SparseArrayTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( SparseArrayTest.class );
    }

    /**
     * Rigourous Test :-)
     */
	
	public void testcase1SparseArraySolution1() {
		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2,1,0));
		List<String> stringList = new ArrayList<String>(Arrays.asList("aba", "baba", "aba", "xzxb"));
		List<String> queryList = new ArrayList<String>(Arrays.asList("aba", "xzxb", "ab"));
		assertEquals(expectedResult, SparseArraySolution1.getResult(stringList, queryList));
	}
	
	public void testcase1SparseArraySolution2() {
		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2,1,0));
		List<String> stringList = new ArrayList<String>(Arrays.asList("aba", "baba", "aba", "xzxb"));
		List<String> queryList = new ArrayList<String>(Arrays.asList("aba", "xzxb", "ab"));
		assertEquals(expectedResult, SparseArraySolution2.getResult(stringList, queryList));
	}
	
	public void testcase2SparseArraySolution1() {
		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(1,3,4,3,2));
		List<String> stringList = new ArrayList<String>(Arrays.asList("abcde", "sdaklfj", "asdjf", "na",
				"basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"));
		List<String> queryList = new ArrayList<String>(Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn"));
		assertEquals(expectedResult, SparseArraySolution1.getResult(stringList, queryList));
	}
	
	public void testcase2SparseArraySolution2() {
		List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(1,3,4,3,2));
		List<String> stringList = new ArrayList<String>(Arrays.asList("abcde", "sdaklfj", "asdjf", "na",
				"basdn", "sdaklfj", "asdjf", "na", "asdjf", "na", "basdn", "sdaklfj", "asdjf"));
		List<String> queryList = new ArrayList<String>(Arrays.asList("abcde", "sdaklfj", "asdjf", "na", "basdn"));
		assertEquals(expectedResult, SparseArraySolution2.getResult(stringList, queryList));
	}
	
}
