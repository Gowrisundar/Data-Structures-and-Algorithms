package com.gowri.dsa.gfg160.arrays;

public class BuySellStockSIngleTransaction {
	
	public int maximumProfit(int prices[]) {
        int arrLen = prices.length;
        
        int minSoFar = prices[0];
        int res = 0;
        
        for(int i = 1; i < arrLen; i++) {
            minSoFar = min(minSoFar, prices[i]);
            res = max(res, prices[i] - minSoFar);
        }
        
        return res;
    }
    
    private int min(int a, int b) {
        if(a<b){
            return a;
        } else {
            return b;
        }
    }
    
    private int max(int a, int b) {
        if(a>b) {
            return a;
        } else {
            return b;
        }
    }

}
