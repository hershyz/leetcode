/*
* https://leetcode.com/problems/valid-boomerang/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        int[][] points = new int[][]{
                {1, 1},
                {2, 2},
                {3, 3}
        };

        isBoomarang(points);
    }

    public static void isBoomarang(int[][] points) {

        double lastSlope = findSlope(points[1][1], points[0][1], points[1][0], points[0][0]);

        for (int i = 2; i < points.length; i++) {
            double currentSlope = findSlope(points[i][1], points[i - 1][1], points[i][0], points[i - 1][0]);
            if (currentSlope == lastSlope) {
                System.out.println("false");
                return;
            }
            lastSlope = currentSlope;
        }

        System.out.println("true");
    }

    public static double findSlope(int y2, int y1, int x2, int x1) {
        double yDiff = y2 - y1;
        double xDiff = x2 - x1;
        return yDiff / xDiff;
    }
}
