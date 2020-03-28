/*
* https://leetcode.com/problems/median-of-two-sorted-arrays/
* There are two sorted arrays nums1 and nums2 of size m and n respectively.
* Find the median of the two sorted arrays.
* You may assume nums1 and nums2 cannot be both empty.
* Difficulty: HARD
* */

public class Main {

    //Checks if an integer is even:
    private static boolean isEven(int x) {

        double half = x / 2;
        int intHalf = (int)half;
        int intWhole = intHalf * 2;

        if (intWhole != x) {
            return false;
        }

        else {
            return true;
        }
    }

    //Sorts an unordered array of data from least to greatest:
    private static int[] sort(int[] x) {

        int[] sorted = x;

        int i;
        int j;
        for (i = 0; i < sorted.length; i++) {
            for (j = 0; j < sorted.length - 1; j++) {
                if (sorted[j] > sorted[j + 1]) {
                    int temp;
                    temp = sorted[j];
                    sorted[j] = sorted[j + 1];
                    sorted[j + 1] = temp;
                }
            }
        }

        return sorted;
    }

    //Finds the median of a sorted array:
    private static double findMedian(int[] x) {

        int length = x.length;
        double halfLength = length / 2;

        //If the length is even:
        if (isEven(length)) {
            int _halfLength = (int)halfLength;
            int num1 = x[_halfLength - 1];
            int num2 = x[_halfLength];
            double sum = num1 + num2;
            return sum / 2;
        }

        //If the length is odd:
        else {
            double result = (double)x[(int)Math.floor(halfLength)];
            return result;
        }
    }

    public static void main(String[] args) {

        //Makes two arrays of random lengths between zero and 100:
        double rand1 = Math.random() * 100;
        int size1 = (int)rand1;
        double rand2 = Math.random() * 100;
        int size2 = (int)rand2;

        int[] nums1 = new int[size1];
        int[] nums2 = new int[size2];

        //Fills the arrays up with numbers zero and 10:
        int i;
        for (i = 0; i < nums1.length; i++) {
            double tempRand = Math.random() * 10;
            int tempNumber = (int)tempRand;
            nums1[i] = tempNumber;
        }

        int j;
        for (j = 0; j < nums2.length; j++) {
            double tempRand = Math.random() * 10;
            int tempNumber = (int)tempRand;
            nums2[j] = tempNumber;
        }

        //Sorts the arrays:
        nums1 = sort(nums1);
        nums2 = sort(nums2);

        //Finds the medians of both the arrays and averages to obtain one median:
        double med1 = findMedian(nums1);
        double med2 = findMedian(nums2);
        double sum = med1 + med2;
        double result = sum / 2;
        System.out.println("Median of both arrays: " + result);
    }
}
