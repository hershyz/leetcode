/*
* https://leetcode.com/problems/longest-word-in-dictionary-through-deleting/
* Difficulty: MEDIUM
* */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String case1 = "abpcplea";
        String[] d1 = new String[]{"ale","apple","monkey","plea"};
        showLongestPossibleString(case1, d1);
    }

    public static void showLongestPossibleString(String raw, String[] dictionary) {

        String[] wordAsArr = raw.split("");
        int maxContainingCharacters = 0;
        String maxContainingCharacterWord = "";

        int i;
        for (i = 0; i < dictionary.length; i++) {

            int currentCharactersContained = findCharactersContained(dictionary[i], raw);

            if (currentCharactersContained > maxContainingCharacters) {

                maxContainingCharacters = currentCharactersContained;
                maxContainingCharacterWord = dictionary[i];
            }
        }

        System.out.println(maxContainingCharacterWord);
    }

    //Finds how many characters of word1 word2 contains:
    public static int findCharactersContained(String _word1, String _word2) {

        int charactersContained = 0;
        String[] word1 = _word1.split("");
        String[] word2 = _word2.split("");

        int i;
        for (i = 0; i < word1.length; i++) {

            if (Arrays.asList(word2).contains(word1[i])) {
                charactersContained++;
            }
        }

        return charactersContained;
    }
}
