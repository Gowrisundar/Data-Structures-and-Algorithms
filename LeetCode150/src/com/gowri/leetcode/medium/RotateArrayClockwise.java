package com.gowri.leetcode.medium;

public class RotateArrayClockwise {
	
	public void rotate(int[] nums, int k) {

        int noOfRotation = (k > nums.length) ? k%nums.length : k;
        rotateArray(nums, nums.length - noOfRotation, nums.length -1);
        rotateArray(nums, 0, nums.length-noOfRotation-1);
        rotateArray(nums, 0, nums.length-1);      
    }

    private void rotateArray(int[] arr, int start,int end) {
        while(start<end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}
