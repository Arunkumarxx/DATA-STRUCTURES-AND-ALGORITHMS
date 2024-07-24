package HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int [] arr1 = {1, 2, 3, 4, 5};
        int []arr2 = {1, 2, 3};
        int n1= arr1.length;
        int n2= arr2.length;
        int i=0,j=0;
        int count=0;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        while(i<n1 && j<n2)
        {
            hashMap.put(arr1[i],hashMap.getOrDefault(arr1[i],0)+1);
            hashMap.put(arr2[j],hashMap.getOrDefault(arr2[j],0)-1);
            ++i;
            ++j;
        }
        while(i<n1)
        {
            hashMap.put(arr1[i],hashMap.getOrDefault(arr1[i],0)+1);
            ++i;
        }
        while(j<n2)
        {
            hashMap.put(arr2[j],hashMap.getOrDefault(arr2[j],0)-1);
            ++j;
        }
        System.out.println(hashMap);
    }
}
