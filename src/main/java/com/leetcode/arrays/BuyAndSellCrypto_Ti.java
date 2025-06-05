package com.leetcode.arrays;

public class BuyAndSellCrypto_Ti {
    // First method
    // Time complexity: O (n^2) ~~ Bruteforce
    public int maxProfit(int[] prices) {

        //check input
        int buyLowest = prices[0]; //please remove if unuse
        int saleHighest = prices[1]; //please remove if unuse
        int pricesSize = prices.length;
        int profit = 0; // dont' know if any transactions will make profit --> in this case profi would be 0
        for (int i = 0; i < pricesSize - 1; ++i){ //add space
            for (int j = i + 1; j < pricesSize; ++j){ //add space
                int tmp = 0;
                if (prices[j] > prices[i]) //please use only one format for {}
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
    // Mehthod: super simple but i don't know why i can not think like this :"(
    public int maxProfit_2(int[] prices) {
        // check input

        int buy_price = prices[0]; // do not naming like that -> follow camelCase
        int profit = 0;
        for (int i = 1; i < prices.length; ++i){ // add space
            if (prices[i] < buy_price) //please use only one format for {}
            {
                buy_price = prices[i];
            }
            else if (prices[i] - buy_price > profit)
            {
                profit = prices[i] - buy_price;
            }
        }
        return profit;
    }
}
