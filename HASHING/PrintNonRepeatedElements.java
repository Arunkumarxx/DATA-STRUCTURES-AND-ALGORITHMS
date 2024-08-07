package HASHING;

import java.util.ArrayList;
import java.util.HashMap;


public class PrintNonRepeatedElements {
    public static void main(String[] args) {
        int [] arr ={1,1,2,2,3,3,4,5,6,7};
        int n= arr.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i=0; i<n; ++i)
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);
        ArrayList<Integer> arrayList =new ArrayList<>();
        for (int i=0 ;i<n; ++i)
        {
            if(hashMap.get(arr[i])==1)
                arrayList.add(arr[i]);
        }
        System.out.println(arrayList);
    }
}
