class Solution {
    public static boolean checkPossibility(int[] nums) {

        if (nums.length == 1 || increasing(nums)) {
            return true;
        }

        for (int i = 0; i < nums.length - 1; i++) {
            int temp = nums[i];
            nums[i] = nums[i + 1];
            System.out.println(Arrays.toString(nums));
            if (increasing(nums)) {
                return true;
            }
            if (!increasing(nums)) {
                nums[i] = temp;
            }
        }

        nums[nums.length - 1] = nums[nums.length - 2];
        return increasing(nums);
    }

    public static boolean increasing(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
