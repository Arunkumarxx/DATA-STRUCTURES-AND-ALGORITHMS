package HASHING;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    private  static int  brute(int [] arr,int n) {
        Arrays.sort(arr);
        int longest=1;
        int count=1;
        for (int i=1; i<n; ++i)
        {
            if(arr[i]==arr[i-1])
                continue;
            if(arr[i]-arr[i-1]==1 ) {
                ++count;
                if(count>longest)
                    longest=count;
            }
            else count=1;

        }
        return longest;
    }

    private static int optimal (int [] arr,int n) {
        HashSet<Integer> hashSet =new HashSet<>();
        int i=0,j=n-1;
        while(i<j)
        {
            hashSet.add(i);
            hashSet.add(j);
            ++i;
            --j;
        }
        if(i==j) hashSet.add(i);
        System.out.println(hashSet);
        for (int k=0; k<n; ++k)
        {

        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={0,0,0,1,1,4,4,2,2};
//        System.out.println(brute(arr, arr.length));
        System.out.println(optimal(arr, arr.length));
    }
}