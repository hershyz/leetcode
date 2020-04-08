/*
* https://leetcode.com/problems/word-subsets/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        String[] dictionary = new String[]{"amazon", "apple", "facebook", "google", "leetcode"};
        String[] subset = new String[]{"e", "o"};
        run(dictionary, subset);
    }

    public static void run(String[] dictionary, String[] subset) {

        int i;
        for (i = 0; i < dictionary.length; i++) {

            int j;
            boolean currentContainsChar = true;
            for (j = 0; j < subset.length; j++) {
                if (!containsSubstring(dictionary[i], subset[j])) {
                    currentContainsChar = false;
                }
            }

            if (currentContainsChar) {
                System.out.println(dictionary[i]);
            }
        }
    }

    public static boolean containsSubstring(String word, String c) {

        if (containsOneChar(c)) {
            return word.contains(c);
        }

        String[] csplit = c.split("");
        boolean contains = true;

        int i;
        for (i = 0; i < csplit.length; i++) {
            if (!word.contains(csplit[i])) {
                contains = false;
            }
        }

        return contains;
    }

    public static boolean containsOneChar(String c) {

        String[] csplit = c.split("");
        String x = csplit[0];

        int i;
        for (i = 0; i < csplit.length; i++) {
            if (!csplit[i].equals(x)) {
                return false;
            }
        }

        return true;
    }

    public static String findWordBetweenIndexes(int left, int right, String[] arr) {

        int i;
        String temp = "";
        for (i = left; i <= right; i++) {
            temp = temp + arr[i];
        }

        return temp;
    }
}
