package HASHING;

import java.util.HashMap;
import java.util.Iterator;

public class CheckEqualArrays {

    public static void main(String[] args) {
        int [] arr1 = {1,2,5,4,0};
        int [] arr2 = {2,4,5,0,1};
        HashMap<Integer,Integer> freq = new HashMap<>();
        CheckEqualArrays obj = new CheckEqualArrays();
        obj.isEqualArray(freq, arr1,arr2);
    }
    private  boolean isEqualArray(HashMap<Integer,Integer> freq,int [] arr1,int [] arr2) {
        int n1= arr1.length;
        int n2=arr2.length;
        if(n1!=n2)
            return false;
        int i=0 ,j=0;
        while(i<n1 && j<n2)
        {
            freq.put(arr1[i],freq.getOrDefault(arr1[i],0)+1);
            freq.put(arr2[i],freq.getOrDefault(arr2[i],0)-1);
            ++i;
            ++j;
        }
        while(i<n1) {
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);
            ++i;
        }
        while(j<n2)
        {
            freq.put(arr2[j],freq.getOrDefault(arr2[j],0)-1);
            ++j;
        }
        for (Object x:freq.values())
            System.out.println(x);
        return true;
    }
}
