import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        
    }

    public static int findLengthOfShortestSubarray(int[] arr) {

        if (arr.length == 0 || arr.length == 1) {
            return 0;
        }

        boolean sorted = true;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                sorted = false;
                break;
            }
        }

        if (sorted) {
            return 0;
        }

        int passStart = 0;
        int passStart2 = 0;
        int min = arr.length;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                passStart = i;
                passStart2 = i - 1;
                break;
            }
        }

        for (int i = passStart; i < arr.length; i++) {
            if (isSortedConditional(arr, passStart, i)) {
                int diff = (i - passStart) + 1;
                if (diff < min) {
                    min = diff;
                }
            }
        }

        for (int i = passStart2; i < arr.length; i++) {
            if (isSortedConditional(arr, passStart2, i)) {
                int diff = (i - passStart2) + 1;
                if (diff < min) {
                    min = diff;
                }
            }
        }

        int l = 0;
        int r = min - 2;
        while (r < arr.length) {
            if (isSortedConditional(arr, l, r)) {
                int diff = (r - l) + 1;
                if (diff < min) {
                    min = diff;
                }
            }
            l++;
            r++;
        }

        return min;
    }

    public static boolean isSortedConditional(int[] arr, int omitL, int omitR) {

        List<Integer> check = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (i >= omitL && i <= omitR) {

            }
            else {
                check.add(arr[i]);
            }
        }

        for (int i = 1; i < check.size(); i++) {
            if (check.get(i) < check.get(i - 1)) {
                return false;
            }
        }

        return true;
    }
}
