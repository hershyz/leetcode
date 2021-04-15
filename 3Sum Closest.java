class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        int diff = Integer.MAX_VALUE;
        int minSum = 0;
        
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                for (int k = 0; k < nums.length; k++) {
                    if (j != i) {
                        if (k != j) {
                            if (k != i) {
                                int n1 = nums[i];
                                int n2 = nums[j];
                                int n3 = nums[k];
                                int sum = n1 + n2 + n3;
                                int currDiff = Math.abs(target - sum);
                                if (currDiff < diff) {
                                    diff = currDiff;
                                    minSum = sum;
                                }
                            }
                        }
                    }
                }
            }
        }
        
        return minSum;
    }
}
