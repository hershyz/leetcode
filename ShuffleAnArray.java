/*
 * https://leetcode.com/problems/shuffle-an-array/
 * Difficulty: MEDIUM
 * */

import java.util.Random;

public class Main {

    static int[] original;

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3};
        original = nums;
        shuffle();
    }

    public static int[] reset() {
        return original;
    }

    public static void shuffle() {

        Random rnd = new Random();
        int[] temp = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            temp[i] = original[i];
        }

        for (int i = 0; i < temp.length; i++) {
            int tempInt = temp[i];
            int replaceIndex = rnd.nextInt(temp.length);
            temp[i] = temp[replaceIndex];
            temp[replaceIndex] = tempInt;
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
