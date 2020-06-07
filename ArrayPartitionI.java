/*
* https://leetcode.com/problems/array-partition-i/
* Difficulty: EASY
* */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 4, 3, 2};
        arrayPairSum(nums);
    }

    public static void arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        System.out.println(nums[0] + nums[nums.length - 2]);
    }
}
