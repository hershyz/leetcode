/*
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * Difficulty: EASY
 * */

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        run(nums);
    }

    public static void run(int[] nums) {

        int total = 0;
        int lastNum = nums[0];

        int i;
        for (i = 1; i < nums.length; i++) {

            if (nums[i] != lastNum) {
                total++;
            }

            lastNum = nums[i];
        }

        System.out.println(total + 1);
    }
}
