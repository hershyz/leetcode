/*
* https://leetcode.com/problems/print-words-vertically/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        String words = "HOW ARE YOU";
        printVertically(words);
    }

    public static void printVertically(String words) {

        String[] arr = words.split(" ");
        String[] vertical = new String[arr.length];

        int maxLengthWord = 0;
        int a;
        for (a = 0; a < arr.length; a++) {
            if (arr[a].length() > maxLengthWord) {
                maxLengthWord = arr[a].length();
            }
        }

        int i;
        for (i = 0; i < maxLengthWord; i++) {

            String verticalWord = "";

            int j;
            for (j = 0; j < arr.length; j++) {
                verticalWord = verticalWord + arr[j].split("")[i];
            }

            System.out.println(verticalWord);
        }
    }
}
