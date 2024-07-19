package HASHING;

import java.util.HashMap;

public class CountDistinctElements {
    public static void main(String[] args) {
        int [] arr ={10,10};
        HashMap<Integer,Integer> freq = new HashMap<>();
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {

            if(!(freq.getOrDefault(arr[start],0)>1))
                freq.put(arr[start],1);
            if(!(freq.getOrDefault(arr[end],0)>1))
                freq.put(arr[end],1);
            ++start;
            --end;
        }
        if(start==end)
            if(!( freq.getOrDefault(arr[start],0)>1))
                freq.put(arr[start],1);
        System.out.println("Distinct Elements "+freq.size());
    }
}
