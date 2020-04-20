/*
* https://leetcode.com/problems/unique-paths/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        maxSubarray(7, 3);
    }

    public static void maxSubarray(int x, int y) {

        int[][] dp = new int[x][y];

        int i;
        for (i = 0; i < x; i++) {
            dp[i][0] = 1;
        }

        int j;
        for (j = 0; j < y; j++) {
            dp[0][j] = 1;
        }

        int k;
        for (k = 1; k < x; k++) {
            int l;
            for (l = 1; l < y; l++) {
                dp[k][l] = dp[k - 1][l] + dp[k][l - 1];
            }
        }

        System.out.println(dp[x - 1][y - 1]);
    }
}
