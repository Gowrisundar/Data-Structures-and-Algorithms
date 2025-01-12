package com.gowri.leetcode.medium;

public class ReverseWordsInStringGowriSolution {
	public String reverseWords(String s) {
        s = s.trim();
        int size = s.length();
        if(size==1) {
            return s;
        }
        StringBuffer resStr = new StringBuffer();
        boolean isSpaceInserted = false;
        int startIdx = size-1;
        int endIdx = size;
        for(int i=size-1; i>=0; i--) {
            if(s.charAt(i) != ' ') {
                if(isSpaceInserted) {
                    isSpaceInserted = false;
                    endIdx=startIdx+1;
                }
                if(i==0) {
                    resStr.append(s.substring(startIdx, endIdx));
                }
                startIdx--;
            } else {
                if(!isSpaceInserted) {
                    resStr.append(s.substring(startIdx+1, endIdx));
                    resStr.append(" ");
                    isSpaceInserted = true;
                }
                startIdx--;
            }
            
        }

        return resStr.toString();

    }

}
