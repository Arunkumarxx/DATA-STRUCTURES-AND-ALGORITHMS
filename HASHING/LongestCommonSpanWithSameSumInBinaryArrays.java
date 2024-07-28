package HASHING;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestCommonSpanWithSameSumInBinaryArrays {
    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 0, 0, 0};
        int n= arr.length;
        System.out.println(Optimal(arr,n));
    }
    private static int Optimal (int [] arr,int n) {
        int res=0;
        HashMap<Integer,Integer> hashMap =new HashMap<>();
        int sum=0;
        hashMap.put(0,-1);
        ArrayList<Integer> listOne =new ArrayList<>();
        ArrayList<Integer> listTwo= new ArrayList<>();
        for (int i=0; i<n; ++i)
        {
            sum+=arr[i];
            if(hashMap.containsKey(sum))
            {
                listOne.add(i-hashMap.get(sum));
            }
            if(!hashMap.containsKey(sum))
                hashMap.put(sum,i);
        }
        System.out.println(listOne);
        return res;
    }

}
