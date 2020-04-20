/*
 * https://leetcode.com/problems/power-of-two/
 * Difficulty: EASY
 * */

public class Main {

    public static void main(String[] args) {
        int input = 218;
        run(input);
    }

    public static void run(int input) {

        int i = 0;
        while (Math.pow(2, i) != input) {
            i++;
            if (Math.pow(2, i) > input) {
                System.out.println("false");
                return;
            }
        }

        System.out.println("true");
    }
}
