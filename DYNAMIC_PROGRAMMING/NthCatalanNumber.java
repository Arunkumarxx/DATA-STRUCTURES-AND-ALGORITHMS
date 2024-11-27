package DYNAMIC_PROGRAMMING;

public class NthCatalanNumber
{
    private int findCatalan(int n)
    {
        if(n==0 || n==1)
            return 1;

        long dp[]=new long[n+1],mod=(long)(1e9)+7;
        dp[0]=dp[1]=1;

        for(int i=2;i<=n;i++)ru
        {
            dp[i]=0;
            for(int j=0;j<i;j++)
            {
                dp[i] = (dp[i]+(dp[j]*dp[i-j-1])%mod)%mod;
            }
        }

        return (int)dp[n];
    }
    public static void main(String[] args)
    {
        NthCatalanNumber obj =new NthCatalanNumber();
        System.out.println(obj.findCatalan(5));
    }
}
