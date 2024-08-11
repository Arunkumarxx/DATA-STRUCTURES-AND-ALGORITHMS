package STRING;

public class AnagramSearch {

    public static void main(String[] args) {
        String txt = "forxxorfxdofr";
        String pattern = "for";
        System.out.println(search(txt, pattern));  // Output: 3
    }

    private static int search(String txt, String pattern) {
        int n1 = txt.length();
        int n2 = pattern.length();

        // Edge case: if pattern is longer than the text
        if (n2 > n1) return 0;

        int[] patternHash = new int[26];
        int[] windowHash = new int[26];
        int result = 0;

        // Fill patternHash with frequency of characters in the pattern
        for (int i = 0; i < n2; ++i) {
            patternHash[pattern.charAt(i) - 'a']++;
        }

        // Fill windowHash with frequency of characters in the initial window
        for (int i = 0; i < n2; ++i) {
            windowHash[txt.charAt(i) - 'a']++;
        }

        // Check the initial window
        if (areHashesEqual(windowHash, patternHash)) {
            result++;
        }

        // Slide the window across the text
        for (int i = n2; i < n1; ++i) {
            // Add new character to the window
            windowHash[txt.charAt(i) - 'a']++;
            // Remove old character from the window
            windowHash[txt.charAt(i - n2) - 'a']--;
            // Check if the new window matches the pattern
            if (areHashesEqual(windowHash, patternHash)) {
                result++;
            }
        }

        return result;
    }

    // Helper function to check if two hash arrays are equal
    private static boolean areHashesEqual(int[] windowHash, int[] patternHash) {
        for (int i = 0; i < 26; ++i) {
            if (windowHash[i] != patternHash[i]) {
                return false;
            }
        }
        return true;
    }
}
