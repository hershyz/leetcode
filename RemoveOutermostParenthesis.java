/*
 * https://leetcode.com/problems/remove-outermost-parentheses/
 * Difficulty: EASY
 * */

public class Main {

    public static void main(String[] args) {

        String s = "()()";
        removeOutermostParentheses(s);
    }

    public static void removeOutermostParentheses(String s) {

        int leftIndex = -1;
        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                if (leftIndex == -1) {
                    leftIndex = i;
                }
                leftCount++;
            }

            if (s.charAt(i) == ')') {
                rightCount++;
            }

            if (leftCount == rightCount) {

                String primitive = getStringFromBounds(leftIndex, i, s);
                String resulting = "";

                for (int j = 1; j < primitive.length() - 1; j++) {
                    resulting = resulting + primitive.charAt(j);
                }

                System.out.print(resulting);

                leftIndex = -1;
                leftCount = 0;
                rightCount = 0;
            }
        }
    }

    public static String getStringFromBounds(int left, int right, String s) {

        String result = "";
        for (int i = left; i <= right; i++) {
            result = result + s.charAt(i);
        }

        return result;
    }
}
