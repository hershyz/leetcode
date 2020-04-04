/*
* https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
	    int case1 = 234;
	    int case2 = 4421;
        run(case1);
        run(case2);
    }

    public static void run(int x) {

        String[] _split = String.valueOf(x).split("");
        int[] digits = new int[_split.length];
        int product = 1;
        int sum = 0;

        int i;
        for (i = 0; i < _split.length; i++) {
            digits[i] = Integer.parseInt(_split[i]);
        }

        int j;
        for (j = 0; j < digits.length; j++) {
            int currentDigit = digits[j];
            product = product * currentDigit;
            sum = sum + currentDigit;
        }

        int result = product - sum;

        System.out.println(result);
    }
}
