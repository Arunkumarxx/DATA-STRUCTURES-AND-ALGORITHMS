package HASHING;

import java.util.HashSet;

public class ZeroSumSubArrays {
    public static void main(String[] args) {
        int [] arr ={0,0,5,5,0,0};
        ZeroSumSubArrays obj = new ZeroSumSubArrays();
        System.out.println(obj.findSubArr(arr));
    }
    private  int findSubArr (int [] arr) {
        int count=0;
        int sum=0;
        int n=arr.length;
        HashSet<Integer> set =new HashSet<>();
        for (int i=0; i<n; ++i)
        {
            sum+=arr[i];

            if(sum==0 || set.contains(sum))
                ++count;
            set.add(sum);
        }
        return count;
    }
}
