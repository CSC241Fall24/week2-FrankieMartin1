public class Q1WeirdFunction {

    // Recursive implementation of factorial
    public static int fRecursive(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fRecursive(n - 1);
    }

    // Iterative implementation of factorial
    public static int fIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Test the implementations
        int num = 5;
        System.out.println("Factorial of " + num + " (recursive): " + fRecursive(num));
        System.out.println("Factorial of " + num + " (iterative): " + fIterative(num));
    }
}
