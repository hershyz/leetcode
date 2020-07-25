/*
 * https://leetcode.com/problems/super-palindromes/
 * Difficulty: HARD
 * */

public class Main {

    public static void main(String[] args) {
        System.out.println(superpalindromesInRange("4", "1000"));
    }

    public static int superpalindromesInRange(String L, String R) {

        int leftBound = Integer.valueOf(L);
        int rightBound = Integer.valueOf(R);
        int counter = 0;

        for (int i = leftBound; i <= rightBound; i++) {
            String current = String.valueOf(i);
            double sqrt = Math.sqrt(i);
            if (Math.round(sqrt) == sqrt) {
                String _sqrt = String.valueOf((int)sqrt);
                String currentTest = "";
                String sqrtTest = "";
                for (int j = current.length() - 1; j >= 0; j--) {
                    currentTest = currentTest + current.charAt(j);
                }
                for (int k = _sqrt.length() - 1; k >= 0; k--) {
                    sqrtTest = sqrtTest + _sqrt.charAt(k);
                }
                if (sqrtTest.equals(_sqrt)) {
                    if (currentTest.equals(current)) {
                        counter++;
                    }
                }
            }
        }

        return counter;
    }
}
