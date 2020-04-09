/*
* https://leetcode.com/problems/rotate-function/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int[] A = new int[]{4, 3, 2, 6};
        run(A);
    }

    public static void run(int[] a) {

        int maxOutput = Integer.MIN_VALUE;
        int rotations = a.length;

        int i;
        for (i = 0; i < rotations; i++) {

            if (i == 0) {

                int current = 0;
                int j;
                for (j = 0; j < a.length; j++) {
                    int product = j * a[j];
                    current = current + product;
                }

                if (current > maxOutput) {
                    maxOutput = current;
                }
            }

            if (i > 0) {

                int current = 0;
                int j = a.length - i;
                int maxIndex = j - 1;
                int operationInt = 0;
                boolean run = true;

                while (run) {

                    int product = operationInt * a[j];
                    current = current + product;

                    if (j == a.length - 1) {
                        j = 0;
                        operationInt++;
                        product = operationInt * a[j];
                        current = current + product;
                    }

                    if (j == maxIndex) {
                        run = false;
                    }

                    operationInt++;
                    j++;
                }

                if (current > maxOutput) {
                    maxOutput = current;
                }
            }
        }

        System.out.println(maxOutput);
    }
}
