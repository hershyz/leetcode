/*
* https://leetcode.com/problems/word-frequency/
* Difficulty: MEDIUM
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        String input = "the day is sunny the the the sunny is is";
        run(input);
    }

    public static void run(String input) {

        List<String> unique = new ArrayList<>();
        String[] words = input.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (!unique.contains(words[i])) {
                unique.add(words[i]);
                count(input, words[i]);
            }
        }
    }

    public static void count(String input, String word) {

        String[] words = input.split(" ");
        int counter = 0;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                counter++;
            }
        }

        System.out.println(word + ", " + counter);
    }
}
