/*
 * https://leetcode.com/problems/shuffle-the-array/
 * Difficulty: EASY
 * */

public class Main {

    public static void main(String[] args) {

    }

    public int[] shuffle(int[] nums, int n) {

        int[] a = new int[n];
        int[] b = new int[n];

        int indexA = 0;
        for (int i = 0; i < n; i++) {
            a[indexA] = nums[i];
            indexA++;
        }

        int indexB = 0;
        for (int j = n; j < nums.length; j++) {
            b[indexB] = nums[j];
            indexB++;
        }

        int[] result = new int[n * 2];
        int resultIndex = 0;
        for (int k = 0; k < a.length; k++) {
            result[resultIndex] = a[k];
            resultIndex++;
            result[resultIndex] = b[k];
            resultIndex++;
        }

        return result;
    }
}
