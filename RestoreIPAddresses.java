/*
 * https://leetcode.com/problems/restore-ip-addresses/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {

        String input = "25525511135";
        restoreIP(input);
    }

    public static void restoreIP(String input) {

        int i;
        for (i = 0; i < input.length() - 3; i++) {
            int j;
            for (j = i + 1; j < input.length() - 2; j++) {
                int k;
                for (k = j + 1; k < input.length() - 1; k++) {
                    int l;
                    for (l = k + 1; l < input.length(); l++) {
                        String[] arr = input.split("");
                        String current = getBefore(arr, i, 0) + "." + getBefore(arr, j, i + 1) + "." + getBefore(arr, k, j + 1) + "." + getBefore(arr, l, k + 1);

                        if (l < input.length() - 1) {
                            current = current + "." + getAfter(arr, l + 1);
                        }

                        String[] split = current.split("\\.");
                        if (split.length == 4) {

                            if (validate(split)) {
                                System.out.println(current);
                            }
                        }
                    }
                }
            }
        }
    }

    public static String getBefore(String[] x, int index, int start) {

        String result = "";

        for (int i = start; i <= index; i++) {
            result = result + x[i];
        }

        return result;
    }

    public static String getAfter(String[] x, int index) {

        String result = "";

        for (int i = index; i < x.length; i++) {
            result = result + x[i];
        }

        return result;
    }

    public static boolean validate(String[] split) {

        Integer[] x = new Integer[split.length];

        for (int i = 0; i < split.length; i++) {
            x[i] = Integer.valueOf(split[i]);
        }

        return x[0] <= 255 && x[1] <= 255 && x[2] <= 255 && x[3] <= 255;
    }
}
