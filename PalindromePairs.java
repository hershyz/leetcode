/*
 * https://leetcode.com/problems/palindrome-pairs/
 * Difficulty: HARD
 * */

public class Main {

    public static void main(String[] args) {

        String[] words = new String[]{"abcd","dcba","lls","s","sssll"};
        palindromePairs(words);
    }

    public static void palindromePairs(String[] words) {

        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (j != i) {
                    String word = words[i] + words[j];
                    String temp = "";
                    String[] split = word.split("");
                    for (int k = split.length - 1; k >= 0; k--) {
                        temp = temp + split[k];
                    }
                    if (temp.equals(word)) {
                        System.out.println(i + ", " + j);
                    }
                }
            }
        }
    }
}
