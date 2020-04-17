/*
 * https://leetcode.com/problems/solve-the-equation/
 * Difficulty: MEDIUM
 * */

public class Main {

    public static void main(String[] args) {
        run("x+5-3+x=6+x-2");
        run("x=x");
        run("2x=x");
        run("2x+3x-6x=x+2");
        run("x=x+2");
    }

    public static void run(String input) {

        String[] infiniteTest = input.split("=");
        if (infiniteTest[0].equals(infiniteTest[1])) {
            System.out.println("infinite solutions");
            return;
        }

        String[] isplit = input.split("");
        String fixedInput = "";

        int a;
        for (a = 0; a < isplit.length; a++) {

            fixedInput = fixedInput + isplit[a];

            if (isplit[a].equals("-") || isplit[a].equals("+") || isplit[a].equals("x") || isplit[a].equals("=")) {
                fixedInput = fixedInput + " ";
            }

            if (isInt(isplit[a])) {
                if (a < isplit.length - 1) {
                    if (!isplit[a + 1].equals("x")) {
                        fixedInput = fixedInput + " ";
                    }
                }
            }
        }

        String left = fixedInput.split(" = ")[0];
        String right = fixedInput.split(" = ")[1];

        String[] l = left.split(" ");
        String[] r = right.split(" ");
        int lcoefficient = 0;
        int lconstant = 0;
        int rcoefficient = 0;
        int rconstant = 0;

        //Simplifies left:
        int b;
        for (b = 0; b < l.length; b++) {

            String current = l[b];

            if (b == 0) {

                if (isInt(current)) {
                    lconstant = lconstant + Integer.valueOf(current);
                }

                if (!isInt(current)) {

                    if (current.length() == 1) {
                        lcoefficient++;
                    }
                    else {
                        int coefficient = Integer.valueOf(current.split("")[0]);
                        lcoefficient = lcoefficient + coefficient;
                    }
                }
            }

            if (current.equals("+")) {

                if (isInt(l[b + 1])) {
                    lconstant = lconstant + Integer.valueOf(l[b + 1]);
                }

                if (!isInt(l[b + 1])) {

                    if (l[b + 1].length() == 1) {
                        lcoefficient++;
                    }
                    else {
                        int coefficient = Integer.valueOf(l[b + 1].split("")[0]);
                        lcoefficient = lcoefficient + coefficient;
                    }
                }
            }

            if (current.equals("-")) {

                if (isInt(l[b + 1])) {
                    lconstant = lconstant - Integer.valueOf(l[b + 1]);
                }

                if (!isInt(l[b + 1])) {

                    if (l[b + 1].length() == 1) {
                        lcoefficient--;
                    }
                    else {
                        int coefficient = Integer.valueOf(l[b + 1].split("")[0]);
                        lcoefficient = lcoefficient - coefficient;
                    }
                }
            }
        }

        //Simplifies right:
        int c;
        for (c = 0; c < r.length; c++) {

            String current = r[c];

            if (c == 0) {

                if (isInt(current)) {
                    rconstant = rconstant + Integer.valueOf(current);
                }

                if (!isInt(current)) {

                    if (current.length() == 1) {
                        rcoefficient++;
                    }
                    else {
                        int coefficient = Integer.valueOf(current.split("")[0]);
                        rcoefficient = rcoefficient + coefficient;
                    }
                }
            }

            if (current.equals("+")) {

                if (isInt(r[c + 1])) {
                    rconstant = rconstant + Integer.valueOf(r[c + 1]);
                }

                if (!isInt(r[c + 1])) {

                    if (r[c + 1].length() == 1) {
                        rcoefficient++;
                    }
                    else {
                        int coefficient = Integer.valueOf(r[c + 1].split("")[0]);
                        rcoefficient = rcoefficient + coefficient;
                    }
                }
            }

            if (current.equals("-")) {

                if (isInt(r[c + 1])) {
                    rconstant = rconstant - Integer.valueOf(r[c + 1]);
                }

                if (!isInt(r[c + 1])) {

                    if (r[c + 1].length() == 1) {
                        rcoefficient--;
                    }
                    else {
                        int coefficient = Integer.valueOf(r[c + 1].split("")[0]);
                        rcoefficient = rcoefficient - coefficient;
                    }
                }
            }
        }

        //ax + b = ax + b
        lcoefficient = lcoefficient - rcoefficient;
        rconstant = rconstant - lconstant;

        try {
            double solution = rconstant / lcoefficient;
            System.out.println("x = " + solution);
            return;
        }
        catch (Exception e) {
            System.out.println("no solution");
            return;
        }
    }

    public static boolean isInt(String x) {
        try {
            Integer.valueOf(x);
            return true;
        }
        catch (Exception e) {
            return false;
        }
    }
}
