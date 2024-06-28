package ARRAYS;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumSumSubArrayOfSizeK {
    static void MaxiMumSumSubArrKNaiveApproach() {
        int curSum=0;
        int maxSum=Integer.MIN_VALUE;
        int arr[] = {2, 1, 5, 1, 3, 2};
        int n=arr.length;
        int k=3;
        int j=0;
        for (int i=0; i<=n-k;)
        {
            curSum+=arr[(i)+j++];
            maxSum=Math.max(curSum,maxSum);
            if(j==k) {
                i++;
                j=0;
                curSum=0;
            }
        }
        if(k>n)
            System.out.println("Invalid");
        else System.out.println(maxSum);
    }
    static int MaxiMumSumArraySizeOfK(int[] Arr,int N,int K) {
        int cSum=0;
        int mSum=Integer.MIN_VALUE;
        for(int i=0; i<K; i++)
        {
            cSum+=Arr[i];
        }
        mSum=Math.max(cSum,mSum);
        for (int j=K; j<N; j++)
        {
            cSum=cSum-Arr[j-K]+Arr[j];
            mSum=Math.max(cSum,mSum);
        }

        System.out.println(mSum);
        return -1;

    }
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        long cSum=0;
        long mSum=Integer.MIN_VALUE;
        for(int i=0; i<K; i++)
        {
            cSum+=Arr.get(i);
        }
        mSum= Math.max(cSum,mSum);
        for(int i=K; i<N; i++)
        {

            cSum=cSum-Arr.get(i-K)+Arr.get(i);
            mSum= Math.max(cSum,mSum);
        }
        System.out.println(mSum);
        return -1;

    }
    public static void main(String[] args) {
        int [] arr ={100 ,200, 300 ,400};
        int n= arr.length;
        MaxiMumSumArraySizeOfK(arr,n,4);
        ArrayList<Integer> integerArrayList =new ArrayList<>();
        integerArrayList.add(100);
        integerArrayList.add(200);
        integerArrayList.add(300);
        integerArrayList.add(400);
        maximumSumSubarray(4,integerArrayList,integerArrayList.size());
    }
}
