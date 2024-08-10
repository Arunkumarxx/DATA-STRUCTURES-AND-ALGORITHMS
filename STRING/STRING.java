package STRING;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import java.io.*;
import java.util.*;

 class PatternSearching {

    public static void main(String[] args) throws IOException {
        // Path to the PDF file
        String filePath = "P:/GOOGLE DRIVE/LEARNING HUB/APTITUDE/BOOKS/secrets-of-mental-math.pdf";
        String pattern = "that"; // Pattern to search for

        // Read the PDF content
        String text = readPdfContent(filePath);

        // Benchmark Naive Pattern Search
        long startTime = System.nanoTime();
        int naiveCount = naivePatternSearch(text, pattern);
        long naiveTimeNano = System.nanoTime() - startTime;
        double naiveTimeMs = naiveTimeNano / 1_000_000.0; // Convert to milliseconds
        System.out.println("Naive Count: " + naiveCount + ", Time: " + String.format("%.2f", naiveTimeMs) + " ms");

        // Benchmark KMP Pattern Search
        startTime = System.nanoTime();
        int kmpCount = kmpPatternSearch(text, pattern);
        long kmpTimeNano = System.nanoTime() - startTime;
        double kmpTimeMs = kmpTimeNano / 1_000_000.0; // Convert to milliseconds
        System.out.println("KMP Count: " + kmpCount + ", Time: " + String.format("%.2f", kmpTimeMs) + " ms");

        // Benchmark Rabin-Karp Pattern Search
        startTime = System.nanoTime();
        int rabinKarpCount = rabinKarpPatternSearch(text, pattern);
        long rabinKarpTimeNano = System.nanoTime() - startTime;
        double rabinKarpTimeMs = rabinKarpTimeNano / 1_000_000.0; // Convert to milliseconds
        System.out.println("Rabin-Karp Count: " + rabinKarpCount + ", Time: " + String.format("%.2f", rabinKarpTimeMs) + " ms");
    }

    // Method to read the content of a PDF file
    private static String readPdfContent(String filePath) throws IOException {
        StringBuilder text = new StringBuilder();
        try (InputStream inputStream = new FileInputStream(filePath);
             org.apache.pdfbox.pdmodel.PDDocument document = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream);
             org.apache.pdfbox.text.PDFTextStripper pdfStripper = new org.apache.pdfbox.text.PDFTextStripper()) {
            text.append(pdfStripper.getText(document));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return text.toString();
    }

    // Naive Pattern Search Algorithm
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

    // KMP Pattern Search Algorithm
    private static int kmpPatternSearch(String text, String pattern) {
        int count = 0;
        int m = pattern.length();
        int n = text.length();
        int[] lps = computeLPSArray(pattern);

        int i = 0; // index for text
        int j = 0; // index for pattern

        while (i < n) {
            if (pattern.charAt(j) == text.charAt(i)) {
                i++;
                j++;
            }

            if (j == m) {
                count++;
                j = lps[j - 1];
            } else if (i < n && pattern.charAt(j) != text.charAt(i)) {
                if (j != 0) {
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }
        }
        return count;
    }

    // Compute LPS Array for KMP
    private static int[] computeLPSArray(String pattern) {
        int m = pattern.length();
        int[] lps = new int[m];
        int length = 0;
        int i = 1;

        lps[0] = 0;

        while (i < m) {
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

    // Rabin-Karp Pattern Search Algorithm
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
