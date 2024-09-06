public class Q2PrintArray {
    private static int[] array = {1, 2, 3, 4, 5, 6, 7};

    public static void main(String[] args) {
        printRecursion(array.length);
    }

    private static void printRecursion(int i) {
        // Base case: if index is less than or equal to 0, stop recursion
        if (i <= 0) {
            return;
        }
        
        // Print the element at index (i-1) because array is 0-based and i is 1-based
        System.out.println(array[i - 1]);
        
        // Recursive call with the next index
        printRecursion(i - 1);
    }
}


