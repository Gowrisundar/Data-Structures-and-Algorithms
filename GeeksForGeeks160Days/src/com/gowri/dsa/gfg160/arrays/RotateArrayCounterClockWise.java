package com.gowri.dsa.gfg160.arrays;

public class RotateArrayCounterClockWise {

	//This solution uses Reversal algorithm. We also need to look at the juggling algorithm for array rotation
	//This problem solution is for counter clock wise - left rotation.
static void rotateArr(int arr[], int d) {
        
        int arrLen = arr.length;
        
        //logic to check if rotation size is greater than the array size. If greater, if we use module, 
        //we will get the reminder which says no of rotations to be made
        int noOfRotation = (d>arrLen) ? d%arrLen : d;
        
        rotateArray(arr, 0, noOfRotation-1);
        rotateArray(arr, noOfRotation, arrLen-1);
        rotateArray(arr, 0, arrLen-1);
        
    }
    
    private static void rotateArray(int arr[], int arrStart, int arrEnd) {
        
        while(arrStart < arrEnd) {
            int temp = arr[arrStart];
            arr[arrStart] = arr[arrEnd];
            arr[arrEnd] = temp;
            arrStart++;
            arrEnd--;
        }
        
    }
	
	
}
