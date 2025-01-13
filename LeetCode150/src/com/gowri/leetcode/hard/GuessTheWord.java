package com.gowri.leetcode.hard;

import java.util.Arrays;

public class GuessTheWord {
	/**
	 * // This is the Master's API interface.
	 * // You should not implement it, or speculate about its implementation
	 * interface Master {
	 * public int guess(String word) {}
	 * }
	 */
	class Solution {
	    public void findSecretWord(String[] words, Master master) {
	       int last = words.length - 1;
	        while (true) {
	            System.out.println(Arrays.toString(words));
	            int count = master.guess(words[0]);
	            System.out.println("Word to Guess: " + words[0]);
	            System.out.println("Guessed Count: " + count);
	            if (count == 6) {
	                return;
	            }

	            int i = 1;
	            while (i <= last) {
	                System.out.println("Value of i: " + i + " : last : " + last);
	                System.out.println("Word for Match: " + words[i]);
	                System.out.println("Last reduced word: " + words[last]);
	                int matches = getMatches(words[i], words[0]);
	                System.out.println("Matches : " + matches);
	                if (matches != count) {
	                    words[i] = words[last--];
	                } else {
	                    i++;
	                }
	            }
	            words[0] = words[last--];
	        }

	    }

	    private int getMatches(String word1, String word2) {
	        System.out.println("Words : " + word1 + " : "+ word2);
	        int matches = 0;
	        for (int i = 0; i < 6; i++) {
	            if (word1.charAt(i) == word2.charAt(i)) {
	                matches++;
	            }
	        }
	        return matches;
	    }

	}

}
