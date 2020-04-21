/*
* https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        maxProfit(prices);
    }

    public static void maxProfit(int[] prices) {

        int max = 0;

        int i;
        for (i = 0; i < prices.length - 1; i++) {

            int j;
            for (j = i + 1; j < prices.length; j++) {
                int profit = prices[j] - prices[i];
                if (profit > max) {
                    max = profit;
                }
            }
        }

        System.out.println(max);
    }
}
