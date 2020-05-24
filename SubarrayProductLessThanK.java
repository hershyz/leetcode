/*
* https://leetcode.com/problems/subarray-product-less-than-k/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{10, 5, 2, 6};
        int k = 100;

        numSubarrayProductLessThanK(nums, k);
    }

    public static void numSubarrayProductLessThanK(int[] nums, int k) {

        int x = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int product = 1;
                for (int n = i; n <= j; n++) {
                    product = product * nums[n];
                }
                if (product < k) {
                    x++;
                }
            }
        }

        System.out.println(x);
    }
}
