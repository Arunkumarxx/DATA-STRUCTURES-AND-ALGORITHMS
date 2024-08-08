package STRING;

import java.util.ArrayList;

public class ReverseWordsInString {
    public static void main(String[] args) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        // Iterate through the string character by character
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '.') {
                word.append(S.charAt(i)); // Build the current word
            } else {
                // Insert the word at the beginning of the result
                if (result.length() != 0) {
                    result.insert(0, '.'); // Add a dot before the word if result is not empty
                }
                result.insert(0, word); // Add the word itself
                word.setLength(0); // Clear the word builder for the next word
            }
        }

        // Append the last word if there is any
        if (word.length() > 0) {
            if (result.length() != 0) {
                result.insert(0, '.');
            }
            result.insert(0, word);
        }
        System.out.println(result);
    }
}
