package GREEDY;

public class LargestNumberWithGivenSum
{
    private String largestNumber(int n, int sum)
    {
        StringBuilder result =new StringBuilder();
        int targetSum=0;
        while(sum>0 && n>0)
        {
            if(sum>=9)
            {
                result.append(9);
                targetSum+=9;
                sum-=9;
                --n;
            }
            else
            {
                result.append(sum);
                targetSum+=sum;
                while(n>0)
                {
                    result.append(0);
                    --n;
                }
            }
        }
        if(targetSum!=sum)
            return "-1";
        return result.toString();
    }
    public static void main(String[] args)
    {
        LargestNumberWithGivenSum largestNumberWithGivenSum =new LargestNumberWithGivenSum();
        int n=3;
        int sum=29;
        System.out.println( largestNumberWithGivenSum.largestNumber(n,sum));
    }
}
