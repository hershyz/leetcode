/*
* https://leetcode.com/problems/factorial-trailing-zeroes/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
        int n = 10;
        trailingZeros(n);
    }

    public static void trailingZeros(int n) {

        double factorial = 1;
        int zeros = 0;

        for (int i = n; i > 1; i--) {
            factorial = factorial * i;
        }

        while (true) {

            factorial = factorial / 10;

            if (Math.round(factorial) == factorial) {
                zeros++;
            }
            if (Math.round(factorial) != factorial) {
                break;
            }
        }

        System.out.println(zeros);
    }
}
