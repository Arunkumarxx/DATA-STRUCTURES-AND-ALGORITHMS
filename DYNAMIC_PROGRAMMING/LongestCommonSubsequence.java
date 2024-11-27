package DYNAMIC_PROGRAMMING;

public class LongestCommonSubsequence {

    private int getLCS(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int max = 0;

        // Iterate over all starting indices in s2
        for (int i = 0; i < n2; ++i) {
            // Iterate over all starting indices in s1
            for (int j = 0; j < n1; ++j) {
                int x = i;
                int y = j;
                int count = 0;

                // Check for common subsequence from these starting indices
                while (x < n2 && y < n1) {
                    if (s2.charAt(x) == s1.charAt(y)) {
                        count++; // Characters match, increment count
                        x++;
                    }
                    y++; // Move to the next character in s1 regardless
                }

                // Update max length of LCS found so far
                max = Math.max(max, count);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        LongestCommonSubsequence obj = new LongestCommonSubsequence();
        System.out.println("LCS Length: " + obj.getLCS("ABCDGH", "AEDFHR")); // Expected: 3
        System.out.println("LCS Length: " + obj.getLCS("ABC", "AC"));        // Expected: 2
        System.out.println("LCS Length: " + obj.getLCS("XYZW", "XYWZ"));    // Expected: 3
    }
}
