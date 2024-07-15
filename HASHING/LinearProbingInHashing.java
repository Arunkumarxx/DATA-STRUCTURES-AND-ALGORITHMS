package HASHING;

import java.util.Arrays;

public class LinearProbingInHashing {
    public static void main(String[] args) {
        int [] arr ={4,14,24,44};
        int hash_size=10;
        int n = arr.length;
        int[] hashTable = new int[hash_size];

        for(int i=0; i<hash_size;i++)
            --hashTable[i];

        for (int i = 0; i < n; i++) {
            int ind = arr[i] % hashTable.length;
                findPosAndInsert(hashTable, arr[i], ind);
        }
        System.out.println(Arrays.toString(hashTable));
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
