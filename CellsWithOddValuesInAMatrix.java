/*
 * https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/
 * Difficulty: EASY
 * */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = 2;
        int m = 3;
        int[][] indices = new int[][] {
                {0, 1},
                {1, 1}
        };

        System.out.println(oddCells(n, m, indices));
    }

    public static int oddCells(int n, int m, int[][] indices) {

        int[][] matrix = new int[n][m];
        for (int[] x : matrix) {
            Arrays.fill(x, 0);
        }

        for (int[] index : indices) {

            int row = index[0];
            int column = index[1];

            for (int i = 0; i < matrix[row].length; i++) {
                matrix[row][i]++;
            }

            for (int i = 0; i < matrix.length; i++) {
                matrix[i][column]++;
            }
        }

        int oddCount = 0;
        for (int[] arr : matrix) {
            for (int index : arr) {
                if (isOdd(index)) {
                    oddCount++;
                }
            }
        }

        return oddCount;
    }

    public static boolean isOdd(int n) {
        double x = Double.valueOf(n) / 2;
        return x != Math.round(x);
    }
}
