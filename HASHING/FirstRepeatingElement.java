package HASHING;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FirstRepeatingElement {
    public static void main(String[] args) {
        int [] arr ={1,5,3,4,3,5,6};
        int n= arr.length;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        int i=0,j=n-1;
        while(i<j) {
            hashMap.put(arr[i], hashMap.getOrDefault(arr[i],0)+1);
            hashMap.put(arr[j], hashMap.getOrDefault(arr[j],0)+1);
            ++i;
            --j;
        }
        if(i==j)
            hashMap.put(arr[i],hashMap.getOrDefault(arr[i],0)+1);

        for (int k=0; k<n; ++k) {
            if (hashMap.get(arr[k]) >= 2) {
                System.out.println(arr[k]);
                k=n;
            }
        }
    }
}
