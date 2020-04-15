/*
* https://leetcode.com/problems/super-ugly-number/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int n = 12;
        int[] primes = new int[]{2, 7, 13, 19};
        run(n, primes);
    }

    public static void run(int n, int[] primes) {

        if (n == 1) {
            System.out.println(1);
            return;
        }

        int current = 1;
        int i = 0;

        while (i < n) {
            current++;
            if (isDivisibleByNums(current, primes) && !isPrime(current)) {
                System.out.println("current = " + current);
                i++;
            }
        }

        System.out.println(current);
    }

    public static boolean isDivisibleByNums(int n, int[] nums) {

        int i;
        for (i = 0; i < nums.length; i++) {
            if (isDivisible(n, nums[i])) {
                return true;
            }
        }

        return false;
    }

    public static boolean isDivisible(double n, double k) {

        double result = n / k;
        if (Math.round(result) == result) {
            return true;
        }

        return false;
    }

    public static boolean isPrime(int n) {

        if (n == 2) {
            return true;
        }

        if (!isDivisible(n, 2)) {
            return true;
        }

        return false;
    }
}
