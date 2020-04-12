/*
* https://leetcode.com/problems/rectangle-overlap/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        int[] rect1 = new int[]{0, 0, 1, 1};
        int[] rect2 = new int[]{1, 0, 2, 1};
        run(rect1, rect2);
    }

    public static void run(int[] rect1, int[] rect2) {

        int x2_1 = rect1[2];
        int y2_1 = rect1[3];
        int x1_2 = rect2[0];
        int y1_2 = rect2[1];

        if (x1_2 < x2_1 && y1_2 < y2_1) {
            System.out.println("true");
            return;
        }

        System.out.println("false");
    }
}
