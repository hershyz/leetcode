/*
* https://leetcode.com/problems/single-number/
* Difficulty: EASY
* */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{2, 2, 1};
        singleNumber(nums);
    }

    public static void singleNumber(int[] nums) {

        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    System.out.println(nums[i]);
                    return;
                }
            }
            if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    System.out.println(nums[i]);
                    return;
                }
            }
            else {
                if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                    System.out.println(nums[i]);
                    return;
                }
            }
        }
    }
}
