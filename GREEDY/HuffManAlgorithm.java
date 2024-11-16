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
        String[] table = new String[52]; // to store Huffman codes for 'a' to 'z' and 'A' to 'Z'
        System.out.println(encodingAlgorithm.enCodingString(string, n, table));
    }
}

class HuffManEncodingAlgorithm {
    int[] freq = new int[52]; // Frequency table for 26 lowercase and 26 uppercase letters

    protected void print(Pair root, String code, String[] table) {
        if (root == null) {
            return;
        }

        // If the node is a leaf node (a character), store its Huffman code in the table
        if (Character.isLetter(root.value)) {
            if (Character.isLowerCase(root.value)) {
                int ind = root.value - 'a';
                table[ind] = code;
            } else {
                int ind = root.value - 'A' + 26; // Index for uppercase letters
                table[ind] = code;
            }
        }

        // Traverse the left and right subtrees
        print(root.left, code + '0', table);
        print(root.right, code + '1', table);
    }

    protected String enCodingString(String string, int n, String[] table) {
        // Step 1: Build frequency table
        for (int i = 0; i < n; ++i) {
            char c = string.charAt(i);
            if (Character.isLowerCase(c)) {
                freq[c - 'a']++; // Index for lowercase letters
            } else {
                freq[c - 'A' + 26]++; // Index for uppercase letters
            }
        }

        // Step 2: Build a min-heap (priority queue) for Huffman tree
        PriorityQueue<Pair> minheap = new PriorityQueue<>(Comparator.comparingInt(a -> a.freq));
        for (int i = 0; i < 52; ++i) {
            if (freq[i] != 0) {
                minheap.add(new Pair(intToChar(i), freq[i], null, null));
            }
        }

        // Step 3: Build Huffman tree
        while (minheap.size() > 1) {
            Pair pair1 = minheap.poll();
            Pair pair2 = minheap.poll();
            int freqSum = pair1.freq + pair2.freq;
            Pair newPair = new Pair('*', freqSum, pair1, pair2);
            minheap.add(newPair);
        }

        // Step 4: Generate Huffman codes for each character
        print(minheap.poll(), "", table);

        // Step 5: Encode the input string
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
        if (i <= 25) {
            return (char) ('a' + i); // 'a' to 'z'
        } else {
            return (char) ('A' + (i - 26)); // 'A' to 'Z'
        }
    }
}
