/*
* https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
* Difficulty: MEDIUM
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> _case = new ArrayList<>();
        _case.add(1);
        _case.add(2);
        _case.add(3);
        _case.add(3);
        _case.add(4);
        _case.add(5);
        _case.add(5);

        removeDuplicates(_case);
    }

    public static void removeDuplicates(List<Integer> x) {

        int lastValue = Integer.MIN_VALUE;
        int i;
        for (i = 0; i < x.size(); i++) {
            if (lastValue == x.get(i)) {
                x.remove(i);
            }
            else {
                lastValue = x.get(i);
            }
        }

        int j;
        for (j = 0; j < x.size(); j++) {
            System.out.println(x.get(j));
        }
    }
}
