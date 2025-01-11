package com.gowri.leetcode.medium;

public class ZigZagConversion {
	public String convert(String s, int numRows) {
        if (numRows == 1) {
           return s;
       }
       int size = s.length();
       char zigZag[] = new char[size];
       int increment = 2 * (numRows - 1);
       int currVal = 0;
       for (int i = 0; i < numRows; i++) {
           for (int k = i; k < size; k = k + increment) {
               zigZag[currVal] = s.charAt(k);
               currVal++;
               if (i != 0 && i != numRows - 1 && k + increment - (2 * i) < s.length()) {
                   zigZag[currVal] = s.charAt(k + increment - (2 * i));
                   currVal++;
               }
           }
       }
       return new String(zigZag);
   }

}
