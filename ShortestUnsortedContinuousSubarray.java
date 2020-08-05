/*
 * https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 * Difficulty: EASY
 * */

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{5, 4, 3, 2, 1};
        System.out.println(findUnsortedContinuousSubarray(nums));
    }

    public static int findUnsortedContinuousSubarray(int[] nums) {

        if (isSorted(nums)) {
            return 0;
        }

        int shortest = 10000;

        int i;
        int j;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {

                int[] arr = getArray(nums, i, j);
                Arrays.sort(arr);
                List<Integer> list = new ArrayList<>();

                for (int x = 0; x < i; x++) {
                    list.add(nums[x]);
                }
                for (int num : arr) {
                    list.add(num);
                }
                if (j < nums.length - 1) {
                    for (int y = (j + 1); y < nums.length; y++) {
                        list.add(nums[y]);
                    }
                }

                List<Integer> test = new ArrayList<>();
                for (Integer num : list) {
                    test.add(num);
                }

                Collections.sort(test);
                if (compare(test, list)) {
                    int length = j - i + 1;
                    if (length < shortest) {
                        shortest = length;
                    }
                }
            }
        }

        return shortest;
    }

    public static int[] getArray(int[] nums, int i, int j) {

        int[] arr = new int[(j - i) + 1];
        int index = 0;
        for (int x = i; x <= j; x++) {
            arr[index] = nums[x];
            index++;
        }

        return arr;
    }

    public static boolean compare(List<Integer> a, List<Integer> b) {

        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) != b.get(i)) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSorted(int[] nums) {
        int[] test = new int[nums.length];
        int index = 0;
        for (int num : nums) {
            test[index] = num;
            index++;
        }
        Arrays.sort(test);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != test[i]) {
                return false;
            }
        }
        return true;
    }
}
