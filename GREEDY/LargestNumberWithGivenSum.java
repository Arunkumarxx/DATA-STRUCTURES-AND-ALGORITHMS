package GREEDY;

public class LargestNumberWithGivenSum
{
    private String largestNumber(int n, int sum)
    {
        StringBuilder result =new StringBuilder();
        while(sum>0 && n>1)
        {
            if(sum>=9)
            {
                result.append(9);
                sum-=9;
                --n;
            }
            else
            {
                result.append(sum);
                while(n>0)
                {
                    result.append(0);
                    --n;
                }
            }
        }
        return result.toString();
    }
    public static void main(String[] args)
    {
        LargestNumberWithGivenSum largestNumberWithGivenSum =new LargestNumberWithGivenSum();
        int n=5;
        int sum=12;
        System.out.println( largestNumberWithGivenSum.largestNumber(n,sum));
    }
}
