package HASHING;

import java.util.*;

public class SortingElementsOfAnArrayByFrequency {
    public static void main(String[] args) {
        int [] arr = {9,9,9,2,5};
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for (int x:arr)
            hashMap.put(x, hashMap.getOrDefault(x,0)+1);
        List<Map.Entry <Integer,Integer>> entryList = new ArrayList<>(hashMap.entrySet());
        entryList.sort((e1, e2) -> e2.getValue()-e1.getValue());
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry :entryList)
        {
            int ele=entry.getValue();
            while(ele>=1)
            {
                arrayList.add(entry.getKey());
                --ele;
            }
        }
        System.out.println(arrayList);
    }
}
