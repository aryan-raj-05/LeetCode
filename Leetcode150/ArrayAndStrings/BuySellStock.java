package Leetcode150.ArrayAndStrings;

// Problem 121: Best Time to Buy and Sell Stock

public class BuySellStock {
    public int maxProfit(int[] prices) {
        int curMinValue = Integer.MAX_VALUE;
        int profit = 0;

        for(int j = 0; j < prices.length; j++) {
            curMinValue = Math.min(prices[j], curMinValue);
            profit = Math.max(profit, prices[j] - curMinValue);
        }

        return profit;
    }
}
