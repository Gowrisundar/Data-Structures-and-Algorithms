package com.gowri.dsa.arrays.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Ignore;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @author gowrisundarsuriyanarayanan
 * 
 * Problem statement: 
 * https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true
 * 
 */
public class RotateLeftArrayTest extends TestCase {
	
	/**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public RotateLeftArrayTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( RotateLeftArrayTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    
    public void testLeftShiftArraySolution1() {
    	List<Integer> arrayToBeRotated = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
    	List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 0, 1));
    	int noOfLeftRotation = 2;
    	assertEquals(expectedResult, RotateLeftArraySolutionOne.rotate(noOfLeftRotation, arrayToBeRotated));
    }
    
    public void testLeftShiftArraySolution2() {
    	List<Integer> arrayToBeRotated = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
    	List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 0, 1));
    	int noOfLeftRotation = 2;
    	assertEquals(expectedResult, RotateLeftArraySolutionTwo.rotate(noOfLeftRotation, arrayToBeRotated));
    }
    
    public void testLeftShiftArraySolution3() {
    	List<Integer> arrayToBeRotated = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));
    	List<Integer> expectedResult = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 0, 1));
    	int noOfLeftRotation = 2;
    	assertEquals(expectedResult, RotateLeftArraySolutionThree.rotate(noOfLeftRotation, arrayToBeRotated));
    }
}
