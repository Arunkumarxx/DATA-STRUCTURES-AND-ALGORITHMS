package HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class PositiveNegativePair {
    public static void main(String[] args) {
        int [] arr = {1,3,6,-2,-1,-3,2,7};
        int n= arr.length;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int i=0; i<n; ++i)
        {
            if(arr[i]<0)
            hashMap.put(Math.abs(arr[i]),hashMap.getOrDefault(arr[i],0)-1);
            if(arr[i]>0)
            hashMap.put(Math.abs(arr[i]),hashMap.getOrDefault(arr[i],0)-1);
        }
        System.out.println(hashMap);
    }
}
