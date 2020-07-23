/*
 * https://leetcode.com/problems/bulb-switcher/
 * Difficulty: MEDIUM
 * */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(bulbSwitch(3));
    }

    public static int[] bulbs;

    public static int bulbSwitch(int n) {

        bulbs = new int[n];
        Arrays.fill(bulbs, 0);

        for (int i = 1; i <= n; i++) {
            toggle(i);
        }

        int on = 0;
        for (int x : bulbs) {
            if (x == 1) {
                on++;
            }
        }

        return on;
    }

    public static void toggle(int i) {

        int current = (0 + i) - 1;

        while (current < bulbs.length) {
            swap(current);
            current = current + i;
        }
    }

    public static void swap(int i) {
        if (bulbs[i] == 1) {
            bulbs[i] = 0;
            return;
        }
        if (bulbs[i] == 0) {
            bulbs[i] = 1;
            return;
        }
    }
}
