/*
 * https://leetcode.com/problems/delete-operation-for-two-strings/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        String word1 = "sea";
        String word2 = "eat";
        steps(word1, word2);
    }

    public static void steps(String word1, String word2) {
        int max = 0;
        for (int i = 0; i < word1.length(); i++) {
            for (int j = i; j < word1.length(); j++) {
                String sub = "";
                for (int k = i; k <= j; k++) {
                    sub = sub + word1.charAt(k);
                }
                if (word2.contains(sub)) {
                    if (sub.length() > max) {
                        max = sub.length();
                    }
                }
            }
        }
        System.out.println((word1.length() - max) + (word2.length() - max));
    }
}
