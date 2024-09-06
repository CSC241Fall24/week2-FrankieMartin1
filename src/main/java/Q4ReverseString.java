public class Q4ReverseString {

    public static String reverse(String s) {
        // Base case: if the string is empty or has only one character
        if (s == null || s.length() <= 1) {
            return s;
        }

        // Recursive case: reverse the substring starting from index 1 and append the first character to the end
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
