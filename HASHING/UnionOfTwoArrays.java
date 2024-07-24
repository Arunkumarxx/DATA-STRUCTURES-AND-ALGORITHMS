package HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5};
        int []arr2 = {1, 2, 3};
        int n1= arr1.length;
        int n2= arr2.length;
        int count=0;
        HashSet<Integer> hashSet =new HashSet<>();
        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            hashSet.add(arr1[i]);
            hashSet.add(arr2[j]);
            ++i;
            ++j;
        }
        
    }
}
