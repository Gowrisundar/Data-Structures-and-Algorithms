package com.gowri.dsa.gfg160.arrays;
import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
	
	public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        
        int ele1= -1;
        int ele2 = -1;
        
        int cnt1 = 0;
        int cnt2 = 0;
        
        for(int i=0; i < nums.length; i++) {
            if(i==0) {
                ele1 = nums[i];
                cnt1++;
            } else {
                if(cnt1 == 0) {
                    ele1 = nums[i];
                    cnt1++;
                } else {
                    if(ele1 == nums[i]) {
                        cnt1++;
                    } else {
                        if(cnt2 == 0) {
                            ele2 = nums[i];
                            cnt2++;
                        } else {
                            if(ele2 == nums[i]) {
                                cnt2++;
                            } else {
                                cnt1--;
                                cnt2--;
                            }
                        }
                    }
                }
            }
        }
        
       List<Integer> res = new ArrayList<Integer>(); 
       
       cnt1 = 0;
       cnt2 = 0;
       
       for(int ele: nums) {
           if(ele1 == ele) {
               cnt1++;
           } else if(ele2 == ele) {
               cnt2++;
           }
       }
        
        if(cnt1 > nums.length/3 ) {
            res.add(ele1);
        } 
        if(cnt2 > nums.length/3 && ele1 != ele2) {
            res.add(ele2);
        }
        
        if(res.size() == 2 && ele1 > ele2) {
            res.set(0, ele2);
            res.set(1, ele1);
        } 
        return res;
    }

}
