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
    public static void main(String[] args) {
        int [] arr ={0,0,0,1,1,4,4,2,2};
        System.out.println(brute(arr, arr.length));
    }
}