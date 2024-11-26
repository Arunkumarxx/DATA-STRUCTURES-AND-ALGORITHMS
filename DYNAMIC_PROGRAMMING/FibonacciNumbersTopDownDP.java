package DYNAMIC_PROGRAMMING;

public class FibonacciNumbersTopDownDP
{
    public long findNthFibonacci(int n, long dp[])
    {
        if(n==0||n==1)
            return 1;

        if(dp[n]!=0)
            return dp[n];

        else
            dp[n]=findNthFibonacci(n-1, dp)+findNthFibonacci(n-2, dp);
        return dp[n];
    }

    public static void main(String[] args)
    {
        FibonacciNumbersTopDownDP obj=new FibonacciNumbersTopDownDP();
        int n=10;
        long[] dp=new long[n+1];
        System.out.println("The "+n+"th Fibonacci number is: "+obj.findNthFibonacci(n, dp));
    }
}
