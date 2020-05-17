/*
 * https://leetcode.com/problems/replace-the-substring-for-balanced-string/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {

        String input = "QQQQ";
        balancedString(input);
    }

    public static void balancedString(String input) {

        int desiredAmount = input.length() / 4;
        int q = 0;
        int w = 0;
        int e = 0;
        int r = 0;
        int toBalance = 0;

        for (int i = 0; i < input.length(); i++) {

            String currentChar = String.valueOf(input.charAt(i));

            if (currentChar.equals("Q")) {
                q++;

                if (q > desiredAmount) {
                    toBalance++;
                }
            }

            if (currentChar.equals("W")) {
                w++;

                if (w > desiredAmount) {
                    toBalance++;
                }
            }

            if (currentChar.equals("E")) {
                e++;

                if (e > desiredAmount) {
                    toBalance++;
                }
            }

            if (currentChar.equals("R")) {
                r++;

                if (r > desiredAmount) {
                    toBalance++;
                }
            }
        }

        System.out.println(toBalance);
    }
}
