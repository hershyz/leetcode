/*
* https://leetcode.com/problems/unique-number-of-occurrences/
* Difficulty: EASY
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Integer[] arr = new Integer[]{-3,0,1,-3,1,1,1,-3,10,0};
        run(arr);
    }

    public static void run(Integer[] arr) {

        arr = sort(arr);
        List<Integer> occurrences = new ArrayList<>();
        int currentUniqueOccurences = 0;
        int lastNumber = arr[0];

        int i;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] == lastNumber) {
                currentUniqueOccurences++;
            }
            else {
                occurrences.add(currentUniqueOccurences);
                currentUniqueOccurences = 1;
                lastNumber = arr[i];

                try {
                    if (arr[i + 1] != arr[i] || i == arr.length - 1) {
                        occurrences.add(currentUniqueOccurences);
                    }
                }
                catch (Exception e) {
                    occurrences.add(currentUniqueOccurences);
                }
            }
        }

        int j;
        for (j = 0; j < occurrences.size(); j++) {
            if (j != occurrences.size() - 1) {
                if (occurrences.get(j) == occurrences.get(j + 1)) {
                    System.out.println("false");
                    return;
                }
            }
        }

        System.out.println("true");
    }

    public static Integer[] sort(Integer[] arr) {

        int i;
        for (i = 0; i < arr.length + 1; i++) {

            int j;
            for (j = 0; j < arr.length - 1; j++) {

                if (arr[j + 1] < arr[j]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }
}
