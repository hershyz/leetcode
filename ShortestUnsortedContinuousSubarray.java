class Solution {
    public static int findUnsortedSubarray(int[] nums) {

        if (isSorted(nums)) {
            return 0;
        }

        int min = nums.length;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {

                int[] test = new int[nums.length];
                int index = 0;

                for (int n : nums) {
                    test[index] = n;
                    index++;
                }

                Arrays.sort(test, i, j + 1);

                if (isSorted(test)) {
                    int length = (j - i) + 1;
                    if (length < min) {
                        min = length;
                    }
                }
            }
        }

        return min;
    }

    public static boolean isSorted(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }
}
