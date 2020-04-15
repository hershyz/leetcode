/*
* https://leetcode.com/problems/shifting-letters/
* Difficulty: MEDIUM
* */

public class Main {

    static String rawLetters = "abcdefghijklmnopqrstuvwxyz";
    static String[] letters = rawLetters.split("");

    public static void main(String[] args) {

        String s = "abc";
        int[] shifts = new int[]{3, 5, 9};
        run(s, shifts);
    }

    public static void run(String S, int[] shifts) {

        String[] s = S.split("");

        int a;
        for (a = 0; a < s.length; a++) {

            int b;
            for (b = a; b >= 0; b--) {

                int currentLetterIndex = findIndex(s[b]);
                int newIndex = currentLetterIndex + shifts[a];
                s[b] = letters[newIndex];
            }
        }

        int c;
        for (c = 0; c < s.length; c++) {
            System.out.println(s[c]);
        }
    }

    public static int findIndex(String letter) {

        int i;
        for (i = 0; i < letters.length; i++) {
            if (letters[i].equals(letter)) {
                return i;
            }
        }

        return 0;
    }
}
