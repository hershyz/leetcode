/*
* https://leetcode.com/problems/uncommon-words-from-two-sentences/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        String A = "apple apple";
        String B = "banana";
        run(A, B);
    }

    public static void run(String A, String B) {

        String[] a = A.split(" ");
        String[] b = B.split(" ");

        int i;
        for (i = 0; i < a.length; i++) {

            String currentWord = a[i];
            if (!containsDuplicateWord(currentWord, a)) {
                if (!arrContains(currentWord, b)) {
                    System.out.println(currentWord);
                }
            }
        }

        int j;
        for (j = 0; j < b.length; j++) {

            String currentWord = b[j];
            if (!containsDuplicateWord(currentWord, b)) {
                if (!arrContains(currentWord, a)) {
                    System.out.println(currentWord);
                }
            }
        }
    }

    public static boolean arrContains(String word, String[] arr) {

        int i;
        boolean contains = false;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                contains = true;
            }
        }

        return contains;
    }

    public static boolean containsDuplicateWord(String word, String[] arr) {

        boolean containsDuplicate = false;
        int startIndex = 0;
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                startIndex = i;
                break;
            }
        }

        int j;
        for (j = startIndex + 1; j < arr.length; j++) {
            if (arr[j].equals(word)) {
                containsDuplicate = true;
            }
        }

        return containsDuplicate;
    }
}
