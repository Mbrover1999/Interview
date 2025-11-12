package com.LeetCode.Array;

public class BestTimeToSellTwo {
    public static void main(String[] args) {

    }
    public static int maxProfit(int[] prices) {

        int max_profit = 0;
        int j = 0;
        for(int i = 0; i < prices.length - 1; i++){

            if(prices[i] < prices[i+1]){

                int profit = max_profit + prices[i+1] - prices[i];

                if(profit < prices[i+1] - prices[j]){
                    max_profit = prices[i+1] - prices[j];
                    continue;
                }
                max_profit = profit;
                j = i;


            }

        }
        return max_profit;

    }
}
