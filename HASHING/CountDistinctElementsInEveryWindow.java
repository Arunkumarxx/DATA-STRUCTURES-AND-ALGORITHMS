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
        for(int i=0; i<k;++k)
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        int i=0,j=(i-(k-1));
        return new ArrayList<>();
    }
}