package com.leetcode.slidingwindow;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MaxProfitTest {

    @Test
    public void example1() {
        MaxProfit slidingWindow = new MaxProfit();
        int[] prices = {10,1,5,6,7,1,0,9};

        int maxProfit = slidingWindow.maxProfit(prices);

        assertThat(maxProfit).isEqualTo(6);
    }
    @Test
    public void example2() {
        MaxProfit slidingWindow = new MaxProfit();
        int[] prices = {7,1,5,3,6,4};

        int maxProfit = slidingWindow.maxProfit(prices);

        assertThat(maxProfit).isEqualTo(5);
    }
}
