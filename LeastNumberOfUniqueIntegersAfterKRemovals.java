/*
 * https://leetcode.com/problems/least-number-of-unique-integers-after-k-removals/
 * Difficulty: MEDIUM
 * */

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{5, 5, 4};
        findLeastNumOfUniqueInts(arr, 1);
    }

    public static void findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer, Integer> frequencies = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (frequencies.containsKey(arr[i])) {
                int current = frequencies.get(arr[i]);
                current++;
                frequencies.replace(arr[i], current);
            }
            if (!frequencies.containsKey(arr[i])) {
                frequencies.put(arr[i], 1);
            }
        }

        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minKey = arr[0];
            for (int j = 0; j < arr.length; j++) {
                int current = frequencies.get(arr[j]);
                if ((current < min) && current > 0) {
                    min = current;
                    minKey = arr[j];
                }
            }
            int val = frequencies.get(minKey);
            val--;
            frequencies.replace(minKey, val);
        }

        int unique = 0;
        for (int key : frequencies.keySet()) {
            if (frequencies.get(key) > 0) {
                unique++;
            }
        }

        System.out.println(unique);
    }
}
