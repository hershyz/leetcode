/*
 * https://leetcode.com/problems/backspace-string-compare/
 * Difficulty: EASY
 * */

public class Main {

    public static void main(String[] args) {
        String s = "a#c";
        String t = "b";
        backspaceCompare(s, t);
    }

    public static void backspaceCompare(String S, String T) {

        String s = S;
        String t = T;

        while (s.contains("#")) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '#') {
                    s = del(s, i);
                }
            }
        }

        while (t.contains("#")) {
            for (int i = 0; i < t.length(); i++) {
                if (t.charAt(i) == '#') {
                    t = del(t, i);
                }
            }
        }
        
        System.out.println(s.equals(t));
    }

    public static String del(String x, int index) {

        String deleted = "";

        for (int i = 0; i < x.length(); i++) {
            if (i != index) {
                if (i != index - 1) {
                    deleted = deleted + x.charAt(i);
                }
            }
        }

        return deleted;
    }
}
