package SORTING;

import java.util.ArrayList;

public class countInversion {
    static int count=0;

    static void mergeSort(long [] arr,int low,int mid, int high) {
        int left=low,right=mid+1;
        ArrayList<Long> list =new ArrayList<Long> ();
        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right]){
                list.add(arr[left++]);
            }
            else {
                list.add(arr[right++]);
                count+=mid-left+1;
            }
        }
        while(left<=mid)
        {
            list.add(arr[left++]);
        }
        while(right<=high)
        {
            list.add(arr[right++]);
        }
        for(int i=low;i<=high; i++)
        {
            arr[i]=(long)list.get(i-low);
        }
    }
    static void merge(long [] arr,int low,int high) {
        if(low<high) {
            int mid = (low + high) / 2;
            merge(arr, low, mid);
            merge(arr, mid + 1, high);
            mergeSort(arr, low, mid, high);
        }
    }
    static long inversionCount(long arr[], long N)
    {
        // Your Code Here
        merge(arr,0,(int)N-1);
        for(long x:arr)System.out.print(x+" ");
        return -1;
    }

    public static void main(String[] args) {
        long [] arr = {2, 4, 1, 3, 5};
        inversionCount(arr, arr.length-1);
    }
}
