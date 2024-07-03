package SORTING;

public class CloserToSort {
    static long CloserSort(int [] arr,int n,int x) {
        int l=0;
        int r=n-1;

        while(l<=r)
        {
            int mid=(l+r)/2;
            if(arr[mid]==x)
                return (long)mid;

            if(mid > 0 && arr[mid-1]==x)
                return (long)mid-1;

            if(mid <n-1 && arr[mid+1]==x)
                return (long)mid+1;

            if(arr[mid]<x)
                l=mid+1;
            else r=mid-1;

        }
        return (long)-1;
    }
    public static void main(String[] args) {
        int [] arr ={3,2,10,4,40};
        int n= arr.length;
        System.out.println(CloserSort(arr,n,2));
    }
}
