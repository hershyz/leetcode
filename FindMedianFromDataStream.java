/*
* https://leetcode.com/problems/find-median-from-data-stream/
* Difficulty: MEDIUM
* */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Integer> nums = new ArrayList<>();

    public static void main(String[] args) {
        addNum(1);
        addNum(2);
        addNum(3);
        addNum(3);
        addNum(4);
        findMedian();
    }

    public static void addNum(int num) {
        nums.add(num);
    }

    public static void findMedian() {

        Collections.sort(nums);

        if (isEven(nums.size())) {
            int half = nums.size() / 2;
            int index1 = nums.get(half - 1);
            int index2 = nums.get(half);
            double total = index1 + index2;
            System.out.println(total / 2);
        }

        if (!isEven(nums.size())) {
            int minus = nums.size() - 1;
            minus = minus / 2;
            System.out.println(nums.get(minus));
        }
    }

    public static boolean isEven(double num) {

        double result = num / 2;
        if (Math.round(result) == result) {
            return true;
        }

        return false;
    }
}
