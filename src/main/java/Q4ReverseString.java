// src/main/java/Q4ReverseString.java
// Q4ReverseString.java
public class Q4ReverseString {

    /**
     * Reverses the given string.
     *
     * @param input The string to reverse.
     * @return The reversed string.
     */
    public static String reverse(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        
        // Convert string to a char array
        char[] characters = input.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        
        // Swap characters from start and end of the array
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        
        // Create a new string from the reversed character array
        return new String(characters);
    }
}
