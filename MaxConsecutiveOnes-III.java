/*
* https://leetcode.com/problems/max-consecutive-ones-iii/
* Difficulty: MEDIUM
* */

public class Main {

    public static void main(String[] args) {

        int[] a = new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        longestOnes(a, k);
    }

    public static void longestOnes(int[] a, int k) {

        int max = streak(a);
        int[] zeroIndexes = getZeroIndexes(a);

        int i;
        for (i = 0; i < zeroIndexes.length; i++) {

            int[] temp = copyArray(a);

            int left = i;
            int right = i + k - 1;

            if (right < zeroIndexes.length) {

                int j;
                for (j = left; j <= right; j++) {
                    temp[zeroIndexes[j]] = 1;
                }

                if (streak(temp) > max) {
                    max = streak(temp);
                }
            }
        }

        System.out.println(max);
    }

    public static int streak(int[] a) {

        int longest = 0;
        int currentStreak = 0;

        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                currentStreak++;
            }
            if (a[i] == 0) {
                if (currentStreak > longest) {
                    longest = currentStreak;
                    currentStreak = 0;
                }
                currentStreak = 0;
            }
        }

        return longest;
    }

    public static int zeroCount(int[] a) {

        int total = 0;

        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                total++;
            }
        }

        return total;
    }

    public static int[] getZeroIndexes(int[] a) {

        int[] indexes = new int[zeroCount(a)];

        int i;
        int found = 0;
        for (i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                indexes[found] = i;
                found++;
            }
        }

        return indexes;
    }

    public static int[] copyArray(int[] a) {

        int[] b = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }

        return b;
    }
}
