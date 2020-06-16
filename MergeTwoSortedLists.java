/*
* https://leetcode.com/problems/merge-two-sorted-lists/
* Difficulty: EASY
* */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 4};
        int[] b = new int[]{1, 3, 4};
        merge(a, b);
    }

    public static void merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i;
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        int index = i;
        for (int j = 0; j < b.length; j++) {
            c[index] = b[j];
            index++;
        }
        Arrays.sort(c);
        for (int k = 0; k < c.length; k++) {
            System.out.println(c[k]);
        }
    }
}
