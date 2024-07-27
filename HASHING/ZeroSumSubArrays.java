package HASHING;

import java.util.HashMap;
import java.util.HashSet;

public class ZeroSumSubArrays {
    public static void main(String[] args) {
        int [] arr ={0,0,5,5,0,0};
        ZeroSumSubArrays obj = new ZeroSumSubArrays();
        System.out.println(obj.findSubArr(arr));
    }
    private  int findSubArr (int [] arr) {
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        int count=0;
        int sum=0;
        int n=arr.length;
        hashMap.put(0,1);
        for(int i=0; i<n; ++i)
        {
            sum+=arr[i];
            if(sum==0 || hashMap.containsKey(sum)) {
                hashMap.put(hashMap.get(sum),hashMap.getOrDefault(sum,0)+1);
                count += hashMap.getOrDefault(sum, 0);
            }
            hashMap.put(sum,hashMap.getOrDefault(sum,0)+1);
        }
        return count;
    }
}
