package HASHING;

import java.util.ArrayList;
import java.util.Arrays;

public class QuadraticProbing {
    public static void main(String[] args) {
        QuadraticProbing Quadratic = new QuadraticProbing();
        int [] arr = {21,10,32,43};
        short  hashSize=11;
        int [] hashTable  =new int[hashSize];
        byte n=(byte) arr.length;

        for (int i=0; i<hashSize; ++i)
            --hashTable[i];

        for (int i=0; i<n; ++i)
        {
            if(hashTable[i]==arr[i])
                continue;
            else if(hashTable[i]==-1)
                hashTable[i]=arr[i];
            else Quadratic.QuadraticFindAndInsert(hashSize,hashTable,arr[i]);
        }
        System.out.println(Arrays.toString(hashTable));
    }
   private void QuadraticFindAndInsert(int hashSize,int [] hashTable,int value) {
       int i = 0;
       int count = 0;
       int ind = value % hashSize;

       while (hashTable[ind] != -1 && hashTable[ind] != value) {
           ind = (value + (i * i)) % hashSize;
           ++i;
           ++count;
           if (count == hashSize)  // Hash table is full
               return;
       }
       hashTable[ind] = value;
    }
}
