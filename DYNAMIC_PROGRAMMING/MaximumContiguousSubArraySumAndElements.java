package DYNAMIC_PROGRAMMING;

public class MaximumContiguousSubArraySumAndElements
{
    public long maximumSum(int arr[], int n)
    {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;
        StringBuilder str=new StringBuilder();
        for(int i=0;i<n;++i)
        {
            if(currSum<0)
                currSum=0;

            currSum+=arr[i];

            if(currSum>maxSum)
                maxSum=currSum;

            str.append(currSum).append(" ");
        }

        System.out.println(str.toString());
        return (long)maxSum;
    }

    public static void main(String[] args)
    {
        MaximumContiguousSubArraySumAndElements obj=new MaximumContiguousSubArraySumAndElements();
        int arr[]={-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int n=arr.length;
        System.out.println("Maximum contiguous subarray sum: "+obj.maximumSum(arr, n));
    }
}
