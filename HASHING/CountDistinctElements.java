package HASHING;

import java.util.HashMap;

public class CountDistinctElements {
    public static void main(String[] args) {
        int [] arr ={15,12,13,12,13,13,18};
        HashMap<Integer,Integer> freq = new HashMap<>();
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            freq.put(arr[start],arr[start]);
            freq.put(arr[end],arr[end]);
            if(freq.get(arr[start])>(Integer)1)
                freq.remove(arr[start]);
            if(freq.get(arr[end])>(Integer)1)
                freq.remove(arr[end]);

            ++start;
            --end;
        }
        if(start==end)
            if(!( freq.getOrDefault(arr[start],0)>1))
                freq.put(arr[start],arr[start]);
        System.out.println("Distinct Elements "+freq.size());
    }
}
