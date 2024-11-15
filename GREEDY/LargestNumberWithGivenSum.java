package GREEDY;

public class LargestNumberWithGivenSum
{
    private String largestNumber(int n, int sum)
    {
        if(sum>9*n)
            return "-1";
        StringBuilder result =new StringBuilder();

        
    }
    public static void main(String[] args)
    {
        LargestNumberWithGivenSum largestNumberWithGivenSum =new LargestNumberWithGivenSum();
        int n=5;
        int sum=12;
        System.out.println( largestNumberWithGivenSum.largestNumber(n,sum));
    }
}
