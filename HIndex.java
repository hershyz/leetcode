/*
 * https://leetcode.com/problems/h-index/
 * Difficulty: MEDIUM
 * */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] citations = new int[]{3, 0, 6, 1, 5};
        hIndex(citations);
    }

    public static void hIndex(int[] citations) {

        Arrays.sort(citations);
        int max = 0;
        for (int i = 0; i < citations.length; i++) {
            if (verify(i, citations)) {
                if (citations[i] > max) {
                    max = citations[i];
                }
            }
        }

        System.out.println(max);
    }

    public static boolean verify(int i, int[] citations) {

        boolean verified = true;

        if (citations.length - i >= citations[i]) {
            for (int j = 0; j < i; j++) {
                if (citations[j] > citations[i]) {
                    verified = false;
                }
            }
        }
        else {
            verified = false;
        }

        return verified;
    }
}
