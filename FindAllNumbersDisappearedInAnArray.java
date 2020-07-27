/*
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/
 * Difficulty: EASY
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] test = new int[]{4,3,2,7,8,2,3,1};
        findDisappearedNumbers(test);
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> disappeared = new ArrayList<>();

        if (nums.length < 1) {
            return disappeared;
        }

        for (int i = 1; i <= nums.length; i++) {
            boolean contains = false;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] == i) {
                    contains = true;
                }
            }
            if (!contains) {
                disappeared.add(i);
            }
        }

        return disappeared;
    }
}
