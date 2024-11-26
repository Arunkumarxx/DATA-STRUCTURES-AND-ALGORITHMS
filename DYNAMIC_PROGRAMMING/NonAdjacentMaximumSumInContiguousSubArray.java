package DYNAMIC_PROGRAMMING;

public class NonAdjacentMaximumSumInContiguousSubArray
{
    public long maximumSum(int arr[], int sizeOfArray)
    {
        arr[1] = Math.max(arr[0],arr[1]);
        for(int i = 2;i<sizeOfArray;++i)
            arr[i] = Math.max(ar[i],Math.max(arr[i-1],arr[i]+arr[i-2]));
        long max = arr[0];
        for(int i =0;i<sizeOfArray;++i)
            max = Math.max(max,arr[i]);
        return max;
    }
    public static void main(String[] args)
    {
        int [] arr = {4,5,6,7,8};
        NonAdjacentMaximumSumInContiguousSubArray obj =new NonAdjacentMaximumSumInContiguousSubArray();
        System.out.println(obj.maximumSum(arr, arr.length));
    }

}
