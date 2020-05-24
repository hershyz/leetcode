/*
* https://leetcode.com/problems/number-of-substrings-containing-all-three-characters/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        String s = "abc";
        numberOfSubstrings(s);
    }

    public static void numberOfSubstrings(String s) {

        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {

                String current = "";

                for (int n = i; n <= j; n++) {
                    current = current + s.charAt(n);
                }

                if (current.contains("a") && current.contains("b") && current.contains("c")) {
                    counter++;
                }
            }
        }

        System.out.println(counter);
    }
}
