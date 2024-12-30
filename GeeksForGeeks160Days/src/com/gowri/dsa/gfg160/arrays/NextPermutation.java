package com.gowri.dsa.gfg160.arrays;

public class NextPermutation {
	
	void nextPermutation(int[] arr) {
        // code here
        
        int arrLen = arr.length;
        
        int pivot = -1;
        int swapEle = -1;
        
        for (int i = arrLen-2; i>=0; i--) {
            if(arr[i] < arr[i+1]) {
                pivot = i;
                break;
            }
        }
        
        if(pivot == -1) {
            reverseArr(arr, 0, arrLen);
            return;
        }
        
        for(int i = arrLen-1; i>pivot; i--) {
            if(arr[i] > arr[pivot]) {
                swapEle = i;
                break;
            }
        }
        
        swap(arr, pivot, swapEle);
        reverseArr(arr, pivot+1, arrLen);
    }
    
    void swap(int[] arr, int pivot, int swapEle) {
        int temp = arr[pivot];
        arr[pivot] = arr[swapEle];
        arr[swapEle] = temp;
    }
    
    void reverseArr(int[] arr, int pivot, int arrLen) {
        int noOfRotation = (arrLen - pivot)/2;
        int startEle = pivot;
        int endEle = arrLen-1;
        for(int i=0; i< noOfRotation; i++) {
            int temp = arr[startEle];
            arr[startEle] = arr[endEle];
            arr[endEle] = temp;
            startEle++;
            endEle--;
        }
    }
}
