package com.gowri.dsa.gfg160.arrays;
import java.util.Arrays;
public class FindingMissingPstvInteger {
	
	public int missingNumber(int[] arr) {
		//This uses o(n log n) since it uses sorting
        // Your code here
        Arrays.sort(arr);
        
        int minPositive = 1;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == minPositive) {
                minPositive++;
            } else if(arr[i] > minPositive) {
                break;
            }
        }
        
        return minPositive;
    }

}
