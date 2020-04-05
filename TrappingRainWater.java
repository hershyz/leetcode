/*
* https://leetcode.com/problems/trapping-rain-water/
* Difficulty: HARD
* */

public class Main {

    public static int[] heights = new int[]{0,2,0,2,1,0,1,3,2,1,3,1};

    public static void main(String[] args) {
        run();
    }

    public static void run() {

        int totalArea = 0;
        int i = 0;

        while (i < heights.length) {
            int index1 = firstBoundIndex(i);
            int index2 = secondBoundIndex(index1);
            i = index2;

            if (index1 == -1 || index2 == -1) {
                break;
            }

            totalArea = totalArea + findAreaBetweenBounds(index1, index2);
        }

        System.out.println(totalArea);
    }

    //Returns the index of the first boundary, given starting index:
    public static int firstBoundIndex(int startingIndex) {

        int i;
        for (i = startingIndex; i < heights.length; i++) {

            //If the function reaches the end without finding a first bound, function returns -1:
            if (i == heights.length - 1) {
                return -1;
            }

            if (heights[i + 1] < heights[i]) {
                return i;
            }
        }

        //If no first bound is found, function returns -1:
        return -1;
    }

    public static int secondBoundIndex(int firstBoundIndex) {

        //If the first bound index is at the end, return -1:
        if (firstBoundIndex == heights.length - 1 || firstBoundIndex == heights.length - 2) {
            return -1;
        }

        //If no first bound was found, return -1:
        if (firstBoundIndex == -1) {
            return -1;
        }

        int i;
        for (i = firstBoundIndex + 1; i < heights.length; i++) {

            if (heights[i] >= heights[firstBoundIndex]) {
                return i;
            }
        }

        //If no value is greater than the first bound, finds the next largest height:
        int j;
        int lastLargestHeight = 0;
        int largestHeightIndex = 0;
        for (j = heights.length - 1; j > firstBoundIndex + 1; j--) {
            if (heights[j] > lastLargestHeight) {
                lastLargestHeight = heights[j];
                largestHeightIndex = j;
            }
        }

        return largestHeightIndex;
    }

    //Finds the area between the first and second index:
    public static int findAreaBetweenBounds(int firstBoundIndex, int secondBoundIndex) {

        int areaBetweenBounds = 0;
        int minIndexHeight = 0;
        int firstBoundHeight = heights[firstBoundIndex];
        int secondBoundHeight = heights[secondBoundIndex];

        if (firstBoundHeight <= secondBoundHeight) {
            minIndexHeight = firstBoundHeight;
        }
        if (secondBoundHeight < firstBoundHeight) {
            minIndexHeight = secondBoundHeight;
        }

        int i;
        for (i = firstBoundIndex; i < secondBoundIndex; i++) {

            int currentIndexHeight = heights[i];
            int areaAbove = minIndexHeight - currentIndexHeight;

            if (areaAbove >= 0) {
                areaBetweenBounds = areaBetweenBounds + areaAbove;
            }
        }

        return areaBetweenBounds;
    }
}
