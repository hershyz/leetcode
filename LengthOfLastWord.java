/*
 * https://leetcode.com/problems/length-of-last-word/
 * Difficulty: EASY
 * */

public class Main {

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

    public static int lengthOfLastWord(String s) {
        return s.split(" ")[s.split(" ").length - 1].length();
    }
}
