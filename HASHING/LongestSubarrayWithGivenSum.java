package HASHING;

public class LongestSubarrayWithGivenSum {
    public static void main(String[] args) {
        int [] arr ={5,8,-4,-4,9,-2,2};
        int k=0;
        System.out.println(SubArrayWithGivenSumBruteForce(arr, arr.length,k));
    }
    private static int  SubArrayWithGivenSumBruteForce(int [] arr,int n,int target) {
        for (int i=0; i<n; ++i)
        {
            int sum=0;
            for (int j=i; j<n; ++j)
            {
                for (int k=i; k<=j; k++)
                {
                    System.out.print(arr[k]+",");
                }
                System.out.println();
            }

        }
        return 0;
    }
}
