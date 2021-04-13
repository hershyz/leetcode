import java.util.Arrays;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 2, 1, 2, 1};
        subarraySum(arr, 3);
    }

    public static int subarraySum(int[] nums, int k) {

        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int total = 0;
                for (int index = i; index <= j; index++) {
                    total += nums[index];
                }
                if (total == k) {
                    n++;
                }
            }
        }

        return n;
    }
}
