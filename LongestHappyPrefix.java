/*
* https://leetcode.com/problems/longest-happy-prefix/
* Difficulty: HARD
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        happyPrefix("level");
        happyPrefix("ababab");
        happyPrefix("leetcodeleet");
        happyPrefix("a");
    }

    public static void happyPrefix(String word) {

        List<String> prefixes = new ArrayList<>();
        List<String> suffixes = new ArrayList<>();
        String[] wordSplit = word.split("");

        //Finds prefixes:
        int a;
        for (a = 0; a < word.length(); a++) {

            String tempPrefix = "";

            int b;
            for (b = 0; b <= a; b++) {
                tempPrefix = tempPrefix + wordSplit[b];
            }

            if (!tempPrefix.equals(word)) {
                prefixes.add(tempPrefix);
            }
        }

        //Finds suffixes:
        int c;
        for (c = 0; c < word.length(); c++) {

            String tempSuffix = "";

            int d;
            for (d = c; d < word.length(); d++) {
                tempSuffix = tempSuffix + wordSplit[d];
            }

            if (!tempSuffix.equals(word)) {
                suffixes.add(tempSuffix);
            }
        }

        //Matches prefixes and suffixes:
        int maxMatchLength = 0;
        String maxMatchWord = "";

        int i;
        for (i = 0; i < prefixes.size(); i++) {

            int j;
            for (j = 0; j < suffixes.size(); j++) {
                if (prefixes.get(i).equals(suffixes.get(j))) {
                    if (prefixes.get(i).length() > maxMatchLength) {
                        maxMatchLength = prefixes.get(i).length();
                        maxMatchWord = prefixes.get(i);
                    }
                }
            }
        }

        System.out.println(maxMatchWord);
    }
}
