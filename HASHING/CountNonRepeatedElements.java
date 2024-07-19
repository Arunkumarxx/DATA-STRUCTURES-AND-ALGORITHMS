package HASHING;

import java.util.HashMap;

public class CountNonRepeatedElements {
    static long countNonRepeated(int arr[], int n)
    {
        // add your code
        HashMap<Integer,Integer> hashMap = new HashMap ();
        int start=0;
        int end=n-1;
        while(start<end)
        {
            hashMap.put(arr[start],hashMap.getOrDefault(arr[start],0)+1);

            hashMap.put(arr[end],hashMap.getOrDefault(arr[end],0)+1);

            ++start;
            --end;
        }
        int i=0;
        int j=n-1;
        int count=0;
        while(i<j)
        {
            if(hashMap.get(arr[i])==1)
                ++count;
            if(hashMap.get(arr[j])==1)
                ++count;
            ++i;
            --j;
        }
        if(i==j)
            if(hashMap.get(arr[i])==1)
                ++count;

        return count;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5};
        int n= arr.length;
        countNonRepeated(arr,n);
    }
}
