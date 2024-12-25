package com.gowri.dsa.gfg160.arrays;

public class SecondLargestNumber {
	
	public int getSecondLargest(int[] arr) {
        int largeNum=0;
        int secLargeNum = 0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largeNum) {
                secLargeNum = largeNum;
                largeNum = arr[i];
            } else if(arr[i] > secLargeNum && arr[i] != largeNum) {
                secLargeNum = arr[i];
            } else {
                continue;
            }
        }
        
        if(secLargeNum == 0) {
            return -1;
        } else {
            return secLargeNum;
        }
    }

}
