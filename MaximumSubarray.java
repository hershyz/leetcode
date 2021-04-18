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

//Kadane's algorithm 0ms O(n)
class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int curr = max;
        for (int i = 1; i < nums.length; i++) {
            curr = Math.max(nums[i] + curr, nums[i]);
            max = Math.max(curr, max);
        }
        
        return max;
    }
}
