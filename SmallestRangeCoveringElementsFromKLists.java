/*
 * https://leetcode.com/problems/smallest-range-covering-elements-from-k-lists/
 * Difficulty: HARD
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[][] nums = new int[][] {
                {4,10,15,24,26},
                {0,9,12,20},
                {5,18,22,30}
        };

        smallestRange(nums);
    }

    public static void smallestRange(int[][] nums) {

        List<Integer> combined = new ArrayList<>();

        int i;
        for (i = 0; i < nums.length; i++) {

            int j;
            for (j = 0; j < nums[i].length; j++) {
                combined.add(nums[i][j]);
            }
        }

        int lower = nums[0][0];
        int upper = nums[0][1];
        int smallestRange = Math.abs(upper - lower);

        int k;
        for (k = 0; k < combined.size(); k++) {

            int l;
            for (l = 0; l < combined.size(); l++) {
                if (l != k) {
                    int currentRange = Math.abs(combined.get(l) - combined.get(k));
                    if (currentRange < smallestRange) {
                        if (allListsContain(combined.get(l), combined.get(k), nums)) {
                            lower = combined.get(l);
                            upper = combined.get(k);
                            smallestRange = Math.abs(upper - lower);
                        }
                    }
                }
            }
        }

        System.out.println(lower + ", " + upper + " -> " + smallestRange);
    }

    public static boolean allListsContain(int l, int u, int[][] nums) {

        int lower = 0;
        int upper = 0;

        if (l < u) {
            lower = l;
            upper = u;
        }

        if (l > u) {
            lower = u;
            upper = l;
        }

        if (l == u) {
            lower = l;
            upper = u;
        }

        boolean overall = true;

        for (int i = 0; i < nums.length; i++) {

            boolean current = false;

            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] <= upper && nums[i][j] >= lower) {
                    current = true;
                }
            }

            if (!current) {
                return false;
            }

            overall = current;
        }

        return overall;
    }
}
