/*
 * https://leetcode.com/problems/remove-palindromic-subsequences/
 * Difficulty: EASY
 * */

public class Main {

    public static void main(String[] args) {

        String s = "";
        removePalindromicSubsequences(s);
    }

    public static void removePalindromicSubsequences(String s) {

        String result = s;
        int steps = 0;

        int left;
        for (left = 0; left < s.length(); left++) {

            int right;
            for (right = s.length() - 1; right >= left; right--) {

                String current = getStringFromBounds(s, left, right);

                if (isPalindrome(current)) {

                    result = result.replace(current, "");
                    steps++;

                    if (result.length() == 0) {
                        break;
                    }
                }
            }

            if (result.length() == 0) {
                break;
            }
        }

        System.out.println(steps);
    }

    public static boolean isPalindrome(String s) {

        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed = reversed + String.valueOf(s.charAt(i));
        }

        return reversed.equals(s);
    }

    public static String getStringFromBounds(String s, int left, int right) {

        String result = "";

        for (int i = left; i <= right; i++) {
            result = result + s.charAt(i);
        }

        return result;
    }
}
