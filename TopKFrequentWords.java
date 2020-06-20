/*
 * https://leetcode.com/problems/top-k-frequent-words/
 * Difficulty: MEDIUM
 * */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[]{"the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"};
        topFrequent(input, 4);
    }

    public static void topFrequent(String[] words, int k) {

        List<String> strings = new ArrayList<>();
        List<Integer> occurences = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            String currentWord = words[i];
            if (!strings.contains(currentWord)) {
                int counter = 0;
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(currentWord)) {
                        counter++;
                    }
                }
                strings.add(currentWord);
                occurences.add(counter);
            }
        }

        Object[] stringsArr = strings.toArray();
        Object[] occurencesArr = occurences.toArray();

        for (int i = 0; i < stringsArr.length; i++) {
            for (int j = 0; j < stringsArr.length - 1; j++) {
                int current = (Integer)occurencesArr[j];
                int next = (Integer)occurencesArr[j + 1];
                if (current > next) {
                    occurencesArr[j] = next;
                    occurencesArr[j + 1] = current;
                    Object stringTemp = stringsArr[j];
                    stringsArr[j] = stringsArr[j + 1];
                    stringsArr[j + 1] = stringTemp;
                }
            }
        }

        for (int i = stringsArr.length - 1; i >= stringsArr.length - k; i--) {
            System.out.println(stringsArr[i] + " - " + occurencesArr[i]);
        }
    }
}
