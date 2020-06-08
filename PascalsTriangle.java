/*
* https://leetcode.com/problems/pascals-triangle/
* Difficulty: EASY
* */

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        generate(5);
    }

    public static void generate(int n) {

        if (n == 1) {
            System.out.println("1");
            return;
        }

        if (n == 2) {
            System.out.println("1 1");
            return;
        }

        List<List<Integer>> rows = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        firstRow.add(1);
        rows.add(firstRow);

        for (int i = 0; i < (n - 2); i++) {
            List<Integer> newRow = new ArrayList<>();
            List<Integer> lastRow = rows.get(i);
            int newLength = lastRow.size() + 1;
            for (int j = 0; j < newLength; j++) {
                if (j == 0 || j == (newLength - 1)) {
                    newRow.add(1);
                }
                else {
                    int num = lastRow.get(j - 1) + lastRow.get(j);
                    newRow.add(num);
                }
            }
            rows.add(newRow);
        }

        int maxRowIndex = rows.size() - 1;
        List<Integer> lastRow = rows.get(maxRowIndex);
        for (int k = 0; k < lastRow.size(); k++) {
            System.out.print(lastRow.get(k) + ", ");
        }
    }
}
