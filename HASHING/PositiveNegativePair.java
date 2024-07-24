package HASHING;

import java.util.ArrayList;
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
            hashMap.put(Math.abs(arr[i]),hashMap.getOrDefault(Math.abs(arr[i]),0)-1);
            if(arr[i]>0)
            hashMap.put(Math.abs(arr[i]),hashMap.getOrDefault(Math.abs(arr[i]),0)+1);
        }
        ArrayList<Integer> res =new ArrayList<>();
        for(int i=0; i<n; ++i)
        {
            if(arr[i]>0 && hashMap.get(arr[i])==0) {
                res.add(-arr[i]);
                res.add(arr[i]);
            }
        }
        System.out.println(hashMap);
        System.out.println(res);
    }
}
