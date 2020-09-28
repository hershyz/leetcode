/*
 * https://leetcode.com/problems/remove-covered-intervals/
 * Difficulty: MEDIUM
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }

    public static int removeCoveredIntervals(int[][] intervals) {

        List<int[]> ints = new ArrayList<>();
        for (int[] interval : intervals) {
            ints.add(interval);
        }

        for (int i = 0; i < ints.size(); i++) {
            for (int j = 0; j < ints.size(); j++) {
                if (j != i) {
                    int[] int1 = ints.get(i);
                    int[] int2 = ints.get(j);
                    if (test(int1, int2)) {
                        ints.remove(i);
                    }
                }
            }
        }

        return ints.size();
    }

    public static boolean test(int[] int1, int[] int2) {

        if (int1[0] >= int2[0]) {
            if (int1[1] <= int2[1]) {
                return true;
            }
        }

        return false;
    }
}
