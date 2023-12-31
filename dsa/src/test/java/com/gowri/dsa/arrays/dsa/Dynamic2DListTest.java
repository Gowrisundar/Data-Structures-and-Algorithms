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
 * Declare a 2-dimensional array, , of  empty arrays. All arrays are zero indexed.
Declare an integer, , and initialize it to .

There are  types of queries, given as an array of strings for you to parse:

Query: 1 x y
Let .
Append the integer  to .
Query: 2 x y
Let .
Assign the value  to .
Store the new value of  to an answers array.
Note:  is the bitwise XOR operation, which corresponds to the ^ operator in most languages. Learn more about it on Wikipedia.  is the modulo operator.
Finally, size(arr[idx]) is the number of elements in arr[idx]

Function Description

Complete the dynamicArray function below.

dynamicArray has the following parameters:
- int n: the number of empty arrays to initialize in 
- string queries[q]: query strings that contain 3 space-separated integers

Returns

int[]: the results of each type 2 query in the order they are presented
Input Format

The first line contains two space-separated integers, , the size of  to create, and , the number of queries, respectively.
Each of the  subsequent lines contains a query string, .

Constraints

It is guaranteed that query type 2 will never query an empty array or index.
Sample Input

2 5
1 0 5
1 1 7
1 0 3
2 1 0
2 1 1
Sample Output

7
3
Explanation

Initial Values:


 = [ ]
 = [ ]

Query 0: Append  to .

 = [5]
 = [ ]

Query 1: Append  to .
 = [5]
 = [7]

Query 2: Append  to .

 = [5, 3]
 = [7]

Query 3: Assign the value at index  of  to , print .

 = [5, 3]
 = [7]

7
Query 4: Assign the value at index  of  to , print .

 = [5, 3]
 = [7]

3
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
