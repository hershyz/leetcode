/*
 * https://leetcode.com/problems/break-a-palindrome/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        System.out.println(breakPalindrome("aa"));
    }

    public static String breakPalindrome(String palindrome) {

        if (palindrome.length() < 2) {
            return "";
        }

        char[] p = palindrome.toCharArray();
        for (int i = 0; i < p.length; i++) {
            if (p[i] != 'a') {

                char temp = p[i];
                p[i] = 'a';

                if (!isPalindrome(getStringFromChars(p))) {
                    break;
                }
                if (isPalindrome(getStringFromChars(p))) {
                    p[i] = 'b';
                    break;
                }
            }
        }
        if (isPalindrome(getStringFromChars(p))) {
            p[p.length - 1] = 'b';
        }

        String end = getStringFromChars(p);
        return end;
    }

    public static boolean isPalindrome(String s) {
        String a = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            a = a + s.charAt(i);
        }
        return a.equals(s);
    }

    public static String getStringFromChars(char[] x) {
        String end = "";
        for (char c : x) {
            end = end + c;
        }
        return end;
    }
}
