package com.leetcode.slidingwindow;

public class MaxProfit {

    public int maxProfit(int[] prices) {
        int left = 0;
        int right = 1;

        int maxProfit = 0;
        while (right < prices.length) {
            if (prices[left] < prices[right]) {
                int profit = prices[right] - prices[left];
                if (profit > maxProfit) {
                    maxProfit = profit;
                }
            }
            else {
                left = right;
            }
            right++;
        }

        return maxProfit;
    }
}
