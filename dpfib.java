public class Main {

    public static void main(String[] args) {
        System.out.println(fib(9));
    }

    public static int fib(int n) {
        int[] dp = new int[n];

        if (n == 0 || n == 1) {
            return 1;
        }

        dp[0] = 1;
        dp[1] = 1;

        int i;
        for (i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }
}
