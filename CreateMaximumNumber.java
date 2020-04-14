/*
* https://leetcode.com/problems/create-maximum-number/
* Difficulty: HARD
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] nums1 = new int[]{3, 4, 6, 5};
        int[] nums2 = new int[]{9, 1, 2, 5, 8, 3};
        int k = 5;

        run(nums1, nums2, k);
    }

    public static void run(int[] nums1, int[] nums2, int k) {

        int[] result = new int[k];
        int max = Integer.MIN_VALUE;

        int a;
        for (a = 0; a < nums1.length; a++) {
            if (nums1[a] > max) {
                max = nums1[a];
            }
        }

        int b;
        for (b = 0; b < nums2.length; b++) {
            if (nums2[b] > max) {
                max = nums2[b];
            }
        }

        result[0] = max;

        int i;
        for (i = 1; i < k; i++) {
            result[i] = findNextSmallest(result[i - 1], nums1, nums2);
        }

        int j;
        for (j = 0; j < result.length; j++) {
            System.out.println(result[j]);
        }
    }

    public static int findNextSmallest(int current, int[] nums1, int[] nums2) {

        List<Integer> aIgnore = new ArrayList<>();
        List<Integer> bIngnore = new ArrayList<>();

        int nextMax = Integer.MIN_VALUE;

        int a;
        for (a = 0; a < nums1.length; a++) {

            if (nums1[a] < current) {
                if (nums1[a] > nextMax) {
                    if (!aIgnore.contains(a)) {
                        nextMax = nums1[a];
                        aIgnore.add(a);
                    }
                }
            }
        }

        int b;
        for (b = 0; b < nums2.length; b++) {

            if (nums2[b] < current) {
                if (nums2[b] > nextMax) {
                    if (!bIngnore.contains(b)) {
                        nextMax = nums2[b];
                        bIngnore.add(b);
                    }
                }
            }
        }

        return nextMax;
    }
}
