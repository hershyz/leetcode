/*
* https://leetcode.com/problems/binary-subarrays-with-sum/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{1, 0, 1, 0, 1};
        int s = 2;
        numSubarraysWithSum(a, s);
    }

    public static void numSubarraysWithSum(int[] a, int s) {

        int matches = 0;
        for (int l = 0; l < a.length; l++) {

            for (int r = a.length - 1; r >= l; r--) {
                int[] temp = getArrayFromIndexes(l, r, a);
                int currentSum = getSumFromArray(temp);
                if (currentSum == s) {
                    matches++;
                }
            }
        }

        System.out.println(matches);
    }

    public static int[] getArrayFromIndexes(int l, int r, int[] a) {
        
        int[] result = new int[r - l + 1];

        int index = 0;
        for (int i = l; i <= r; i++) {
            result[index] = a[i];
            index++;
        }

        return result;
    }

    public static int getSumFromArray(int[] a) {

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }

        return sum;
    }
}
