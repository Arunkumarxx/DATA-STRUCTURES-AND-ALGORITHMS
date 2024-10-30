package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheNumberOfIslands
{
    private int numIsIslands(char [][] grid,int n,int m)
    {
        int rowSize=n;
        int colsSize=m;
        Queue<int []> queue =new LinkedList<>();
        for(int row=0;row<rowSize;++row)
        {
            for(int col=0;col<colsSize;++col)
            {
                if(grid[row][col]==1)
                {
                    queue.add(new int[]{row, col});
                }
            }
        }
        int [] dx ={-1,-1,-1,     0,0,0   ,1,1,1 };
        int [] dy ={-1, 0, 1,    -1,0,1   ,-1,0,1};
        while(!queue.isEmpty())
        {
            int [] curr =queue.poll();
            int currX=curr[0];
            int currY=curr[1];
            int count=0;
            if(grid[currX][currY]=='1')
            {
                for (int i = 0; i < 8; ++i)
                {
                    if (isValid(currX - dx[i], currY - dy[i], n, m))
                    {
                        queue.add(new int[]{currX - dx[i], currY - dx[i], n, m});
                        grid[currX][currY] = '0';
                    } else ++count;
                }
            }
        }
    }
    private boolean isValid(int x,int y,int n,int m)
    {
        return  x>=0 && x<=n-1 && y>=0 && y<=m-1?true:false;
    }
    public static void main(String[] args)
    {
        char [][] grid ={
                {'0','1','1','0'},
                {'0','1','1','0'},
                {'0','0','1','0'},
                {'0','0','0','0'},
                {'1','1','0','1'},
        };
        FindTheNumberOfIslands findTheNumberOfIslands =new FindTheNumberOfIslands();
        System.out.println(findTheNumberOfIslands.numIsIslands(grid));
    }
}
