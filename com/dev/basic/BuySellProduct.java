package com.dev.basic;

public class BuySellProduct {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 7};
        int maxProfit = maxProfit(prices);
        System.out.println("Maximum profit: " + maxProfit);
    }

    private static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }

        int minPrice  = prices[0]; // Initialize minimum price to the first element
        int maxProfit = 0; // Initialize maximum profit to 0
        for(int price : prices) {
           maxProfit = Math.max(maxProfit, price - minPrice); // Update max profit if current price minus min price is greater
              minPrice = Math.min(minPrice, price); // Update min price if current price is lower
        }

        return maxProfit;
    }
}
