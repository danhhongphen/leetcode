package com.leetcode.arrays;
import java.util.Arrays;
public class maxProfit_Tan {
    public int maxProfit(int[] prices) {
    int maxProfit = 0;
    for (int i = 0; i < prices.length - 1; i++) {
        for (int j = i + 1; j < prices.length; j++) {
            int profit = prices[j] - prices[i];
            if (profit > maxProfit) {
                maxProfit = profit;
            }
        }
    }
    return maxProfit;
    }


    public int maxProfit1(int[] prices) {
        // Please align your code properly.
    int maxProfit = 0;
    int minBuy=100; // use minBuy = prices[0] -> then if (minBuy < prices[i]) -> minBuy = prices[i]
    for (int i = 0; i < prices.length; i++) {
        if (minBuy > prices[i]) {
            minBuy=prices[i]; // add space before and after =
        }
        int maxProfitTemp = prices[i] - minBuy; // why naming maxProfitTemp -> only int profit =
        if(maxProfitTemp>maxProfit) // please use only one format for {}
        {
            maxProfit=maxProfitTemp; // add space before and after =
        }
    }
    return maxProfit;
    }
    
    public static void main(String[] args) {
    maxProfit_Tan profit=new maxProfit_Tan();
    int[] arr1 = {10,1,5,6,7,1};
    int[] arr2 = {10,8,7,5,2};
    int[] arr3 = {};
    
    System.out.println("Check array 1"); 
    System.out.println("Solution 1: " + profit.maxProfit(arr1)); 
    System.out.println("Solution 2: " + profit.maxProfit1(arr1)); 

    
    System.out.println("\nCheck array 2"); 
    System.out.println("Solution 1: " + profit.maxProfit(arr2)); 
    System.out.println("Solution 2: " + profit.maxProfit1(arr2)); 

    System.out.println("\nCheck array 3"); 
    System.out.println("Solution 1: " + profit.maxProfit(arr3)); 
    System.out.println("Solution 2: " + profit.maxProfit1(arr3)); 
    }

}
