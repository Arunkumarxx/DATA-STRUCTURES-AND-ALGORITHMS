package STRING;

public class AnagramSearch {
    public static void main(String[] args) {
        String str = "zbcoejuvpvaboyg";
        String patt = "po";
        System.out.println(SlidingWindowWithHashing(str,patt));
    }
    private static int SlidingWindowWithHashing(String str,String pattern) {
        if (pattern.length() > str.length())
            return 0;
        int k = pattern.length();
        int hash1 = 0;
        int hash2 = 0;
        int n = str.length();

        // Initialize hash values for the first window and the pattern
        for (int i = 0; i < k; ++i) {
            hash1 += str.charAt(i) - 'a';
            hash2 += pattern.charAt(i) - 'a';
        }

        int count = 0;
        // Check if the initial window matches the pattern
        if (hash1 == hash2)
            ++count;

        // Sliding window over the rest of the string
        for (int i = 1; i <= n - k; ++i) {
            // Remove the character that is sliding out of the window
            hash1 -= str.charAt(i - 1) - 'a';
            // Add the character that is sliding into the window
            hash1 += str.charAt(i + k - 1) - 'a';

            // Compare hash values
            if (hash1 == hash2) {
                ++count;
            }
        }

        return count;
    }
}
