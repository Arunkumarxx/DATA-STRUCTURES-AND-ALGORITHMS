package STRING;

 class PatternMatchingBenchmark {
    public static void main(String[] args) {
        String text = generateLargeText(1000000);  // Generate a large text string
        String pattern = "/23/";  // A small pattern

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

    // Function to generate a large random text string
    private static String generateLargeText(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append((char) ('a' + Math.random() * 26));
        }
        return sb.toString();
    }

    // Naive Pattern Searching Algorithm
    private static boolean naivePatternSearch(String text, String pattern) {
        int n1 = text.length();
        int n2 = pattern.length();

        for (int i = 0; i <= n1 - n2; i++) {
            int j;
            for (j = 0; j < n2; j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    break;
                }
            }
            if (j == n2) {
                return true;
            }
        }
        return false;
    }

    // KMP Pattern Searching Algorithm
    private static boolean kmpPatternSearch(String text, String pattern) {
        int n1 = text.length();
        int n2 = pattern.length();

        if (n2 > n1) return false;

        int[] lps = computeLPSArray(pattern);
        int i = 0, j = 0;
        while (i < n1) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }
            if (j == n2) {
                return true;
            } else if (i < n1 && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return false;
    }

    // Compute LPS Array for KMP
    private static int[] computeLPSArray(String pattern) {
        int n = pattern.length();
        int[] lps = new int[n];
        int length = 0;
        int i = 1;
        lps[0] = 0;

        while (i < n) {
            if (pattern.charAt(i) == pattern.charAt(length)) {
                length++;
                lps[i] = length;
                i++;
            } else {
                if (length != 0) {
                    length = lps[length - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

    // Rabin-Karp Pattern Searching Algorithm
    private static boolean rabinKarpPatternSearch(String text, String pattern) {
        int n1 = text.length();
        int n2 = pattern.length();
        int prime = 101;  // A prime number

        if (n2 > n1) return false;

        int patterHash = hash(pattern, n2, prime);
        int textHash = hash(text, n2, prime);

        for (int i = 0; i <= n1 - n2; i++) {
            if (patterHash == textHash && text.substring(i, i + n2).equals(pattern)) {
                return true;
            }
            if (i < n1 - n2) {
                textHash = rehash(text, i, textHash, n2, prime);
            }
        }
        return false;
    }

    // Hash function for Rabin-Karp
    private static int hash(String str, int length, int prime) {
        int hash = 0;
        for (int i = 0; i < length; i++) {
            hash += str.charAt(i) * Math.pow(prime, i);
        }
        return hash;
    }

    // Rehash function for Rabin-Karp
    private static int rehash(String text, int oldIndex, int oldHash, int patternLength, int prime) {
        int newHash = oldHash - text.charAt(oldIndex);
        newHash /= prime;
        newHash += text.charAt(oldIndex + patternLength) * Math.pow(prime, patternLength - 1);
        return newHash;
    }
}
