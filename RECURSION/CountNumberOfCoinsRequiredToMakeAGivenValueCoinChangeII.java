package RECURSION;

class CountNumberOfCoinsRequiredToMakeAGivenValueCoinChangeII {
    static int occurence = 0;

    static void CoinChange(int[] coins, int n, int sum, int tempCount) {
        if (n == 0)
            return;
        CoinChange(coins, n - 1, sum, tempCount);
        System.out.println();

        while (n >= 0 && tempCount < sum) {
            if (coins[n] == sum) {
                occurence += 1;
            }
            if (coins[n] != sum) {
                tempCount += coins[n];
            }
            if (tempCount == sum)
                occurence += 1;
        }
        System.out.println(occurence);
    }

    public static void main(String[] args) {
        int sum = 4;
        int[] coins = {1, 2, 3};
        CoinChange(coins, coins.length - 1, sum, 0);
        System.out.println("wel");
    }
}

/*
Given an integer array of coins[ ] of size N representing
different types of denominations and an integer sum, the task is to count the number
of coins required to make a given value sum.

Note: Assume that you have an infinite supply of each type of coin.

Examples:

Input: sum = 4, coins[] = {1,2,3},
Output: 4
Explanation: there are four solutions: {1, 1, 1, 1}, {1, 1, 2}, {2, 2}, {1, 3}.
 */
