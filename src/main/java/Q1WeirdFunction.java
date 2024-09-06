public class Q1WeirdFunction {

    // Recursive implementation
    public static int fRecursive(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        return fRecursive(n - 1) + fRecursive(n - 2) + fRecursive(n - 3);
    }

    // Iterative implementation
    public static int fIterative(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }

    public static void main(String[] args) {
        // Test the implementations
        int[] testValues = {0, 1, 2, 3, 4};
        for (int num : testValues) {
            System.out.println("fRecursive(" + num + ") = " + fRecursive(num));
            System.out.println("fIterative(" + num + ") = " + fIterative(num));
        }
    }
}

