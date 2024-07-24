package HASHING;

import java.util.HashMap;

public class SortAnArrayAccordingToTheOther {
    public static void main(String[] args) {
        int [] arr1 = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        int [] arr2 = {2,1,8,3};
        int n1= arr1.length;
        int n2= arr2.length;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int i=0; i<n2; ++i)
        hashMap.put(arr2[i],0);
        int i=0,j=n1-1;

        while(i<j )
        {
            if(hashMap.containsKey(arr1[i]))// left pointer
                hashMap.put(arr1[i],hashMap.getOrDefault(arr1[i],0)+1);

            if(hashMap.containsKey(arr1[j])) // right pointer
                hashMap.put(arr1[j],hashMap.getOrDefault(arr1[j],0)+1);
            ++i;
            --j;
        }
        // we needed handle edge case  if arr is odd size ...
        if(i==j && hashMap.containsKey(arr1[i]))
            hashMap.put(arr1[i],hashMap.getOrDefault(arr1[i],0)+1);

        System.out.println(hashMap);
        
    }
}
