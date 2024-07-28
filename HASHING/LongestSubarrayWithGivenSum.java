package HASHING;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={5,8,-4,-4,9,-2,2};
        int k=0;
        System.out.println(BruteForce(arr, arr.length,k));
        System.out.println(BruteForceOptimal(arr, arr.length,k));
        System.out.println(Optimal(arr, arr.length,k));

    }
    private static int  BruteForce(int [] arr,int n,int target) {
        int res=0;
        for (int i=0; i<n; ++i)
        {
            for (int j=i; j<n; ++j)
            {
                int sum=0;
                int count=0;
                for (int k=i; k<=j; k++)
                {
                    sum+=arr[k];
                    ++count;
                    if(sum==target && count>res)
                        res=count;
                }
            }
        }
        return res;
    }
    private static int  BruteForceOptimal(int [] arr,int n,int target) {
        int res=0;
        for (int i=0; i<n; ++i)
        {
            int sum=0;
            int count=0;
            for (int j=i; j<n; ++j)
            {
                sum=sum+arr[j];
                ++count;
                if(sum==target && count>res)
                    res=count;
            }
        }
        return res;
    }
    private static int Optimal (int [] arr,int n,int target) {
        int res=0;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        int sum=0;
        for (int i=0; i<n; ++i)
        {
            sum+=arr[i];
            if(sum==target)
                res=i+1;
            if(!hashMap.containsKey(sum))
                hashMap.put(sum,i);
            if(hashMap.containsKey(sum-target) )
                res=Math.max(res,i-hashMap.get(sum-target));
            hashMap.put(hashMap.getOrDefault(sum,0),+1);
        }
        return res;
    }
}
/*

 */