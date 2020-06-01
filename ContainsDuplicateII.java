/*
* https://leetcode.com/problems/string-compression/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;

        containsNearbyDuplicate(nums, k);
    }

    public static void containsNearbyDuplicate(int[] nums, int k) {

        boolean contains = true;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    int num1 = nums[i];
                    int num2 = nums[j];
                    int difference = Math.abs(num1 - num2);
                    if (difference <= k) {
                        contains = true;
                    }
                    else {
                        contains = false;
                    }

                    if (!contains) {
                        System.out.println(false);
                        return;
                    }
                }
            }

            if (!contains) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
