package STRING;

 class PatternBenchmark {
    public static void main(String[] args) {
        // Generate large text and pattern
        String text = generateLargeText(10000000);  // 10 million characters
        String pattern = generateLargeText(10000000);  // 10 million characters

        // Benchmark Naive approach
        long startNaive = System.currentTimeMillis();
        boolean naiveResult = naivePatternSearch(text, pattern);
        long endNaive = System.currentTimeMillis();
        System.out.println("Naive Result: " + naiveResult + ", Time: " + (endNaive - startNaive) + " ms");

        // Benchmark KMP approach
        long startKMP = System.currentTimeMillis();
        boolean kmpResult = kmpPatternSearch(text, pattern);
        long endKMP = System.currentTimeMillis();
        System.out.println("KMP Result: " + kmpResult + ", Time: " + (endKMP - startKMP) + " ms");

        // Benchmark Rabin-Karp approach
        long startRK = System.currentTimeMillis();
        boolean rkResult = rabinKarpPatternSearch(text, pattern);
        long endRK = System.currentTimeMillis();
        System.out.println("Rabin-Karp Result: " + rkResult + ", Time: " + (endRK - startRK) + " ms");
    }

    // Generates a large text string of the given length
    private static String generateLargeText(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + (i % 26)));  // Filling with letters 'a' to 'z'
        }
        return sb.toString();
    }

    // Generates a large pattern string of the given length
    private static String generateLargePattern(int length) {
        StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            sb.append((char) ('a' + (i % 26)));  // Filling with letters 'a' to 'z'
        }
        return sb.toString();
    }

    // Naive pattern search implementation
    private static boolean naivePatternSearch(String text, String pattern) {
        int textLen = text.length();
        int patLen = pattern.length();
        for (int i = 0; i <= textLen - patLen; i++) {
            int j;
            for (j = 0; j < patLen; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == patLen) {
                return true;
            }
        }
        return false;
    }

    // KMP pattern search implementation (omitted for brevity)
    private static boolean kmpPatternSearch(String text, String pattern) {
        // Implement KMP algorithm
        return false;
    }

    // Rabin-Karp pattern search implementation (omitted for brevity)
    private static boolean rabinKarpPatternSearch(String text, String pattern) {
        // Implement Rabin-Karp algorithm
        return false;
    }
}
