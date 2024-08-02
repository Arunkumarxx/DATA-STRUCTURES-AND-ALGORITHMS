package HASHING;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSubsequence {
    public static void main(String[] args) {
        int [] arr ={1,9,3,10,4,20,2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int longest=1;
        int n= arr.length;
        int count=1;
        for (int i=1; i<n; ++i)
        {
            if(arr[i]-arr[i-1]==1)
                count++;
            if(count>longest)
                longest=Math.max(longest,count);
        }
        System.out.println(longest);
    }
}