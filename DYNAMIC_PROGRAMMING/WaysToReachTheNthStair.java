package DYNAMIC_PROGRAMMING;

public class WaysToReachTheNthStair
{
    int countWays(int n)
    {
        int [] dp =new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;++i)
            dp[i]=dp[i-2]+dp[i-1];
        return dp[n];
    }
    public static void main(String[] args)
    {
        WaysToReachTheNthStair obj =new WaysToReachTheNthStair();
        System.out.println(obj.countWays(5));
    }

}
