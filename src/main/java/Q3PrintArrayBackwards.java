public class Q3PrintArrayBackwards {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length - 1); // Start with the last index of the array
    }

    private static void printRecursion(int i) {
        // Base case: when index is less than 0, return from the recursion
        if (i < 0) {
            return;
        }
        // Recursive call: print the element at index i after the recursive call
        printRecursion(i - 1);
        System.out.println(array[i]);
    }
}
