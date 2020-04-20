/*
 * https://leetcode.com/problems/3sum/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }

    public static void threeSum(int[] nums) {

        int x;
        for (x = 0; x < nums.length; x++) {

            int sum = 0;

            int y;
            for (y = x + 1; y < nums.length; y++) {

                int z;
                for (z = y + 1; z < nums.length; z++) {

                    sum = nums[x] + nums[y] + nums[z];
                    if (sum == 0) {
                        System.out.println(nums[x] + ", " + nums[y] + ", " + nums[z]);
                    }
                }
            }
        }
    }
}
