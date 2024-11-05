package GRAPH;

public class MinimumCostPath
{
    public int minimumCostPath(int[][] grid)
    {
        System.gc();
        int n = grid.length;
        int m = grid[0].length;
        int[][] dp = new int[n][m];
        dp[0][0]=grid[0][0];
        for (int j=1; j <m; j++)
            dp[0][j]=dp[0][j - 1]+grid[0][j];

        for (int i=1; i < n; i++)
            dp[i][0]=dp[i - 1][0]+grid[i][0];

        for (int i=1; i<n; i++)
            for (int j=1; j<m; j++)
                dp[i][j] = grid[i][j] + Math.min(dp[i-1][j], dp[i][j-1]);
        return dp[n - 1][m - 1];
    }
    public static void main(String[] args)
    {
        int[][] grid =
                {
                        {9,4,9,9},
                        {6,7,6,4},
                        {8,3,3,7},
                        {7,4,9,10}
                };
        MinimumCostPath minimumCostPath =new MinimumCostPath();
       int res= minimumCostPath.minimumCostPath(grid);
        System.out.println("Answer :"+res);
    }
}
