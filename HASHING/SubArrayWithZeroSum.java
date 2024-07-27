package HASHING;

import java.util.HashSet;

public class SubArrayWithZeroSum {
    public static void main(String[] args) {
        int [] arr ={56,2,2,6,-10};
        SubArrayWithZeroSum obj = new SubArrayWithZeroSum();
        System.out.println(obj.subArrayWithZeroSumFound(arr));
    }
    private  boolean subArrayWithZeroSumFound (int [] arr) {
        HashSet<Integer> hashSet =new HashSet<>();
        int n= arr.length;
        int sum=0;
        hashSet.add(arr[0]);
        for (int i=1; i<n; ++i)
        {
            sum+=arr[i-1]+arr[i];
            System.out.println(sum);
            if(hashSet.contains(sum))
                return true;
            else hashSet.add(sum);
        }
        System.out.println(hashSet);
        return false;
    }
}
