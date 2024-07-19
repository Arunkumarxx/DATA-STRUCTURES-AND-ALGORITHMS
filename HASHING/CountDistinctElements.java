package HASHING;

import java.util.*;

public class CountDistinctElements {
    public static void main(String[] args) {
        int [] arr ={10,10,23,4,3,4,343243};
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
