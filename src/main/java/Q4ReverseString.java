public class Q4ReverseString {

    public static String reverse(String s) {
        // Base case: if the string is empty or has only one character
        if (s == null || s.length() <= 1) {
            return s;
        }

        // Recursive case: reverse the substring and append the first character at the end
        return reverse(s.substring(1)) + s.charAt(0);
    }

    public static void main(String[] args) {
        // Test the reverse method
        String original = "hello";
        String reversed = reverse(original);
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
    }
}
