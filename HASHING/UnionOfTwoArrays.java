package HASHING;

import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5};
        int []arr2 = {1, 2, 3};
        int n= arr1.length;
        HashSet<Integer> set =new HashSet<>();
        for (int i=0; i<n;++i)
        {
            set.add(arr1[i]);
        }
    }
}
