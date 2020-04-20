/*
* https://leetcode.com/problems/maximum-product-subarray/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 1, 5};
        maxProduct(nums);
    }

    public static void maxProduct(int[] nums) {

        int max = nums[0] * nums[1];

        int start;
        for (start = 0; start < nums.length; start++) {

            int end;
            for (end = start + 1; end < nums.length; end++) {

                if (end < nums.length) {

                    int i;
                    int currentProduct = 1;
                    for (i = start; i <= end; i++) {
                        currentProduct = currentProduct * nums[i];
                    }

                    if (currentProduct > max) {
                        max = currentProduct;
                    }
                }
            }
        }

        System.out.println(max);
    }
}
