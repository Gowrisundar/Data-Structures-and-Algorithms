package com.gowri.dsa.gfg160.arrays;

public class ReverseArray {
	
	public void reverseArray(int arr[]) {
        int midLen = arr.length/2;
        int lastElement = arr.length - 1;
        for(int i=0; i<midLen; i++) {
            int temp = arr[lastElement];
            arr[lastElement] = arr[i];
            arr[i] = temp;
            lastElement--;
        }
    }

}
