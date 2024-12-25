package com.gowri.dsa.gfg160.arrays;

public class MoveAllZerosToEnd {
	
	void pushZerosToEnd(int[] arr) {
        boolean isZeroObserved = false;
        int zeroPointer = -1;
        int temp = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == 0) {
                if(!isZeroObserved) {
                    zeroPointer = i;
                    isZeroObserved = true;
                }
                if(i != arr.length-1) {
                    if(arr[i+1] != 0) {
                        temp = arr[i+1];
                        arr[i+1] = 0;
                        arr[zeroPointer] = temp;
                        zeroPointer = zeroPointer + 1;
                    } 
                } else {
                    temp = arr[i];
                    arr[i] = 0;
                    arr[zeroPointer] = temp;
                }

            } 
        }
    }

}
