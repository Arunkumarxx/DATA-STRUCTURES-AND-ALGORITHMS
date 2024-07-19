package HASHING;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SortingElementsOfAnArrayByFrequency {
    public static void main(String[] args) {
        int [] arr = {9,9,9,2,5,5,5};
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        List<Map.Entry <Integer,Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        System.out.println(hashMap);
    }
}
