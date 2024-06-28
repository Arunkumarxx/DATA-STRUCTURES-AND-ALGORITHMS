package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithGivenSum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        ArrayList<Integer> arrayList = new ArrayList();
        int left=0;
        int right=0;
        int sum=0;
        while(right<n)
        {

            sum+=arr[right];

            while (sum>s && left<=right)
            {
                sum-=arr[left];
                left++;
            }
            if(sum==s&& left<=right)
            {
                arrayList.add(left+1);
                arrayList.add(right+1);
                return arrayList;
            }
            right++;
        }
        arrayList.add(-1);
        return arrayList;

    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4,5,6,7,8,9,10};
        int n= arr.length;;
        int s=15;
     for(int x:   subarraySum(arr,n,s)){
         System.out.print(x+" ");
     }
    }
}
