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
            hashSet.add(arr[i]);
            hashSet.add(arr[j]);
            ++i;
            --j;
        }
        if(i==j) hashSet.add(arr[i]);
        System.out.println(hashSet);
        int longest=1;
        int count=1;
        for (int k=0; k<n-1; ++k)
        {
            if(arr[k]==arr[k+1])
                continue;
            if(hashSet.contains(arr[k]+1))
            {
                ++count;
                if(count>longest)
                    longest=count;
            }
            else count=1;
        }
        return longest;
    }
    public static void main(String[] args) {
        int [] arr ={1,2,3};
//        System.out.println(brute(arr, arr.length));
        System.out.println(optimal(arr, arr.length));
    }
}