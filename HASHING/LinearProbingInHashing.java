package HASHING;

import java.util.Arrays;

public class LinearProbingInHashing {
    public static void main(String[] args) {
        int[] arr = {4, 14, 24, 44};
        int n = arr.length;
        int[] hashTable = new int[10];

        // Initialize the hash table with -1
        Arrays.fill(hashTable, -1);

        for (int i = 0; i < n; i++) {
            int ind = arr[i] % 10;
            if (hashTable[ind] == arr[i]) {
                continue;
            }
            if (hashTable[ind] == -1) {
                hashTable[ind] = arr[i];
            } else {
                findPosAndInsert(arr[i], hashTable, ind);
            }
        }

        System.out.println(Arrays.toString(hashTable));
    }

    static void findPosAndInsert(int value, int[] hashTable, int ind) {
        int index = ind;
        while (hashTable[index] != -1) {
            index = (index + 1) % hashTable.length;
            if (hashTable[index] == value) {
                return;
            }
        }
        hashTable[index] = value;
    }
}
