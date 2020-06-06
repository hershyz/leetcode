/*
* https://leetcode.com/problems/destination-city/
* Difficulty: EASY
* */

public class Main {

    public static void main(String[] args) {

        String[][] paths = new String[][] {
                {"A", "Z"},
        };

        destCity(paths);
    }

    public static void destCity(String[][] paths) {

        for (int i = 0; i < paths.length; i++) {

            String testCity = paths[i][1];

            boolean test = true;

            for (int j = 0; j < paths.length; j++) {
                if (paths[j][0].equals(testCity)) {
                    test = false;
                }
            }

            if (test) {
                System.out.println(testCity);
            }
        }
    }
}
