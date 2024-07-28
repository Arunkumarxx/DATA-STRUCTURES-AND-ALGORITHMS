package HASHING;

import java.util.HashMap;

public class LongestCommonSpanWithSameSumInBinaryArrays {
    public static void main(String[] args) {

    }
    private static int Optimal (int [] arr,int n,int target) {
        int res=0;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        int sum=0;
        hashMap.put(0,-1);
        for (int i=0; i<n; ++i)
        {
            sum+=arr[i];
            if(hashMap.containsKey(sum-target))
            {
                if(i-hashMap.get(sum-target)>res)
                    res=i-hashMap.get(sum-target);
            }
            if(!hashMap.containsKey(sum))
                hashMap.put(sum,i);
        }
        return res;
    }
}
