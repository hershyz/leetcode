/*
* https://leetcode.com/problems/heaters/
* Difficulty: EASY
* */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] houses = new int[]{1, 2, 3, 4};
        int[] heaters = new int[]{1};
        findRadius(houses, heaters);
    }

    public static void findRadius(int[] houses, int[] heaters) {

        Arrays.sort(houses);
        Arrays.sort(houses);

        double maxDistance = 0;
        int leftMostHeaterPos = heaters[0];
        int rightMostHeaterPos = heaters[heaters.length - 1];
        int leftMostHousePos = houses[0];
        int rightMostHousePos = houses[houses.length - 1];

        double currentTestDistance;
        currentTestDistance = leftMostHeaterPos - leftMostHousePos;

        if (currentTestDistance > maxDistance) {
            maxDistance = currentTestDistance;
        }

        currentTestDistance = rightMostHousePos - rightMostHeaterPos;

        if (currentTestDistance > maxDistance) {
            maxDistance = currentTestDistance;
        }

        if (heaters.length > 1) {
            for (int i = 1; i < heaters.length; i++) {
                currentTestDistance = Math.ceil((heaters[i] - heaters[i - 1]) / 2);
                if (currentTestDistance > maxDistance) {
                    maxDistance = currentTestDistance;
                }
            }
        }

        System.out.println(maxDistance);
    }
}
