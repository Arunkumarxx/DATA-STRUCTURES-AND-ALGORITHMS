package HASHING;

import java.util.HashMap;

public class SortingElementsOfAnArrayByFrequency {
    public static void main(String[] args) {
        int [] arr = {9,9,9,2,5,5,5};
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        System.out.println(hashMap);
    }
}
