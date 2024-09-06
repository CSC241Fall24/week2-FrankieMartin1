public class Q2PrintArray {
    public static void main(String[] args) {
        int n = 5;  // Example: we want to print values from 0 to 4
        System.out.println("Recursive version:");
        printRecursion(n);  // Prints results using the recursive version

        System.out.println("Iterative version:");
        printIterative(n);  // Prints results using the iterative version
    }

    // This method will print the values using the recursive function from Q1WeirdFunction
    private static void printRecursion(int n) {
        if (n <= 0) {
            return;
        }

        // First print all previous values
        printRecursion(n - 1);

        // Print the weird function result for the current value of n-1
        System.out.println(Q1WeirdFunction.fRecursive(n - 1));
    }

    // This method will print the values using the iterative function from Q1WeirdFunction
    private static void printIterative(int n) {
        for (int i = 0; i < n; i++) {
            // Print the weird function result for the current value of i
            System.out.println(Q1WeirdFunction.fIterative(i));
        }
    }
}

