/*
 * https://leetcode.com/problems/palindrome-linked-list/
 * Difficulty: EASY
 * */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] list = new int[]{1, 2, 2, 1};
        isPalindrome(list);
    }

    private static void isPalindrome(int[] list) {
        int[] test = new int[list.length];
        Arrays.fill(test, 0);
        int index = 0;
        for (int i = list.length - 1; i >= 0; i--) {
            test[index] = list[i];
            index++;
        }
        System.out.println(verify(list, test));
    }

    private static boolean verify(int[] a, int[] b) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
