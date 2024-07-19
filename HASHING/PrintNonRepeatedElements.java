package HASHING;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PrintNonRepeatedElements {
    public static void main(String[] args) {
        int [] arr ={1,1,2,2,3,3,4,5,6,7};
        int n= arr.length;
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int start=0;
        int end=n-1;
        while(start<end)
        {
            hashMap.put(arr[start],hashMap.getOrDefault(arr[start],0)+1);
            hashMap.put(arr[end],hashMap.getOrDefault(arr[end],0)+1);
            ++start;
            --end;
        }
        if(start==end) hashMap.put(arr[start],hashMap.getOrDefault(arr[start],0)+1);

        ArrayList<Integer> result= new ArrayList<>();
        int i=0;
        int j=n-1;
        while(i<j)
        {
           result.add(hashMap.get(i));
           result.add(hashMap.get(j));
            ++i;
            --j;
        }
        if(i==j) hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);

        System.out.println(hashMap);
    }
}
