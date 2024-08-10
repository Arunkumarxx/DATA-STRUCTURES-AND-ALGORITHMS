package STRING;

import java.util.Random;

class SearchComparison {
    public static void main(String[] args) {
        String text = generateRandomText(1000000); // Generate a large text
        String pattern = "fjdsakl";

        // Measure time for String.contains()
        long startTime = System.nanoTime();
        boolean containsResult = text.contains(pattern);
        long endTime = System.nanoTime();
        double containsTimeMs = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds
        System.out.println("String.contains() found pattern: " + containsResult);
        System.out.printf("String.contains() time: %.6f milliseconds%n", containsTimeMs);

        // Measure time for Naive search
        startTime = System.nanoTime();
        int naiveCount = naivePatternSearch(text, pattern);
        endTime = System.nanoTime();
        double naiveTimeMs = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds
        System.out.println("Naive search found pattern " + naiveCount + " times");
        System.out.printf("Naive search time: %.6f milliseconds%n", naiveTimeMs);

        // Measure time for Rabin-Karp search
        startTime = System.nanoTime();
        int rabinKarpCount = rabinKarpPatternSearch(text, pattern);
        endTime = System.nanoTime();
        double rabinKarpTimeMs = (endTime - startTime) / 1_000_000.0; // Convert to milliseconds
        System.out.println("Rabin-Karp search found pattern " + rabinKarpCount + " times");
        System.out.printf("Rabin-Karp search time: %.6f milliseconds%n", rabinKarpTimeMs);
    }

    private static String generateRandomText(int length) {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder text = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            text.append(chars.charAt(random.nextInt(chars.length())));
        }
        return text.toString();
    }

    private static int naivePatternSearch(String text, String pattern) {
        int count = 0;
        int n = text.length();
        int m = pattern.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;
            while (j < m && text.charAt(i + j) == pattern.charAt(j)) {
                j++;
            }
            if (j == m) {
                count++;
            }
        }
        return count;
    }

    private static int rabinKarpPatternSearch(String text, String pattern) {
        int count = 0;
        int m = pattern.length();
        int n = text.length();
        int prime = 101; // A prime number for hashing
        int patternHash = 0;
        int textHash = 0;
        int h = 1; // The hash factor for the rolling hash

        // Calculate h = pow(d, m-1) % q
        for (int i = 0; i < m - 1; i++) {
            h = (h * 256) % prime;
        }

        // Calculate hash value of pattern and first window of text
        for (int i = 0; i < m; i++) {
            patternHash = (256 * patternHash + pattern.charAt(i)) % prime;
            textHash = (256 * textHash + text.charAt(i)) % prime;
        }

        // Slide the pattern over text
        for (int i = 0; i <= n - m; i++) {
            if (patternHash == textHash) {
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (text.charAt(i + j) != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) count++;
            }
            if (i < n - m) {
                textHash = (256 * (textHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                if (textHash < 0) textHash += prime;
            }
        }
        return count;
    }
}
