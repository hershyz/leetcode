class Solution {
    public String optimalDivision(int[] nums) {
        
        int n = nums.length;
        if (n == 1) {
            return "" + nums[0];
        }
        if (n == 2) {
            return nums[0] + "/" + nums[1];
        }
        
        else {
            String result = nums[0] + "/(";
            for (int i = 1; i < nums.length; i++) {
                result += nums[i];
                if (i < (n - 1)) {
                    result += "/";
                }
            }
            result += ")";
            return result;
        }
    }
}
