package BACKTRACKING;

import java.util.*;

public class RatInMaze
{
    public int[][] ShortestDistance(int[][] matrix)
    {
        int n=matrix.length;
        int[][] sol=new int[n][n];
        helper(0, 0, matrix, sol);
        if(sol[n-1][n-1]==0)
        {
            int[][] ans=new int[1][1];
            ans[0][0]=-1;
            return ans;
        }
        return sol;
    }

    boolean isSafe(int row, int col, int[][] matrix)
    {
        int n=matrix.length;
        return (row>=0&&row<n&&col>=0&&col<n&&matrix[row][col]!=0);
    }

    boolean helper(int row, int col, int[][] matrix, int[][] sol)
    {
        int n=matrix.length;
        if(row==n-1&&col==n-1)
        {
            sol[row][col]=1;
            return true;
        }
        if(isSafe(row, col, matrix))
        {
            sol[row][col]=1;
            for(int step=1;step<=matrix[row][col]&&step<n;++step)
            {
                if(helper(row, col+step, matrix, sol))
                    return true;
                if(helper(row+step, col, matrix, sol))
                    return true;
            }
            sol[row][col]=0;
            return false;
        }
        return false;
    }
    public static void main(String[] args)
    {
        RatInMaze obj=new RatInMaze();
        int[][] matrix={
                {2, 1, 0, 0},
                {3, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 1}
        };
        int[][] result=obj.ShortestDistance(matrix);

        for(int[] row:result)
            System.out.println(Arrays.toString(row));


        int[][] matrix2={
                {2, 1, 0, 0},
                {2, 0, 0, 1},
                {0, 1, 0, 1},
                {0, 0, 0, 1}
        };
        int[][] result2=obj.ShortestDistance(matrix2);
        for(int[] row:result2)
            System.out.println(Arrays.toString(row));

    }
}
