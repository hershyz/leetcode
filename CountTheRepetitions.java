/*
 * https://leetcode.com/problems/count-the-repetitions/
 * Difficulty: HARD
 * */

public class Main {

    public static void main(String[] args) {
        getMaxRepetitions("acb", 4, "ab", 2);
    }

    public static void getMaxRepetitions(String s1, int n1, String s2, int n2) {

        String a = "";
        String b = "";
        for (int i = 0; i < n1; i++) {
            a = a + s1;
        }
        for (int i = 0; i < n2; i++) {
            b = b + s2;
        }

        int lastSuccessful = 1;
        while (verify(a, b, lastSuccessful)) {
            lastSuccessful++;
        }

        System.out.println(lastSuccessful - 1);
    }

    public static boolean verify(String bank, String _test, int x) {

        String test = "";
        for (int i = 0; i < x; i++) {
            test = test + _test;
        }

        String endWord = "";
        int lastIndex = 0;
        for (int i = 0; i < test.length(); i++) {
            char current = test.charAt(i);
            for (int j = lastIndex; j < bank.length(); j++) {
                if (bank.charAt(j) == current) {
                    lastIndex = j;
                    endWord = endWord + current;
                    break;
                }
            }
        }

        return test.equals(endWord);
    }
}
