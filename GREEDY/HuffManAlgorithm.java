package GREEDY;

import java.util.Comparator;
import java.util.PriorityQueue;

class Pair {
    char value;
    Pair left, right;
    int freq;

    Pair(char value, int freq, Pair left, Pair right) {
        this.value = value;
        this.freq = freq;
        this.left = left;
        this.right = right;
    }
}

public class HuffManAlgorithm {
    public static void main(String[] args) {
        String string = "AAAAAABCCCCCCDDEEEEE";
        int n = string.length();
        HuffManEncodingAlgorithm encodingAlgorithm = new HuffManEncodingAlgorithm();
        String[] table = new String[52];
        System.out.println("Encoded String: " + encodingAlgorithm.enCodingString(string, n, table));

        // Now decode the string using Huffman Decoding Algorithm
        HuffManDecodingAlgorithm decodingAlgorithm = new HuffManDecodingAlgorithm();
        String decodedString = decodingAlgorithm.deCodingString(encodingAlgorithm.enCodingString(string, n, table), table);
        System.out.println("Decoded String: " + decodedString);
    }
}

class HuffManEncodingAlgorithm {
    int[] freq = new int[52];

    protected void print(Pair root, String code, String[] table) {
        if (root == null)
            return;
        // Base case: Leaf node, assign code to the respective character in the table
        if (Character.isLetter(root.value)) {
            if (Character.isLowerCase(root.value)) {
                int ind = root.value - 'a';
                table[ind] = code;
            } else {
                int ind = root.value - 'A' + 26;
                table[ind] = code;
            }
        }
        // Traverse left and right subtrees
        print(root.left, code + '0', table);
        print(root.right, code + '1', table);
    }

    protected String enCodingString(String string, int n, String[] table) {
        // Frequency calculation
        for (int i = 0; i < n; ++i) {
            char c = string.charAt(i);
            if (Character.isLowerCase(c)) {
                freq[c - 'a']++;
            } else {
                freq[c - 'A' + 26]++;
            }
        }

        // Create a priority queue to store the pairs (Huffman tree nodes)
        PriorityQueue<Pair> minheap = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));

        // Add all non-zero frequency characters to the heap
        for (int i = 0; i < 52; ++i) {
            if (freq[i] != 0) {
                minheap.add(new Pair(intToChar(i), freq[i], null, null));
            }
        }

        // Build the Huffman Tree
        while (minheap.size() > 1) {
            Pair pair1 = minheap.poll();
            Pair pair2 = minheap.poll();
            int freqSum = pair1.freq + pair2.freq;
            Pair newPair = new Pair('*', freqSum, pair1, pair2);
            minheap.add(newPair);
        }

        // Start generating Huffman codes from the root of the tree
        print(minheap.poll(), "", table);

        // Create the encoded string by replacing characters with their corresponding Huffman codes
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            char currentChar = string.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                int index = currentChar - 'a';
                stringBuilder.append(table[index]);
            } else {
                int index = currentChar - 'A' + 26;
                stringBuilder.append(table[index]);
            }
        }

        return stringBuilder.toString();
    }

    protected char intToChar(int i) {
        if (i <= 25)
            return (char) ('a' + i);
        else
            return (char) ('A' + (i - 26));
    }
}

class HuffManDecodingAlgorithm {

    // Decode the encoded string
    public String deCodingString(String encodedString, String[] table) {
        // Build a reverse lookup table for decoding
        String[] reverseTable = new String[52];
        for (int i = 0; i < 52; i++) {
            reverseTable[i] = table[i];
        }

        // Reverse the table to decode the encoded string
        StringBuilder decodedString = new StringBuilder();
        int n = encodedString.length();
        StringBuilder currentCode = new StringBuilder();

        for (int i = 0; i < n; i++) {
            currentCode.append(encodedString.charAt(i));

            // Check if the current code exists in the reverse table
            for (int j = 0; j < 52; j++) {
                if (reverseTable[j] != null && reverseTable[j].equals(currentCode.toString())) {
                    decodedString.append(intToChar(j));
                    currentCode.setLength(0);  // Reset the current code
                    break;
                }
            }
        }
        return decodedString.toString();
    }

    // Convert index back to character
    private char intToChar(int i) {
        if (i <= 25)
            return (char) ('a' + i);
        else
            return (char) ('A' + (i - 26));
    }
}
