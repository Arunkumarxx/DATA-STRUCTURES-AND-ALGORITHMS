package SORTING;

import java.util.Arrays;

public class SortingBinaryArrays {
    public static void main(String[] args) {
        int [] arr ={0,1,0,1,1};
        int left=0;
        int right= arr.length-1;
        while(left<right)
        {
            while(left<right && arr[left]==0)
                left++;
            while(left<right && arr[right]==1)
                right--;
            if(left<right)
            {
                int x=arr[left];
                arr[left]=arr[right];
                arr[right]=x;
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
