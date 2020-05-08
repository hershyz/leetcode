/*
 * https://leetcode.com/problems/smallest-rotation-with-highest-score/
 * Difficulty: HARD
 * */

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{2, 3, 1, 4, 0};
        bestRotation(a);
    }

    public static void bestRotation(int[] a) {

        int maxScore = getScore(a);
        int maxScoreIndex = 0;
        int[] current = set(a);

        for (int i = 0; i < a.length; i++) {

            if (getScore(current) > maxScore) {
                maxScore = getScore(current);
                maxScoreIndex = i;
            }

            current = set(rotate(current));
        }

        System.out.println("rotation: " + maxScoreIndex + ", score: " + maxScore);
    }

    public static int[] rotate(int[] a) {

        int b[] = new int[a.length];
        b[0] = a[a.length - 1];

        for (int i = 0; i < a.length - 1; i++) {
            b[i + 1] = a[i];
        }

        return b;
    }

    public static int getScore(int[] a) {

        int score = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] <= i) {
                score++;
            }
        }

        return score;
    }

    public static int[] set(int[] a) {

        int[] b = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        return b;
    }
}
