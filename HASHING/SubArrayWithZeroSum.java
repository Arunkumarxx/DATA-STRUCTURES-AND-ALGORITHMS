package HASHING;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int [] arr ={6,-1,-3,4,-2,2,4,6,-12,-7};
        SubArrayWithZeroSum obj = new SubArrayWithZeroSum();
        System.out.println(obj.subArrayWithZeroSumFound(arr));
    }
    private  boolean subArrayWithZeroSumFound (int [] arr) {
        HashSet<Integer> hashSet =new HashSet<>();
        int n= arr.length;
        int sum=0;
        for (int i=0; i<n; ++i)
        {
            sum+=arr[i];

            if(sum==0 || hashSet.contains(sum)) {
                System.out.println(hashSet);
                return true;
            }
            hashSet.add(sum);
        }
        return false;
    }
}
