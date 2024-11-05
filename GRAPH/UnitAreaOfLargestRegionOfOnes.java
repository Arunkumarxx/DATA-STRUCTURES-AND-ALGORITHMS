package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class UnitAreaOfLargestRegionOfOnes
{
    private int  findMaxAreaOfOnes(int[][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;

        int [] x ={-1, 0, 1,-1,1,1,0,-1};
        int [] y ={-1,-1,-1, 0, 0, 1, 1, 1};
        int maxAreaOfOnes=0;
        boolean[][] visited =new boolean[n][m];
        for(int row=0;row<n;++row)
        {
            for(int col=0;col<m;++col)
            {
                if(!visited[row][col] && grid[row][col]==1)
                {
                    int currMaxArea=0;
                    Queue<int[]> queue =new LinkedList<>();
                    queue.add(new int[]{row,col});
                    while(!queue.isEmpty())
                    {
                        int [] curr=queue.poll();
                        int currR=curr[0];
                        int currC=curr[1];
                        visited[currR][currC]=true;
                        ++currMaxArea;
                        for(int i=0;i<8;++i)
                        {
                            int newCurrR=currR+x[i];
                            int newCurrC=currC+y[i];
                            if(isValid(newCurrR,newCurrC,n,m) && !visited[newCurrR][newCurrC] && grid[newCurrR][newCurrC]==1)
                            {
                                queue.add(new int []{newCurrR,newCurrC});
                            }
                        }
                    }
                    maxAreaOfOnes=Math.max(currMaxArea,maxAreaOfOnes);
                }
            }
        }
        return maxAreaOfOnes;
    }
    private boolean isValid(int x,int y,int n,int m)
    {
        return x>=0 && y>=0 && x<n && y<m?true:false;
    }
    public static void main(String[] args)
    {
        int [] [] grid ={
                {1,1,1,0},
                {0,0,1,0},
                {0,0,0,1},
        };
        UnitAreaOfLargestRegionOfOnes unitAreaOfLargestRegionOfOnes =new UnitAreaOfLargestRegionOfOnes();
        System.out.println(unitAreaOfLargestRegionOfOnes.findMaxAreaOfOnes(grid));
    }
}
