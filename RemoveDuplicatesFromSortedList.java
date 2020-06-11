/*
* https://leetcode.com/problems/remove-duplicates-from-sorted-list/
* Difficulty: EASY
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int[] array = new int[]{1, 1, 2, 3, 3};
        deleteDuplicates(array);
    }

    public static void deleteDuplicates(int[] array) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (i > 0) {
                if (array[i] != array[i - 1]) {
                    result.add(array[i]);
                }
            }
            else {
                result.add(array[i]);
            }
        }

        for (int j = 0; j < result.size(); j++) {
            System.out.println(result.get(j));
        }
    }
}
