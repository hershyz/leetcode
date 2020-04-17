/*
 * https://leetcode.com/problems/solve-the-equation/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        String input = "x=x+2";
        run(input);
    }

    public static void run(String input) {

        String rawLeft = input.split("=")[0];
        String rawRight = input.split("=")[1];

        //Returns infinity if left and right sides of the equation are equal:
        if (rawLeft.equals(rawRight)) {
            System.out.println("infinite solutions");
            return;
        }

        //Simplifies the left and right sides by combining constants and coefficients, equation only contains + and - operations:
        double lcoefficient = 0;
        double lconstant = 0;
        double rcoefficient = 0;
        double rconstant = 0;

        String[] lArr = rawLeft.split("");
        String[] rArr = rawRight.split("");

        //Simplifies left constants:
        int a;
        for (a = 0; a <= lArr.length - 2; a++) {

            if (!lArr[a].equals("-") && !lArr[a].equals("+") && !lArr[a].equals("x") && a == 0) {
                lconstant = lconstant + Double.valueOf(lArr[a]);
            }

            if (lArr[a].equals("-") && !lArr[a + 1].equals("x") && !lArr[a + 2].equals("x")) {
                lconstant = lconstant - Double.valueOf(lArr[a + 1]);
            }

            if (lArr[a].equals("+") && !lArr[a + 1].equals("x") && !lArr[a + 2].equals("x")) {
                lconstant = lconstant + Double.valueOf(lArr[a + 1]);
            }
        }

        //Simplifies left coefficients:
        int b;
        for (b = 0; b < lArr.length - 1; b++) {

            if (lArr[b].equals("x") && b == 0) {
                lcoefficient++;
            }

            if (lArr[b].equals("x") && b == 1) {
                lcoefficient = lcoefficient + Double.valueOf(lArr[b - 1]);
            }

            if (lArr[b].equals("-")) {
                boolean solved = false;
                if (lArr[b + 1].equals("x")) {
                    lcoefficient--;
                    solved = true;
                }
                if (!solved && b < lArr.length - 2) {
                    if (lArr[b + 2].equals("x")) {
                        lcoefficient = lcoefficient - Double.valueOf(lArr[b + 1]);
                    }
                }
            }

            if (lArr[b].equals("+")) {
                boolean solved = false;
                if (lArr[b + 1].equals("x")) {
                    lcoefficient++;
                    solved = true;
                }
                if (!solved) {
                    if (lArr[b + 2].equals("x")) {
                        lcoefficient = lcoefficient + Double.valueOf(lArr[b + 1]);
                    }
                }
            }
        }

        System.out.println(lconstant + ", " + lcoefficient);

        //Simplifies right constants:
        int c;
        for (c = 0; c <= rArr.length - 2; c++) {

            if (!rArr[c].equals("-") && !rArr[c].equals("+") && !rArr[c].equals("x") && c == 0) {
                rconstant = rconstant + Double.valueOf(rArr[c]);
            }

            if (rArr[c].equals("-") && !rArr[c + 1].equals("x") && !lArr[c + 2].equals("x")) {
                rconstant = rconstant - Double.valueOf(rArr[c + 1]);
            }

            if (rArr[c].equals("+") && !rArr[c + 1].equals("x") && !lArr[c + 2].equals("x")) {
                rconstant = rconstant + Double.valueOf(rArr[c + 1]);
            }
        }

        //Simplifies right coefficients:
        int d;
        for (d = 0; d < rArr.length - 1; d++) {

            if (rArr[d].equals("x") && d == 0) {
                rcoefficient++;
            }

            if (rArr[d].equals("x") && d == 1) {
                rcoefficient = rcoefficient + Double.valueOf(rArr[d - 1]);
            }

            if (rArr[d].equals("-")) {
                boolean solved = false;
                if (rArr[d + 1].equals("x")) {
                    rcoefficient--;
                    solved = true;
                }
                if (!solved && d < rArr.length - 2) {
                    if (rArr[d + 2].equals("x")) {
                        rcoefficient = rcoefficient - Double.valueOf(rArr[d + 1]);
                    }
                }
            }

            if (rArr[d].equals("+")) {
                boolean solved = false;
                if (rArr[d + 1].equals("x")) {
                    rcoefficient++;
                    solved = true;
                }
                if (!solved) {
                    if (rArr[d + 2].equals("x")) {
                        rcoefficient = rcoefficient + Double.valueOf(rArr[d + 1]);
                    }
                }
            }
        }

        System.out.println(rconstant + ", " + rcoefficient);

        //ax + b = ax + b
        lcoefficient = lcoefficient - rcoefficient;
        rconstant = rconstant - lconstant;
        double solution = rconstant / lcoefficient;

        System.out.println("x = " + solution);
    }
}
