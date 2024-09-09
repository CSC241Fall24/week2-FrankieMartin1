public class Q1WeirdFunction {

    // Recursive implementation
    public static int fRecursive(int n) {
        if(n<3) {
            return n;
        }
        return fRecursive(n - 1) + 2 * fRecursive(n - 2) + 3 *  fRecursive(n - 3);
    }

    // Iterative implementation
    public static int fIterative(int n) {
        if(n<3){
            return n;
        }

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + 2* dp[i - 2] +3* dp[i - 3];
        }

        return dp[n];
    }
}
