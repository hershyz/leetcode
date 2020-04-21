/*
* https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {
        int n = 4421;
        subtractProductAndSum(n);
    }

    public static void subtractProductAndSum(int n) {

        int sum = 0;
        int product = 1;
        String[] arr = String.valueOf(n).split("");

        for (int i = 0; i < arr.length; i++) {

            int current = Integer.valueOf(arr[i]);
            sum = sum + current;
            product = product * current;
        }

        System.out.println(product - sum);
    }
}
