package HASHING;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int [] arr ={ 1,2,1,3,4,2,3};
        System.out.println(count(arr, arr.length,4));
    }
    private static ArrayList<Integer> count(int [] arr,int n,int k) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for(int i=0; i<k;++i)
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        ArrayList<Integer> res =new ArrayList<>();
        res.add(hashMap.size());
        for(int i=k; i<n; ++i)
        {
            if(hashMap.get(arr[i-k])==1)
                hashMap.remove(arr[i-k]);
            else hashMap.put(arr[i-k],hashMap.getOrDefault(arr[i-k],0)-1);
            hashMap.put(arr[k],hashMap.getOrDefault(arr[k],0)+1);
            res.add(hashMap.size());
        }
        return res;
    }
}