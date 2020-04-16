/*
 * https://leetcode.com/problems/k-closest-points-to-origin/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {

        int[][] points = { {3, 3}, {5, -1}, {-2, 4} };
        int k = 2;

        run(points, k);
    }

    public static void run(int[][] points, int k) {

        double[] distances = new double[points.length];

        int i;
        for (i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];
            distances[i] = findDistance(x, y);
        }

        int a;
        for (a = 0; a < distances.length; a++) {
            int b;
            for (b = 0; b < distances.length - 1; b++) {
                if (distances[b] > distances[b + 1]) {
                    double temp;
                    temp = distances[b + 1];
                    distances[b + 1] = distances[b];
                    distances[b] = temp;
                }
            }
        }

        int c;
        for (c = 0; c < k; c++) {

            int index = findCorrespondingDistanceIndex(distances[c], points);
            System.out.println(points[index][0] + ", " + points[index][1]);
        }
    }

    public static double findDistance(int x, int y) {

        x = x * x;
        y = y * y;
        int sum = x + y;
        return Math.sqrt(sum);
    }

    public static int findCorrespondingDistanceIndex(double distance, int[][] points) {

        int i;
        for (i = 0; i < points.length; i++) {
            int x = points[i][0];
            int y = points[i][1];
            if (findDistance(x, y) == distance) {
                return i;
            }
        }

        return -1;
    }
}
