package com.gowri.leetcode.easy;

public class ValidPalindrome {
	
	public boolean isPalindrome(String s) {

        if (s.isEmpty()) {
            return true;
        }

        if(s.length() == 1 && Character.isLetterOrDigit(s.charAt(0))) {
        return true;
        }

        int start = 0;
        int end = s.length() - 1;

        while (start <= end) {
            char stChar = s.charAt(start);
            char edChar = s.charAt(end);
            if (!Character.isLetterOrDigit(stChar)) {
                start++;
            } else if (!Character.isLetterOrDigit(edChar)) {
                end--;
            } else {
                if (Character.toLowerCase(stChar) != Character.toLowerCase(edChar)) {
                    return false;
                }
                start++;
                end--;
            }

        }

        return true;
    }

}
