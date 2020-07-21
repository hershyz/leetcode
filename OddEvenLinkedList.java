/*
 * https://leetcode.com/problems/odd-even-linked-list/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5};
        oddEvenList(nums);
    }

    public static void oddEvenList(int[] nums) {
        int even = 0;
        int odd;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                even++;
            }
        }
        odd = nums.length - even;
        int[] evenList = new int[even];
        int lastIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (isEven(nums[i])) {
                evenList[lastIndex] = nums[i];
                lastIndex++;
            }
        }
        int[] oddList = new int[odd];
        lastIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!isEven(nums[i])) {
                oddList[lastIndex] = nums[i];
                lastIndex++;
            }
        }
        for (int i = 0; i < oddList.length; i++) {
            System.out.println(oddList[i]);
        }
        for (int i = 0; i < evenList.length; i++) {
            System.out.println(evenList[i]);
        }
    }

    public static boolean isEven(int n) {
        double x = Double.valueOf(n) / 2;
        return Math.round(x) == x;
    }
}
