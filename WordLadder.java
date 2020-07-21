/*
 * https://leetcode.com/problems/word-ladder/
 * Difficulty: MEDIUM
 * */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = new String[]{"hot","dot","dog","lot","log","cog"};
        ladderLength(beginWord, endWord, wordList);
    }

    public static void ladderLength(String beginWord, String endWord, String[] _wordList) {

        List<String> wordList = new ArrayList<>();

        for (String word : _wordList) {
            wordList.add(word);
        }

        if (!wordList.contains(endWord)) {
            System.out.println(0);
            return;
        }

        Queue<String> queue = new LinkedList();
        queue.offer(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String currentWord = queue.poll();
                char[] wordChars = currentWord.toCharArray();
                for (int j = 0; j < wordChars.length; j++) {
                    char originalChar = wordChars[j];
                    for (char c= 'a'; c < 'z'; c++) {
                        if (wordChars[j] == c) continue;
                        wordChars[j] = c;
                        String newWord = String.valueOf(wordChars);
                        if (newWord.equals(endWord)) {
                            System.out.println(level + 1);
                            return;
                        }
                        if (wordList.contains(newWord)) {
                            queue.offer(newWord);
                            wordList.remove(newWord);
                        }
                    }

                    wordChars[j] = originalChar;
                }
            }
            level++;
        }

        System.out.println(0);
    }
}
