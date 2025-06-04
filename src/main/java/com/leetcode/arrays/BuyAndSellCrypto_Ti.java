package com.leetcode.arrays;

public class BuyAndSellCrypto_Ti {
    // First method
    // Time complexity: O (n^2) ~~ Bruteforce
    public int maxProfit(int[] prices) {
        int buyLowest = prices[0];
        int saleHighest = prices[1];
        int pricesSize = prices.length;
        int profit = 0; // dont' know if any transactions will make profit --> in this case profi would be 0
        for (int i = 0; i < pricesSize - 1; ++i){
            for (int j = i + 1; j < pricesSize; ++j){
                int tmp = 0;
                if (prices[j] > prices[i])
                {
                    tmp = prices[j] - prices[i];
                    if (tmp > profit)
                    {
                        profit = tmp;
                    }
                }
            }
        }
        return profit;
    }
}
