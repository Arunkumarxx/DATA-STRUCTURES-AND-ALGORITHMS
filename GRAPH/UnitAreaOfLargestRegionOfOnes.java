package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class UnitAreaOfLargestRegionOfOnes
{
    private void findMaxAreaOfOnes(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;

        int [] x ={-1, 0, 1,-1,1,1,0,-1};
        int [] y ={-1,-1,-1, 0, 0, 1, 1, 1};

        boolean[][] visited =new boolean[n][m];
        for(int row=0;row<n;++row)
        {
            for(int col=0;col<m;++col)
            {
                if(!visited[row][col] && grid[row][col]==1)
                {
                    Queue<int[]> queue =new LinkedList<>();
                    queue.add(new int[]{row,col});
                    while(!queue.isEmpty())
                    {
                        int [] curr=queue.poll();
                        int currX=curr[0];
                        int currY=curr[1];
                    }
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int [] [] grid ={
                {1,1,1,0},
                {0,0,1,0},
                {0,0,0,1},
        };
        UnitAreaOfLargestRegionOfOnes unitAreaOfLargestRegionOfOnes =new UnitAreaOfLargestRegionOfOnes();
        unitAreaOfLargestRegionOfOnes.findMaxAreaOfOnes(grid);
    }
}
