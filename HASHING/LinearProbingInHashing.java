package HASHING;

import java.util.Arrays;

public class LinearProbingInHashing {
    public static void main(String[] args) {
        int [] arr ={4,14,24,44};
        int n= arr.length;
        int [] hashTable = new int[10];
        for (int i=0; i<hashTable.length;++i)
            --hashTable[i];
        for (int i=0; i<n; i++)
        {
            int ind=(arr[i]%10);
           if(hashTable[ind]==arr[i])
               continue;
           if(hashTable[ind]==-1)
               hashTable[ind]=arr[i];
           else findPosAndInsert(arr,hashTable,i,ind);
        }
        System.out.println(Arrays.toString(hashTable));
    }
    static void findPosAndInsert(int [] arr,int [] hastTable,int i,int ind) {
        int index=ind;
        while(hastTable[index]!=-1)
        {
            index+=(index+1)% hastTable.length;
            if(hastTable[index]==)
        }
    }
}
