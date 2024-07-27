package HASHING;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int [] arr ={4,2,-3,1,6};
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

            if(sum==0 || hashSet.contains(sum))
                return true;
            hashSet.add(sum);
        }
        return false;
    }
}
