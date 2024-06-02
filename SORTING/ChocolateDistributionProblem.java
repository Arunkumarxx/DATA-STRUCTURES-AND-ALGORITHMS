package SORTING;

import java.util.Arrays;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        int [] arr = {7,3,2,4,9,12,56};
        Arrays.sort(arr);
        int m=3;
        int left=0;
        int right=m-1;
        int min=Integer.MAX_VALUE;
        while(right< arr.length)
        {
            if(arr[right]-arr[left]<min)
                min=Math.min(arr[right]-arr[left],min);
            left++;
            right++;
        }
        System.out.println(min);
    }
}
