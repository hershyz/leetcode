/*
* https://leetcode.com/problems/unique-morse-code-words/
* Difficulty: EASY
* */

import java.util.Arrays;

public class Main {

    public static String[] morseMappings = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    public static String letters = "abcdefghijklmnopqrstuvwxyz";

    public static void main(String[] args) {
        String[] words = new String[]{"gin", "zen", "gig", "msg"};
        uniqueMorseRepresentations(words);
    }

    public static void uniqueMorseRepresentations(String[] words) {
        String[] mappings = new String[words.length];
        int uniqueCounter = 1;
        Arrays.fill(mappings, "");
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words[i].length(); j++) {
                mappings[i] = mappings[i] + morseMappings[getLetterPos(words[i].charAt(j))];
            }
        }
        for (int i = 1; i < mappings.length; i++) {
            if (!mappings[i].equals(mappings[i - 1])) {
                uniqueCounter++;
            }
        }
        System.out.println(uniqueCounter);
    }

    public static int getLetterPos(char c) {
        for (int i = 0; i < letters.length(); i++) {
            if (letters.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}
