import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        int[][] grid = {
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };

        islandPerimeter(grid);
    }

    public static void islandPerimeter(int[][] grid) {

        int total = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    total += perimeterFromBlock(grid, i, j);
                }
            }
        }

        System.out.println(total);
    }

    public static int perimeterFromBlock(int[][] grid, int i, int j) {

        int surrounding = 0;
        boolean top = false;
        boolean bottom = false;
        boolean left = false;
        boolean right = false;

        if (i == 0) {
            top = true;
        }

        if (i == grid.length - 1) {
            bottom = true;
        }

        if (j == grid[i].length - 1) {
            right = true;
        }

        if (j == 0) {
            left = true;
        }

        if (!top) {
            if (grid[i - 1][j] == 1) {
                surrounding++;
            }
        }

        if (!bottom) {
            if (grid[i + 1][j] == 1) {
                surrounding++;
            }
        }

        if (!left) {
            if (grid[i][j - 1] == 1) {
                surrounding++;
            }
        }

        if (!right) {
            if (grid[i][j + 1] == 1) {
                surrounding++;
            }
        }

        return 4 - surrounding;
    }
}
