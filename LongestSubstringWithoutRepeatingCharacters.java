/*
* https://leetcode.com/problems/longest-substring-without-repeating-characters/
* Difficulty: MEDIUM
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        run("abcabcbb");
        run("bbbbb");
        run("pwwkew");
    }

    public static void run(String _s) {

        if (!containsDuplicateChar(_s)) {
            System.out.println(_s + ", " + _s.length());
            return;
        }

        String[] s = _s.split("");
        String longestUniqueWord = "";

        int i;
        for (i = s.length - 1; i > 0; i--) {

            int j;
            for (j = 0; j < s.length; j++) {

                int rightIndex = j + i;
                if (rightIndex < s.length) {

                    String currentSubstring = getString(s, j, rightIndex);
                    if (currentSubstring.length() > longestUniqueWord.length() && !containsDuplicateChar(currentSubstring)) {
                        longestUniqueWord = currentSubstring;
                    }
                }
            }
        }

        if (longestUniqueWord.length() < 1) {
            longestUniqueWord = s[0];
        }

        System.out.println(longestUniqueWord + ", " + longestUniqueWord.length());
    }

    public static boolean containsDuplicateChar(String _s) {

        String[] s = _s.split("");

        int i;
        List<String> chars = new ArrayList<>();
        for (i = 0; i < s.length; i++) {

            if (chars.contains(s[i])) {
                return true;
            }

            chars.add(s[i]);
        }
        return false;
    }

    public static String getString(String[] s, int leftIndex, int rightIndex) {

        String x = "";

        int i;
        for (i = leftIndex; i <=rightIndex; i++) {
            x = x + s[i];
        }

        return x;
    }
}
