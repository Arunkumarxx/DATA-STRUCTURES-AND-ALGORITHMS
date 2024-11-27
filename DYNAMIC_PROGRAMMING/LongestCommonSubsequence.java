 class LongestCommonSubstring {
    public static int longestCommonSubstring(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        int max = 0;

        // Iterate over all substrings of s1
        for (int i = 0; i < n1; ++i) {
            for (int j = 0; j < n2; ++j) {
                // Check if characters match at the starting indices of s1 and s2
                int count = 0;
                int x = i, y = j;

                // Compare characters while both indices are within bounds
                while (x < n1 && y < n2 && s1.charAt(x) == s2.charAt(y)) {
                    count++;
                    x++;
                    y++;
                }

                // Update the max length of the common substring
                max = Math.max(max, count);
            }
        }

        return max;
    }

    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "zabcf";
        System.out.println("Longest common substring length: " + longestCommonSubstring(s1, s2));
    }
}
