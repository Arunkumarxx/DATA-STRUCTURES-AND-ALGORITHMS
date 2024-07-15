package HASHING;

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
            else Quadratic.QuadraticFindAndInsert(arr,i,hashSize);
        }
        System.out.println(32%11);
    }
    void QuadraticFindAndInsert(int [] arr,int i,int hashSize) {

    }
}
