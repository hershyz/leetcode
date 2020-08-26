/*
 * https://leetcode.com/problems/duplicate-zeros/
 * Difficulty: EASY
 * */

public class Main {

    public static void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0) {
                arr = insert(arr, i + 1);
                i++;
            }
        }
    }

    public static int[] insert(int[] arr, int index) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < index - 1; i++) {
            newArr[i] = arr[i];
        }
        newArr[index] = 0;
        int pos = index;
        for (int j = index + 1; j < arr.length; j++) {
            newArr[j] = arr[pos];
            pos++;
        }
        return newArr;
    }
}
