/*
* https://leetcode.com/problems/valid-palindrome-ii/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
        String input = "abca";
        System.out.println(validPalindrome(input));
    }

    public static boolean validPalindrome(String s) {
        if (isPalindrome(s)) {
            return true;
        }
        if (!isPalindrome(s)) {

            String[] arr = s.split("");

            int i;
            for (i = 0; i < arr.length; i++) {
                String currentDeleted = "";
                int j;
                for (j = 0; j < arr.length; j++) {
                    if (j != i) {
                        currentDeleted = currentDeleted + arr[j];
                    }
                }
                if (isPalindrome(currentDeleted)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPalindrome(String s) {

        String[] arr = s.split("");
        String reversedString = "";

        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            reversedString = reversedString + arr[i];
        }

        if (reversedString.equals(s)) {
            return true;
        }
        else {
            return false;
        }
    }
}
