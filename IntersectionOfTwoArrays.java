/*
* https://leetcode.com/problems/intersection-of-two-arrays/
* Difficulty: EASY
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{4, 9, 5};
        int[] b = new int[]{9, 4, 9, 8, 4};
        intersection(a, b);
    }

    public static void intersection(int[] a, int[] b) {

        List<Integer> foundIntedsections = new ArrayList();

        for (int i = 0; i < b.length; i++) {
            if (contains(a, b[i])) {
                if (!foundIntedsections.contains(b[i])) {
                    System.out.println(b[i]);
                    foundIntedsections.add(b[i]);
                }
            }
        }
    }

    public static boolean contains(int[] a, int num) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == num) {
                return true;
            }
        }

        return false;
    }
}
