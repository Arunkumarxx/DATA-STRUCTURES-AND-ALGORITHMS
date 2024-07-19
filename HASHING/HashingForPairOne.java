package HASHING;

import java.util.Arrays;
import java.util.Random;

public class HashingForPairOne {
    private int [] PaidCheckBruteForce(int [] arr,int n,int target){
        Arrays.sort(arr);
        int start=0 ,end=n-1;
        int sum=0;
        while(start<end)
        {
            if(sum==(arr[start]+arr[end]))
                return new int []{ start , end };
            if(sum<(arr[start]+arr[end]))
                ++start;
            else  --end;
        }
        return new int [] {};
    }
    public static void main(String[] args) {
        int [] arr = new int [10];
        Random random = new Random();
        for (int i=0 ;i< arr.length; ++i)
            arr[i]=i+1;
        HashingForPairOne obj = new HashingForPairOne();
        System.out.println(  Arrays.toString(obj.PaidCheckBruteForce(arr, arr.length,10)));
//        System.out.println(Arrays.toString(arr));
    }
}
