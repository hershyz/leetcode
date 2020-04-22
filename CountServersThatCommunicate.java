/*
* https://leetcode.com/problems/count-servers-that-communicate/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int[][] grid = new int[][]{
                {1, 0},
                {0, 1},
        };

        countServers(grid);
    }

    public static void countServers(int[][] grid) {

        int communicating = 0;

        for (int i = 0; i < grid.length; i++) {

            int j;
            int current = -1;

            for (j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    current++;
                }
            }

            if (current > 0) {
                communicating = communicating + current;
            }
        }

        for (int k = 0; k < grid[0].length; k++) {

            int l;
            int current = -1;

            for (l = 0; l < grid.length; l++) {
                if (grid[k][l] == 1) {
                    current++;
                }
            }

            if (current > 0) {
                communicating = communicating + current;
            }
        }

        System.out.print(communicating);
    }
}
