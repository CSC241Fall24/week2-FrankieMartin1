public class Q1WeirdFunction {

    public static int fRecursive(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fRecursive(n - 1) + fRecursive(n - 2) + 1;
        }
    }

    public static int fIterative(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int a = 0; // f(0)
        int b = 1; // f(1)
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b + 1;
            a = b;
            b = result;
        }

        return result;
    }
   
    }

