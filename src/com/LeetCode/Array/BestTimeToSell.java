package com.LeetCode.Array;

public class BestTimeToSell {
    public static void main(String[] args) {

    }

    public static int bestTimeToSell(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                max = Math.max(max, prices[i] - prices[j]);
            }
        }
        return max;
    }
}