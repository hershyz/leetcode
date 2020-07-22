/*
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 * Difficulty: MEDIUM
 * */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 5, 6, 4};
        int k = 2;
        findKthLargest(nums, k);
    }

    public static void findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(nums[nums.length - k]);
    }
}
