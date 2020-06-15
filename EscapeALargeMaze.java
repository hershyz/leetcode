/*
* https://leetcode.com/problems/escape-a-large-maze/
* Difficulty: HARD
* */

public class Main {

    public static void main(String[] args) {

        int[][] blocked = new int[][] {
                {0, 0},
                {1, 0}
        };

        int[] source = new int[]{5, 4};
        int[] target = new int[]{1, 1};

        isEscapePossible(blocked, source, target);
    }

    public static void isEscapePossible(int[][] blocked, int[] source, int[] target) {

        int xDistance = Math.abs(target[0] - source[0]) + 1;
        int yDistance = Math.abs(target[1] - source[1]) + 1;

        int xTransform = source[0];
        int yTransform = source[1];
        source[0] = source[0] - xTransform;
        source[1] = source[1] - yTransform;
        target[0] = Math.abs(target[0] - xTransform);
        target[1] = Math.abs(target[1] - yTransform);

        for (int i = 0; i < blocked.length; i++) {
            blocked[i][0] = Math.abs(blocked[i][0] - xTransform);
            blocked[i][1] = Math.abs(blocked[i][1] - yTransform);
        }

        int[][] paths = new int[xDistance][yDistance];

        for (int i = 0; i < xDistance; i++) {
            for (int j = 0; j < yDistance; j++) {
                paths[i][j] = 0;
            }
        }

        paths[0][0] = 1;
        for (int i = 1; i < yDistance; i++) {
            int[] testBlock = new int[]{0, i};
            if (containsPoint(blocked, testBlock)) {
                paths[0][i] = 0;
            }
            else {
                paths[0][i] = paths[0][i - 1];
            }
        }

        for (int i = 1; i < xDistance; i++) {
            for (int j = 0; j < yDistance; j++) {

                int[] testBlock = new int[]{i, j};
                if (containsPoint(blocked, testBlock)) {
                    paths[i][j] = 0;
                }
                else {
                    int currentPaths = 0;
                    currentPaths = currentPaths + paths[i - 1][j];
                    if (j > 0) {
                        currentPaths = currentPaths + paths[i][j - 1];
                    }
                    paths[i][j] = currentPaths;
                }
            }
        }

        for (int i = 0; i < xDistance; i++) {
            for (int j = 0; j < yDistance; j++) {
                System.out.print(paths[i][j] + " ");
            }
            System.out.println("");
        }

        System.out.println(paths[xDistance - 1][yDistance - 1] != 0);
    }

    public static boolean containsPoint(int[][] points, int[] point) {

        for (int[] ints : points) {
            if (point[0] == ints[0]) {
                if (point[1] == ints[1]) {
                    return true;
                }
            }
        }

        return false;
    }
}
