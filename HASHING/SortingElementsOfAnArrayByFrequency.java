package HASHING;

import java.util.*;

public class SortingElementsOfAnArrayByFrequency {
    public static void main(String[] args) {
        int [] arr = {9,9,9,2,5};
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        List<Map.Entry <Integer,Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        entryList.sort((e1, e2) -> {
            int freqCompare=e2.getValue().compareTo(e1.getValue());
            int KeyCompare=e1.getKey().compareTo(e2.getKey());
            return    freqCompare==0?KeyCompare:freqCompare;
        });
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : entryList) {
            int count = entry.getValue();
            while (count-- > 0) {
                arrayList.add(entry.getKey());
            }
        }
        System.out.println(arrayList);
    }
}
