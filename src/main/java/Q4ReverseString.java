// src/main/java/Q4ReverseString.java
public class Q4ReverseString {

    public static String reverse(String s) {
        // Base case: If the string is empty or has only one character, return it as it is
        if (s.length() <= 1) {
            return s;
        }

        // Recursive case: Reverse the substring starting from index 1 and add the first character at the end
        return reverse(s.substring(1)) + s.charAt(0);
    }
}
