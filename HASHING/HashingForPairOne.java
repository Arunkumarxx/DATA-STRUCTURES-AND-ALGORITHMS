package HASHING;

import java.util.Arrays;
import java.util.Random;

public class HashingForPairOne {
    static int x=213;
    static void m() {
        System.out.println("Arun");
    }
    private int [] PaidCheckBruteForce(int [] arr,int n,int target){
        Arrays.sort(arr);
        m();
        int start=0 ,end=n-1;
        while(start<end)
        {
            if(target==(arr[start]+arr[end]))
                return new int[]{start+1, end+1};
            if((arr[start]+arr[end])<target)
                ++start;
            else  --end;
        }
        return new int [] {};
    }
    public static void main(String[] args) {
        int [] arr = new int [10];

        for (int i=0 ;i< arr.length; ++i)
            arr[i]=i+1;
        HashingForPairOne obj = new HashingForPairOne();
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(obj.PaidCheckBruteForce(arr, arr.length,14)));
    }
}
