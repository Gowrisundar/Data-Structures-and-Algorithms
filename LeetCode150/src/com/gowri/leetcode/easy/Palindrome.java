package com.gowri.leetcode.easy;

public class Palindrome {
	
	public boolean isPalindrome(int x) {
        // char arr[] = String.valueOf(x).toCharArray();
        // int n = arr.length;
        // int i=0, j=n-1;
        // while(i<j) {
        //     if(arr[i] != arr[j]) {
        //         return false;
        //     }
        //     i++;
        //     j--;
        // }
        // return true;

        if(x < 0) {
            return false;
        }

        int temp = x;
        int rev = 0;

        while(temp != 0) {
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;
        }

        return rev == x;
    }

}
