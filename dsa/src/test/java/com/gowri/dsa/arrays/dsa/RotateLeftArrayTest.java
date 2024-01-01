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
 * 
 * https://www.hackerrank.com/challenges/array-left-rotation/problem?isFullScreen=true
 * 
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. Given an integer, , rotate the array that many steps left and return the result.

Example


After  rotations, .

Function Description

Complete the rotateLeft function in the editor below.

rotateLeft has the following parameters:

int d: the amount to rotate by
int arr[n]: the array to rotate
Returns

int[n]: the rotated array
Input Format

The first line contains two space-separated integers that denote , the number of integers, and , the number of left rotations to perform.
The second line contains  space-separated integers that describe .

Constraints

Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4
Explanation

To perform  left rotations, the array undergoes the following sequence of changes:


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
