/*
* https://leetcode.com/problems/prime-palindrome/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        run(13);
    }

    public static void run(int n) {
        int currentPrime = findNextPrime(n);
        while (!isPalindrome(currentPrime)) {
            currentPrime = findNextPrime(currentPrime);
        }
        System.out.println(currentPrime);
    }

    public static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        String[] arr = s.split("");
        String result = "";
        int i;
        for (i = arr.length - 1; i >= 0; i--) {
            result = result + arr[i];
        }
        if (result.equals(s)) {
            return true;
        }
        else {
            return false;
        }
    }

    public static int findNextPrime(int previous) {
        int next = previous + 1;
        while (!isPrime(next)) {
            next++;
        }

        return next;
    }

    public static boolean isDivisible(double x, double y) {
        double result = x / y;
        if (Math.round(result) == result) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int x) {

        int i;
        for (i = x - 1; i > 1; i--) {
            if (isDivisible(x, i)) {
                return false;
            }
        }

        return true;
    }
}
