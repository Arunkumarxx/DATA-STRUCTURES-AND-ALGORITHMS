package BACKTRACKING;

import java.util.*;

public class RatInMaze
{
    int n;
    int m;

    ArrayList<String> result=new ArrayList<String>();
    boolean[][] visited;

    int[] x={-1, 0, 1, 0};
    int[] y={0, -1, 0, 1};

    char[] directions={'U', 'L', 'D', 'R'};

    StringBuilder string=new StringBuilder();

    public ArrayList<String> findPath(int[][] mat)
    {
        this.n=mat.length;
        this.m=mat[0].length;
        this.visited=new boolean[n][m];
        if(mat[0][0]==1&&mat[n-1][m-1]==1)
            dfs(mat, 0, 0);
        return result;
    }

    public void dfs(int[][] mat, int row, int col)
    {
        if(row==n-1&&col==m-1)
        {
            result.add(string.toString());
            return;
        }
        visited[row][col]=true;

        for(int i=0;i<4;++i)
        {
            int newRow=row+x[i];
            int newCol=col+y[i];
            if(isValid(newRow, newCol, mat))
            {
                string.append(directions[i]);
                dfs(mat, newRow, newCol);
                string.deleteCharAt(string.length()-1);
            }
        }
        visited[row][col]=false;
    }

    public boolean isValid(int row, int col, int[][] mat)
    {
        return row>=0&&col>=0&&row<n&&col<m&&!visited[row][col]&&mat[row][col]==1;
    }

    public static void main(String[] args)
    {
        RatInMaze obj=new RatInMaze();
        int[][] maze1={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {1, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<String> paths1=obj.findPath(maze1);
        System.out.println("Paths found for maze1: "+paths1);

        int[][] maze2={
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {0, 1, 1, 1}
        };
        ArrayList<String> paths2=obj.findPath(maze2);
        System.out.println("Paths found for maze2: "+paths2);
    }
}
