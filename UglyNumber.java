/*
* https://leetcode.com/problems/ugly-number/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
        check(14);
    }

    public static void check(double num) {
        double lastPrime = 5;
        while (lastPrime < num) {
            lastPrime++;
            if (checkPrime(lastPrime)) {
                double result = num / lastPrime;
                if (Math.round(result) == result) {
                    System.out.println(false);
                    return;
                }
            }
        }

        System.out.println(true);
    }

    public static boolean checkPrime(double num) {
        double x;
        for (x = 2; x < num; x++) {
            double result = num / x;
            if (Math.round(result) == result) {
                return false;
            }
        }
        return true;
    }
}
