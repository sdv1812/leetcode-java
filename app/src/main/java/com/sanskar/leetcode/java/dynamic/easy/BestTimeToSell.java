package com.sanskar.leetcode.java.dynamic.easy;

public class BestTimeToSell {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            if (price - minPrice > profit) {
                profit = price - minPrice;
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        BestTimeToSell bestTimeToSell = new BestTimeToSell();
        System.out.println(bestTimeToSell.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }
}
