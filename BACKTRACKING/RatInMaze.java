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

    boolean isSafe(int x, int y, int[][] matrix)
    {
        int n=matrix.length;
        return (x>=0&&x<n&&y>=0&&y<n&&matrix[x][y]!=0);
    }

    boolean helper(int x, int y, int[][] matrix, int[][] sol)
    {
        int n=matrix.length;

        if(x==n-1&&y==n-1)
        {
            sol[x][y]=1;
            return true;
        }

        if(isSafe(x, y, matrix))
        {
            sol[x][y]=1;

            for(int step=1;step<=matrix[x][y]&&step<n;++step)
            {
                if(helper(x, y+step, matrix, sol))
                    return true;

                if(helper(x+step, y, matrix, sol))
                    return true;
            }

            sol[x][y]=0;
            return false;
        }

        return false;
    }

    public static void main(String[] args)
    {
        RatInMaze obj=new RatInMaze();
        int[][] mat={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<String> paths=obj.findPath(mat);
        System.out.println("Paths found: "+paths);
    }
}
