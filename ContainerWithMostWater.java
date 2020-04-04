/*
* https://leetcode.com/problems/container-with-most-water/
* Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.
* Difficulty: MEDIUM
* */


public class Main {

    public static void main(String[] args) {
        int[] case1 = new int[]{1,8,6,2,5,4,8,3,7};
        maxArea(case1);
    }

    public static void maxArea(int[] heights) {

        int maxAreaFound = 0;

        int i;
        for (i = 0; i < heights.length; i++) {

            int area = 0;
            int j = 0;
            while (j < heights.length) {

                int iHeight = heights[i];
                int jHeight = heights[j];

                int distance = i - j;

                if (distance < 0) {
                    distance = distance * -1;
                }

                if (jHeight < iHeight) {
                    area = jHeight * distance;
                }

                if (iHeight < jHeight) {
                    area = iHeight * distance;
                }

                if (area > maxAreaFound) {
                    maxAreaFound = area;
                }

                j++;
            }
        }

        System.out.println(maxAreaFound);
    }
}
