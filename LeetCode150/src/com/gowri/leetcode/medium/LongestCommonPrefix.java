package com.gowri.leetcode.medium;

public class LongestCommonPrefix {
	
	public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        String res = strs[0];

        for(int i=1; i<strs.length; i++) {
            int idx = commonChar(res, strs[i]);
            res = res.substring(0,idx);
            if(res.length() == 0) {
                break;
            }
        }

        return res;
        
    }

    private int commonChar(String str1, String str2) {
        int min = Math.min(str1.length(), str2.length());
        int idx = 0;
        while(idx < min && str1.charAt(idx) == str2.charAt(idx)) {
            idx++;
        }

        return idx;
    }

}
