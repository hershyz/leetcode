/*
* https://leetcode.com/problems/string-compression/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        String[] input = new String[]{"a","b","b","b","b","b","b","b","b","b","b","b","b"};
        compress(input);
    }

    public static void compress(String[] chars) {

        String output = "";
        int counter = 0;

        for (int i = 0; i < chars.length; i++) {

            counter++;

            if (i < chars.length - 1) {
                if (!chars[i + 1].equals(chars[i])) {
                    if (counter > 1) {
                        output = output + chars[i] + counter;
                    }
                    else {
                        output = output + chars[i];
                    }
                    counter = 0;
                }
            }

            if (i == chars.length - 1) {
                if (counter > 1) {
                    output = output + chars[i] + counter;
                }
                else {
                    output = output + chars[i];
                }
                counter = 0;
            }
        }

        System.out.println(output);
    }
}
