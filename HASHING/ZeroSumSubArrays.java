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
        for(int i=0; i<n; ++i)
        {
            sum+=arr[i];
            
        }
    }
}
