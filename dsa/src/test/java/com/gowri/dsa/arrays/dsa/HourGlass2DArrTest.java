package com.gowri.dsa.arrays.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * Problem Statement:
 * https://www.hackerrank.com/challenges/2d-array/problem?isFullScreen=true
 */
public class HourGlass2DArrTest extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HourGlass2DArrTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HourGlass2DArrTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testFindMaxSumOfHourGlassForPostive2DList()
    {
    	List<List<Integer>> twoDimList = new ArrayList<List<Integer>>();
    	twoDimList.add(0, new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 0)));
    	twoDimList.add(1, new ArrayList<Integer>(Arrays.asList(0, 1, 0, 0, 0, 0)));
    	twoDimList.add(2, new ArrayList<Integer>(Arrays.asList(1, 1, 1, 0, 0, 0)));
    	twoDimList.add(3, new ArrayList<Integer>(Arrays.asList(0, 0, 2, 4, 4, 0)));
    	twoDimList.add(4, new ArrayList<Integer>(Arrays.asList(0, 0, 0, 2, 0, 0)));
    	twoDimList.add(5, new ArrayList<Integer>(Arrays.asList(0, 0, 1, 2, 4, 0)));
    	int expectedSum = 19;
    	assertEquals(expectedSum, HourGlass2DArr.getMaxSumOfHourGlassFrom(twoDimList));
    }
    
    public void testFindMaxSumOfHourGlassForPostiveAndNegative2DList()
    {
    	List<List<Integer>> twoDimList = new ArrayList<List<Integer>>();
    	twoDimList.add(0, new ArrayList<Integer>(Arrays.asList(0, -4, -6, 0, -7, -6)));
    	twoDimList.add(1, new ArrayList<Integer>(Arrays.asList(-1, -2, -6, -8, -3, -1)));
    	twoDimList.add(2, new ArrayList<Integer>(Arrays.asList(-8, -4, -2, -8, -8, -6)));
    	twoDimList.add(3, new ArrayList<Integer>(Arrays.asList(-3, -1, -2, -5, -7, -4)));
    	twoDimList.add(4, new ArrayList<Integer>(Arrays.asList(-3, -5, -3, -6, -6, -6)));
    	twoDimList.add(5, new ArrayList<Integer>(Arrays.asList(-3, -6, 0, -8, -6, -7)));
    	int expectedSum = -19;
    	assertEquals(expectedSum, HourGlass2DArr.getMaxSumOfHourGlassFrom(twoDimList));
    }

}
