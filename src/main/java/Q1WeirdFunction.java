public class Q1WeirdFunction {

    // Recursive function implementation
    public static int fRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fRecursive(n - 1) + (n - 1) * fRecursive(n - 2);
        }
    }

    // Iterative function implementation
    public static int fIterative(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        int f0 = 0;
        int f1 = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = f1 + (i - 1) * f0;
            f0 = f1;
            f1 = result;
        }

        return result;
    }
}
