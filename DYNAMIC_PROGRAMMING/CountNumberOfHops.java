package DYNAMIC_PROGRAMMING;

public class CountNumberOfHops
{
    private int possibleWays(int target,int curr)
    {
        if (curr == target)
            return 1;
        if (curr > target)
            return 0;
        return  possibleWays(target, curr + 1) +
                possibleWays(target, curr + 2) +
                possibleWays(target, curr + 3);

    }
    private int countWays(int n)
    {
        if (n == 0 || n==1 ) return 1;
        if (n == 2) return 2;
        int  [] dp =new int [n+1];
        dp[0]=1;
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;++i)
            dp[i]=dp[i-3]+dp[i-2]+dp[i-1];
        return dp[n];
    }
    public static void main(String[] args)
    {
        CountNumberOfHops obj = new CountNumberOfHops();
        System.out.println(obj.countWays(5));
        System.out.println(obj.possibleWays(5,0));
        System.out.println();
    }
}
