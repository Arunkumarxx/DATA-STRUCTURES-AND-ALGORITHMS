package DYNAMIC_PROGRAMMING;

public class CoinChangeMinimumNumberOfCoins
{
    private long minimumNumberOfCoins(int coins[], int numberOfCoins, int value)
    {
        int[] dp = new int[value + 1];

        for (int i = 0; i <= value; i++)
            dp[i] = Integer.MAX_VALUE;

        dp[0] = 0;

        for (int i = 1; i <= value; i++)
            for (int coin : coins)
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);

        return dp[value] == Integer.MAX_VALUE ? -1 : dp[value];
    }
    public static void main(String[] args)
    {
        int [] arr ={2,5,3,6};
        CoinChangeMinimumNumberOfCoins obj =new CoinChangeMinimumNumberOfCoins();
        System.out.println(obj.minimumNumberOfCoins(arr,arr.length,10));
    }
}
