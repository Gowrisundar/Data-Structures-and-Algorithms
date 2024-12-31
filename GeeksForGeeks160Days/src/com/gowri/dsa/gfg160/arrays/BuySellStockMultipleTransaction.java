package com.gowri.dsa.gfg160.arrays;

public class BuySellStockMultipleTransaction {
	
	public int maximumProfit(int prices[]) {
        // code here
        
        int arrLen = prices.length;
        int profit = 0;
        for(int i=1; i<arrLen; i++) {
            if(prices[i-1] < prices[i]) {
                profit = profit + prices[i] - prices[i-1];
            }
        }
        
        return profit;
    }

}
