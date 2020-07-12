/*
 * https://leetcode.com/problems/total-hamming-distance/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        int[] nums = new int[]{4, 14, 2};
        totalHammingDistance(nums);
    }

    public static void totalHammingDistance(int[] nums) {

        String[] bin = new String[nums.length];
        for (int a = 0; a < nums.length; a++) {
            bin[a] = Integer.toBinaryString(nums[a]);
        }

        int max = 0;
        for (int a = 0; a < bin.length; a++) {
            if (bin[a].length() > max) {
                max = bin[a].length();
            }
        }

        for (int a = 0; a < bin.length; a++) {
            String current = bin[a];
            int difference = max - current.length();
            for (int b = 0; b < difference; b++) {
                current = "0" + current;
                bin[a] = current;
            }
        }

        int total = 0;
        int i;
        int j;
        for (i = 0; i < nums.length - 1; i++) {
            for (j = i + 1; j < nums.length; j++) {
                int current = hammingDistance(bin[i], bin[j]);
                total = total + current;
            }
        }

        System.out.println(total);
    }

    public static int hammingDistance(String a, String b) {
        int h = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                h++;
            }
        }
        return h;
    }
}
