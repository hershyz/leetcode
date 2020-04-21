/*
* https://leetcode.com/problems/triangle/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int[][] triangle = new int[][]{
                {2},
                {3, 4},
                {6, 5, 7},
                {4, 1, 8, 3}
        };

        minimumTotal(triangle);
    }

    public static void minimumTotal(int[][] triangle) {

        int[] dp = new int[triangle.length];
        dp[0] = triangle[0][0];

        int i;
        for (i = 1; i < triangle.length; i++) {

            int min = triangle[i][0];
            int j;
            for (j = 0; j < triangle[i].length; j++) {
                if (triangle[i][j] < min) {
                    min = triangle[i][j];
                }
            }

            dp[i] = min;
        }

        int k;
        int sum = 0;
        for (k = 0; k < dp.length; k++) {
            sum = sum + dp[k];
        }

        System.out.println(sum);
    }
}
