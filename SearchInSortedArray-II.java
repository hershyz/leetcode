/*
 * https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{0, 0, 1, 2, 2, 5, 6};
        int target = 3;
        System.out.println(search(nums, target));
    }

    public static boolean search(int nums[], int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return true;
            }
        }

        return false;
    }
}
