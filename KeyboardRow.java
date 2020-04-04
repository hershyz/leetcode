/*
* https://leetcode.com/problems/keyboard-row/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        String[] _case = new String[]{"Hello", "Alaska", "Dad", "Peace"};
        findWords(_case);
    }

    public static void findWords(String[] words) {

        String topRow = "qwertyuiop";
        String middleRow = "asdfghjkl";
        String bottomRow = "zxcvbnm";

        int i;
        for (i = 0; i < words.length; i++) {

            String currentWord = words[i];
            currentWord = currentWord.toLowerCase();

            if (containsLetters(currentWord, topRow) || containsLetters(currentWord, bottomRow) || containsLetters(currentWord, middleRow)) {
                System.out.println(currentWord);
            }
        }
    }

    public static boolean containsLetters(String word, String row) {

        boolean goodWord = true;
        String[] wordSplit = word.split("");

        int i;
        for (i = 0; i < wordSplit.length; i++) {
            if (!row.contains(wordSplit[i])) {
                goodWord = false;
            }
        }

        return goodWord;
    }
}
