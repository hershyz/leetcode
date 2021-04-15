//Accepted iterative solution:
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

//Tried to refactor the solution to make it faster using data containers within an ArrayList to reduce time complexity, but this made it slower:
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        
        ArrayList<int[]> sums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    int sum = nums[i] + nums[j];
                    int[] index = {sum, i, j};
                    sums.add(index);
                }
            }
        }

        int minDiff = Integer.MAX_VALUE;
        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int[] container : sums) {
                int s = container[0];
                int index1 = container[1];
                int index2 = container[2];
                if (i != index1 && i != index2) {
                    int total = nums[i] + s;
                    int diff = Math.abs(target - total);
                    if (diff < minDiff) {
                        minDiff = diff;
                        result = total;
                    }
                }
            }
        }

        return result;
    }
}
