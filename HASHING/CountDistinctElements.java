package HASHING;

import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        int [] arr ={1,2,3,3,4,4,5};
        HashSet<Integer> freq = new HashSet();
        int start=0;
        int end= arr.length-1;
        while(start<end)
        {
            freq.add(arr[start]);
            freq.add(arr[end]);
            ++start;
            --end;
        }
        if(start==end)
            freq.add(arr[start]);
        System.out.println("Distinct Elements "+freq.size());
    }
}
