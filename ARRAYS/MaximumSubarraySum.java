package ARRAYS;
public class MaximumSubarraySum {
    static void MaximumSubArray(int [] num) {
        int sum=num[0];
        int MaximumOfSum=num[0];
        int n=num.length;
        for (int i=1; i<n; i++)
        {
            if (sum>=0)
                sum+=num[i];
            else sum=num[i];
            if (sum>MaximumOfSum)
                MaximumOfSum=sum;
        }
        System.out.println(MaximumOfSum);
    }
    public static void main(String[] args) {
        int [] nums ={5,4,-1,7,8};
        MaximumSubArray(nums);
    }
}