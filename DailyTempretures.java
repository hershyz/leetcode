/*
* https://leetcode.com/problems/daily-temperatures/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {
        int[] temps = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        int[] days = dailyTempretures(temps);

        int i;
        for (i = 0; i < days.length; i++) {
            System.out.println(days[i]);
        }
    }

    public static int[] dailyTempretures(int[] temps) {

        int[] days = new int[temps.length];

        int i;
        for (i = 0; i < temps.length; i++) {

            if (i == temps.length - 1) {
                days[i] = 0;
                break;
            }

            int current = temps[i];
            int j;
            for (j = i + 1; j < temps.length; j++) {
                if (temps[j] > current) {
                    days[i] = j - i;
                    break;
                }
            }
        }

        return days;
    }
}
