/*
 * https://leetcode.com/problems/minimum-genetic-mutation/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {

        String start = "AAAAACCC";
        String end = "AACCCCCC";
        String[] bank = new String[]{"AACCGGTA", "AACCGCTA", "AAACGGTA"};

        minMutation(start, end, bank);
    }

    public static void minMutation(String start, String end, String[] bank) {
        System.out.println(difference(start, end));
    }

    public static int difference(String a, String b) {

        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }
}
