package HASHING;

import java.util.HashMap;

public class FrequenciesOfArrayElements {
    public static void main(String[] args) {
        int [] arr ={10, 20, 20, 10, 10, 20, 5, 20};
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        for(int x:arr)
            hashMap.put(x,hashMap.getOrDefault(x,0)+1);
        for (Object x: hashMap.entrySet())
            System.out.println(x);
    }
}
