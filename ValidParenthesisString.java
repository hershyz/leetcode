/*
* https://leetcode.com/problems/valid-parenthesis-string/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        String input = "(*)))";
        checkValidString(input);
    }

    public static void checkValidString(String input) {

        if (input.length() < 1) {
            System.out.println(true);
            return;
        }

        int count = 0;
        boolean hasStar = false;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(') {
                count++;
            }
            if (input.charAt(i) == ')') {
                count--;
            }
            if (input.charAt(i) == '*') {
                hasStar = true;
            }
        }

        if (count == 0) {
            System.out.println(true);
            return;
        }

        if (count != 0 && hasStar) {
            if (count == -1 || count == 1) {
                System.out.println(true);
                return;
            }

            System.out.println(false);
            return;
        }

        if (count != 0) {
            System.out.println(false);
            return;
        }
    }
}
