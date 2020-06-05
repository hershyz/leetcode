/*
* https://leetcode.com/problems/arithmetic-slices-ii-subsequence/
* Difficulty: HARD
* */

public class Main {

    public static void main(String[] args) {

        int[] input = new int[]{2, 4, 6, 8, 10};
        numberOfArithmeticSlices(input);
    }

    public static void numberOfArithmeticSlices(int[] nums) {

        int counter = 0;

        for (int left = 0; left < nums.length - 2; left++) {
            for (int right = left; right < nums.length; right++) {

                int difference = Math.abs(right - left);
                if (difference >= 2) {

                    boolean test = check(left, right, nums);
                    if (test) {
                        System.out.println(left + ", " + right);
                        counter++;
                    }
                }
            }
        }
    }

    public static boolean check(int left, int right, int[] nums) {

        int required = nums[1] - nums[0];

        for (int i = left; i < right; i++) {
            if (nums[i + 1] - nums[i] != required) {
                return false;
            }
        }

        return true;
    }
}
