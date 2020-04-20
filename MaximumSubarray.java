/*
* https://leetcode.com/problems/maximum-subarray/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        maxSubarray(nums);
    }

    public static void maxSubarray(int[] nums) {

        int max = 0;

        int l;
        for (l = 0; l < nums.length; l++) {

            int r;
            for (r = l; r < nums.length; r++) {

                int sum = 0;
                int x;
                for (x = l; x <= r; x++) {
                    sum = sum + nums[x];
                    if (sum > max) {
                        max = sum;
                        sum = 0;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
