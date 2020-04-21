/*
* https://leetcode.com/problems/decode-ways/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        String s = "12";
        numDecodings(s);
    }

    public static void numDecodings(String s) {

        String[] arr = s.split("");
        int i;
        for (i = 0; i < arr.length; i++) {
            int j;
            for (j = i; j < arr.length; j++) {
                int index = getIndex(arr, i, j);
                String alphabetIndex = getAlphabetIndex(index);
                if (alphabetIndex.length() > 0) {
                    System.out.print(alphabetIndex.toUpperCase());
                }
            }
            System.out.println("");
        }
    }

    public static String getAlphabetIndex(int i) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] arr = alphabet.split("");
        try {
            return arr[i - 1];
        }
        catch (Exception e) {
            return "";
        }
    }

    public static int getIndex(String[] arr, int l, int r) {

        String s = "";
        int i;
        for (i = l; i <= r; i++) {
            s = s + arr[i];
        }

        return Integer.parseInt(s);
    }
}
