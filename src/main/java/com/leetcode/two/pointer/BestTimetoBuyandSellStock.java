package com.leetcode.two.pointer;

public class BestTimetoBuyandSellStock {
    //qua de voi Thi thi
    //Cau hoi 1: ngay mai dc an mon gi zay aaaaaaaaaa
    public static int maxProfit(int[] prices) {
        //if (prices == null || prices.length == 0) return 0;

        int maxProfit = 0;
        int min = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {

                min = prices[i];

            }
            int profit = prices[i] - min;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit ;

    }

    public static void main(String[] args) {
        int[] prices = null;
        System.out.println(maxProfit(prices));
    }
}
