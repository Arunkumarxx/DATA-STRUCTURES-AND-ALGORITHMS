package HASHING;

import java.util.Arrays;

class Solution{
    //Function to fill the array elements into a hash table
    //using Linear Probing to handle collisions.
    int[] linearProbing(int hash_size, int arr[], int sizeOfArray)
    {

        int n = arr.length;
        int[] hashTable = new int[hash_size];

        // Initialize the hash table with -1
        Arrays.fill(hashTable, -1);

        for (int i = 0; i < n; i++) {
            int ind = arr[i] % hashTable.length;
            if (hashTable[ind] == arr[i]) {
                continue;
            }
            if (hashTable[ind] == -1) {
                hashTable[ind] = arr[i];
            } else {
                findPosAndInsert(hashTable, arr[i], ind);
            }
        }
        return hashTable;
    }

    static void findPosAndInsert(int [] hashTable,int value,int ind) {
        int index=ind;
        int intialIndex=ind;
        int count=0;
        while(hashTable[index]!=-1  &&  hashTable[index]!=value)
        {
            index=(index+1)% hashTable.length;
            ++count;

            if(intialIndex==index || count==hashTable.length )
                return;

        }
        hashTable[index]=value;
    }
}