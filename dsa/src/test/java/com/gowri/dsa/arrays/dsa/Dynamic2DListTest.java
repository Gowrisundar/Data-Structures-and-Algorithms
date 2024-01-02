/**
 * 
 */
package com.gowri.dsa.arrays.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author gowrisundarsuriyanarayanan
 * Problem statement:
 * https://www.hackerrank.com/challenges/dynamic-array/problem?isFullScreen=true
 */
public class Dynamic2DListTest extends TestCase {
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public Dynamic2DListTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Dynamic2DListTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testDynamic2DArrayLastAnswer() {
    	List<Integer> expectedLastAnswerList = new ArrayList<Integer>(Arrays.asList(7, 3));
    	int noOfEmptyArray = 2;
    	List<List<Integer>> queriesList = new ArrayList<List<Integer>>();
    	queriesList.add(new ArrayList<Integer>(Arrays.asList(1, 0, 5)));
    	queriesList.add(new ArrayList<Integer>(Arrays.asList(1, 1, 7)));
    	queriesList.add(new ArrayList<Integer>(Arrays.asList(1, 0, 3)));
    	queriesList.add(new ArrayList<Integer>(Arrays.asList(2, 1, 0)));
    	queriesList.add(new ArrayList<Integer>(Arrays.asList(2, 1, 1)));
    	assertEquals(expectedLastAnswerList, Dynamic2DList.getLastAnswerList(noOfEmptyArray, queriesList));
    }
}
