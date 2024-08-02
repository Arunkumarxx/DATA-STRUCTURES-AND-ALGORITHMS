package HASHING;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        int [] arr ={ 1,2,1,3,4,2,3};
        System.out.println(count(arr, arr.length));
    }
    private static ArrayList<Integer> count(int [] arr,int n) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
        {
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        }
        System.out.println(hashMap);
        return new ArrayList<>();
    }
}