package com.gowri.dsa.gfg160.arrays;

import java.util.Arrays;

public class MinimizeTheHeights {
	
	int getMinDiff(int[] arr, int k) {
        // code here
        int len = arr.length;
        Arrays.sort(arr);
        
       int res = arr[len-1] - arr[0];
       
       int smallest = arr[0] + k;
       int largest = arr[len-1] - k;
       int min, max = 0;
       for (int i=0; i< len-1; i++) {
           min = Math.min(smallest, arr[i+1] - k);
           max = Math.max(arr[i] + k, largest);
           
           if(min < 0) 
            continue;
            
        res = Math.min(res, max - min);
       }
        
        return res;
    }

}
