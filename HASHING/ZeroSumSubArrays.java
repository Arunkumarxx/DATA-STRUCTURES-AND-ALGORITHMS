package HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class ZeroSumSubArrays {
    public static void main(String[] args) {
        int [] arr ={6,-1,-3,4,-2,2,4,6,-12,-7};
        ZeroSumSubArrays obj = new ZeroSumSubArrays();
        System.out.println(obj.findSubArr(arr));
    }
    private  long findSubArr (int [] arr) {
        long n=arr.length;
        HashMap<Long,Long> hashMap =new HashMap<>();
        long count=0;
        long sum=0;
        hashMap.put(0L,1L);
        for(long i=0; i<n; ++i)
        {
            sum+=arr[(int)i];
            if(sum==0 || hashMap.containsKey(sum)) {
                hashMap.put(hashMap.get(sum),hashMap.getOrDefault(sum,0)+1);
                count += hashMap.getOrDefault(sum, 0);
            }
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
