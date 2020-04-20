/*
* https://leetcode.com/problems/climbing-stairs/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
        int height = 5;
        climbStairs(height);
    }

    public static void climbStairs(int height) {
        int[] dp = new int[height + 1];
        dp[0] = 1;
        dp[1] = 1;
        int i;
        for (i = 2; i <= height; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        System.out.println(dp[height]);
    }
}
