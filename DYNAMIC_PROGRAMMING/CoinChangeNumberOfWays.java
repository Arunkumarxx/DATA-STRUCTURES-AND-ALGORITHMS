package DYNAMIC_PROGRAMMING;

import java.util.Arrays;

public class CoinChangeNumberOfWays
{
    private long numberOfWays(int[] coins, int n, int target) {
    long[][] dp = new long[n][target + 1];
    for (long[] row : dp)
        Arrays.fill(row, -1);
    return countPossibleWays(coins, n, target, 0, dp);

    
}

    private long countPossibleWays(int[] coins, int n, int target, int ind, long[][] dp)
    {
        if (target == 0)
            return 1;
        if (ind >= n || target < 0)
            return 0;
        if (dp[ind][target] != -1)
            return dp[ind][target];
        long include = countPossibleWays(coins, n, target - coins[ind], ind, dp);
        long exclude = countPossibleWays(coins, n, target, ind + 1, dp);
        dp[ind][target] = include + exclude;
        return dp[ind][target];
    }
    public static void main(String[] args)
    {
        int [] coins = {1,2,3};
        int target=4;
        CoinChangeNumberOfWays obj =new CoinChangeNumberOfWays();
        System.out.println(obj.numberOfWays(coins, coins.length,target));
    }

}
