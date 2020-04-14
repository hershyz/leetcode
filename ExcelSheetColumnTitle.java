/*
* https://leetcode.com/problems/excel-sheet-column-title/
* Difficulty: EASY
* */

public class Main {

    static String[] letters = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};

    public static void main(String[] args) {

        run(1);
        run(2);
        run(3);
        run(26);
        run(28);
        run(701);
    }

    public static void run(int number) {

        if (number <= 26 ) {
            System.out.println(letters[number - 1].toUpperCase());
            return;
        }

        int times = 0;
        int remainder = number;

        while (remainder > 26) {
            remainder = remainder - 26;
            times++;
        }

        String result = "";
        result = result + letters[times - 1].toUpperCase();
        result = result + letters[remainder - 1].toUpperCase();

        System.out.println(result);
    }
}
