/*
* https://leetcode.com/problems/minimum-score-triangulation-of-polygon/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int[] input = new int[]{1,3,1,4,1,5};
        run(input);
    }

    public static void run(int[] input) {
        int i;
        for (i = 0; i < input.length; i++) {
            int j;
            for (j = 0; j < input.length - 1; j++) {
                if (input[j] > input[j + 1]) {
                    int temp;
                    temp = input[j + 1];
                    input[j + 1] = input[j];
                    input[j] = temp;
                }
            }
        }

        int k;
        int current = 0;
        for (k = 2; k < input.length; k++) {

            current = current + (input[0] * input[1] * input[k]);
        }

        System.out.println(current);
    }
}
