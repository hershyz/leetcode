/*
* https://leetcode.com/problems/find-all-anagrams-in-a-string/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        String S = "cbaebabacd";
        String p = "abc";
        run(S, p);
    }

    public static void run(String S, String p) {

        String[] s = S.split("");
        int l = p.length();

        int i;
        for (i = 0; i < s.length; i++) {

            int rightBound = i + l;
            if (rightBound <= s.length) {
                String currentSub = getStringFromIndexes(i, rightBound, s);
                if (containsAnagram(currentSub, p)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean containsAnagram(String S, String P) {

        boolean contains = true;

        String[] s = S.split("");
        String[] p = P.split("");

        int i;
        for (i = 0; i < p.length; i++) {
            if (!containsChar(s, p[i])) {
                contains = false;
            }
        }

        return contains;
    }

    public static boolean containsChar(String[] s, String c) {

        int i;
        for (i = 0; i < s.length; i++) {
            if (s[i].equals(c)) {
                return true;
            }
        }

        return false;
    }

    public static String getStringFromIndexes(int left, int right, String[] s) {

        String result = "";

        int i;
        for (i = left; i < right; i++) {
            result = result + s[i];
        }

        return result;
    }
}
