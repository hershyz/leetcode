/*
* https://leetcode.com/problems/robot-return-to-origin/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        String moves = "LL";
        judgeCircle(moves);
    }

    public static void judgeCircle(String moves) {

        String[] arr = moves.split("");
        int x = 0;
        int y = 0;

        int i;
        for (i = 0; i < arr.length; i++) {

            String move = arr[i];
            if (move.equals("U")) {
                y++;
            }
            if (move.equals("D")) {
                y--;
            }
            if (move.equals("R")) {
                x++;
            }
            if (move.equals("L")) {
                x--;
            }
        }

        if (x == 0 && y == 0) {
            System.out.println(true);
            return;
        }
        else {
            System.out.println(false);
            System.out.print(x + ", " + y);
        }
    }
}
