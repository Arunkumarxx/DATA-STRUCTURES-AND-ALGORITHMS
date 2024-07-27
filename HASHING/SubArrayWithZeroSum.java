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
        int sum=arr[0];
        hashSet.add(arr[0]);
        for (int i=1; i<n; ++i)
        {
            if(arr[i]==0)
                return true;
            sum+=arr[i];
            if(hashSet.contains(sum))
                return true;
            else hashSet.add(sum);
        }
        return false;
    }
}
