package HASHING;

import java.util.HashMap;

public class CheckEqualArrays {

    public static void main(String[] args) {
        int [] arr1 = {1,2,5,4,0};
        int [] arr2 = {2,4,5,0,1};
        HashMap<Integer,Integer> freq = new HashMap<>();
        CheckEqualArrays obj = new CheckEqualArrays();
        boolean result =   obj.isEqualArray(freq, arr1,arr2);
        System.out.println(result);
    }
    private  boolean isEqualArray(HashMap<Integer,Integer> freq,int [] arr1,int [] arr2) {
        int n1= arr1.length;
        int n2=arr2.length;
        if(n1!=n2)
            return false;
        int start=0;
        int end=n1-1;
        while(start<end)
        {
            freq.put(arr1[start],freq.getOrDefault(arr1[start],0)+1);
            freq.put(arr2[start],freq.getOrDefault(arr2[start],0)-1);

            freq.put(arr1[end],freq.getOrDefault(arr1[end],0)+1);
            freq.put(arr2[end],freq.getOrDefault(arr2[end],0)-1);

            ++start;
            --end;
        }
        for (int  x: freq.values())
            if(x!=0)
                return false;
        return true;
    }
}
