package HASHING;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={5,8,-4,-4,9,-2,2};
        int k=0;
        System.out.println(BruteForce(arr, arr.length,k));
        System.out.println(BruteForceOptimal(arr, arr.length,k));
        
    }
    private static int  BruteForce(int [] arr,int n,int target) {
        int res=0;
        for (int i=0; i<n; ++i)
        {
            for (int j=i; j<n; ++j)
            {
                int sum=0;
                int count=0;
                for (int k=i; k<=j; k++)
                {
                    sum+=arr[k];
                    ++count;
                    if(sum==target && count>res)
                        res=count;
                }
            }
        }
        return res;
    }
    private static int  BruteForceOptimal(int [] arr,int n,int target) {
        int res=0;
        for (int i=0; i<n; ++i)
        {
            int sum=0;
            int count=0;
            for (int j=i; j<n; ++j)
            {
                sum=sum+arr[j];
                ++count;
                if(sum==target && count>res)
                    res=count;
            }
        }
        return res;
    }
}
