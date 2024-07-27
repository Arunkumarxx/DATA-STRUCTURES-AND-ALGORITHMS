package HASHING;

import java.util.HashSet;

public class ZeroSumSubArrays {
    public static void main(String[] args) {
        int [] arr ={6,-1,-3,4,-2,2,4,6,-12,-7};
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
