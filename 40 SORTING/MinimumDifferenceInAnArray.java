package SORTING;

import java.util.Arrays;

public class MinimumDifferenceInAnArray {
    public static void main(String[] args) {
        int arr[] ={2,4,5,9,7};
        Arrays.sort(arr);
        int n= arr.length;
        int Min=Integer.MAX_VALUE;
        for(int i=1; i<n; i++)
        {
            if(arr[i]-arr[i-1]<Min)
                Min=Math.min(arr[i]-arr[i-1],Min);
        }
        System.out.println(Min);
    }
}
