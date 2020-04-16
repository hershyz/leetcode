/*
* https://leetcode.com/problems/shortest-palindrome/
* Difficulty: HARD
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String str = "aacecaaa";
        run(str);
    }

    public static void run(String S) {

        String[] s = S.split("");

        if (containsDuplicateChar(S)) {

            String result = "";
            boolean valid = true;
            int pivotIndex = 0;

            int i;
            for (i = 0; i < s.length; i++) {

                int left = i - 1;
                int right = i + 1;

                if (left >= 0 && right < s.length) {
                    if (s[left].equals(s[right])) {
                        while (left > 0 && right < s.length - 1) {
                            left--;
                            right++;

                            if (s[left].equals(s[right])) {
                                valid = true;
                                pivotIndex = i;
                            }
                            if (!s[left].equals(s[right])) {
                                valid = false;
                            }
                        }
                    }
                }
            }

            if (valid) {
                int right = s.length - 1;
                int left = 0;

                while (right >= pivotIndex && left <= pivotIndex) {

                    if (!s[right].equals(s[left])) {
                        result = result + s[right];
                        break;
                    }

                    right--;
                    left++;
                }

                System.out.println(result + S);
            }

            return;
        }

        String result = "";
        int i;
        for (i = s.length - 1; i > 0; i--) {
            result = result + s[i];
        }

        System.out.println(result + S);
        return;
    }

    public static boolean containsDuplicateChar(String S) {

        String[] s = S.split("");
        List<String> usedChars = new ArrayList<>();

        int i;
        for (i = 0; i < s.length; i++) {
            if (usedChars.contains(s[i])) {
                return true;
            }

            usedChars.add(s[i]);
        }

        return false;
    }
}
