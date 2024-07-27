package HASHING;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={15,2,8,10,-5,-8,6};
        int n= arr.length;
        int i=0 ,j=0;
        int target=33;
        int sum=0;
        while(i<=j && j<n)
        {
            if(sum==target)
            {
                System.out.println(i+" "+j);
                return;
            }
            if(sum<target)
            {
                sum+=arr[j];
                ++j;
            }
            else
            {
                sum-=arr[i];
                ++i;
            }
        }
        System.out.println(sum);
    }

}
