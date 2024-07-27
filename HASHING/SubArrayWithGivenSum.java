package HASHING;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {


    public static void main (String[] args)
    {
        int [] arr = new int[] {10,2,-2,-20,10};
        int sum=-10;
        int n = arr.length;

        System.out.println(isSum(arr, n, sum));

    }

    static int  isSum(int arr[], int n, int target)
    {
        HashMap<Integer,Integer> hashMap =new HashMap<Integer,Integer>();
        hashMap.put(0,1);
        int sum=0;
        int count=0;
        for(int i=0; i<n; ++i)
        {
            sum+=arr[i];

            if(hashMap.containsKey(sum-target))
                count+=hashMap.getOrDefault(sum,0);
            hashMap.put(sum,+1);
        }
        return count;
    }

}
