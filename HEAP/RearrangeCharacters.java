package HEAP;

public class RearrangeCharacters {
    static String rearrangeCharacters(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();

        int n = str.length();
        for (int i = 0; i < n; ++i) {
            char currChar = str.charAt(i);
            hashMap.put(currChar, hashMap.getOrDefault(currChar, 0) + 1);

            // If any character frequency is more than (n + 1) / 2, return "-1"
            if (hashMap.get(currChar) > (n + 1) / 2) {
                return "-1";
            }
        }

        // Max-Heap to store characters by their frequency
        PriorityQueue<Pair> maxHeap = new PriorityQueue<>((a, b) -> b.freq - a.freq);

        // Add all characters and their frequencies to the heap
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            maxHeap.add(new Pair(entry.getKey(), entry.getValue()));
        }

        char[] res = new char[n];
        int i = 0;

        // Fill the result array with characters from the heap
        while (!maxHeap.isEmpty()) {
            Pair pair = maxHeap.poll();

            // Place the current character at every second index
            while (pair.freq > 0 && i < n) {
                res[i] = pair.c;
                pair.freq--;
                i += 2;
            }

            // When even indices are full, start filling odd indices
            if (i >= n) {
                i = 1;
            }

            while (pair.freq > 0 && i < n) {
                res[i] = pair.c;
                pair.freq--;
                i += 2;
            }
        }

        return new String(res);
    }

    static class Pair {
        char c;
        int freq;

        Pair(char c, int freq) {
            this.c = c;
            this.freq = freq;
        }
    }
    public static void main(String[] args) {

    }
}
