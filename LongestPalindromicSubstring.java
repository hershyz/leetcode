/*
 * https://leetcode.com/problems/longest-palindromic-substring/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        String input = "cbbd";
        run(input);
    }

    public static boolean isPalindrome(String s) {
        String[] arr = s.split("");
        String reversed = "";
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            reversed = reversed + arr[i];
        }
        if (reversed.equals(s)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String findSubstring(String[] arr, int l, int r) {

        int i;
        String s = "";
        for (i = l; i <= r; i++) {
            s = s + arr[i];
        }

        return s;
    }

    public static void run(String s) {

        String biggestPalindrome = "";
        String[] arr = s.split("");

        int l;
        for (l = 0; l < arr.length; l++) {
            int r;
            for (r = l; r < arr.length; r++) {
                String sub = findSubstring(arr, l, r);
                if (isPalindrome(sub)) {
                    if (sub.length() > biggestPalindrome.length()) {
                        biggestPalindrome = sub;
                    }
                }
            }
        }

        System.out.println(biggestPalindrome);
    }
}
