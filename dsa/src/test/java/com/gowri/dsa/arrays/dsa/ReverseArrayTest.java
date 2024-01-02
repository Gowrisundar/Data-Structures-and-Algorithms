package com.gowri.dsa.arrays.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for Reverse Array Test
 * @author gowrisundarsuriyanarayanan
 * * Problem Statement:
 * https://www.hackerrank.com/challenges/arrays-ds/problem?isFullScreen=true
 */
public class ReverseArrayTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ReverseArrayTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ReverseArrayTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testReverseArrayEvenSize()
    {
    	List<Integer> evenArray = new ArrayList<>(Arrays.asList(1, 3, 4, 5));
    	List<Integer> expectedArray = new ArrayList<>(Arrays.asList(5, 4, 3, 1));
    	assertEquals(expectedArray, ReverseArray.reverse(evenArray));
    }
    
    public void testReverseArrayOddSize()
    {
    	List<Integer> oddArray = new ArrayList<>(Arrays.asList(9, 5, 7, 6, 3, 1, 8));
    	List<Integer> expectedArray = new ArrayList<>(Arrays.asList(8, 1, 3, 6, 7, 5, 9));
    	assertEquals(expectedArray, ReverseArray.reverse(oddArray));
    }
}
