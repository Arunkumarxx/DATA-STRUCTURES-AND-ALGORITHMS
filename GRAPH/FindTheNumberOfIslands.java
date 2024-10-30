package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheNumberOfIslands
{
    private int numIsIslands(char [][] grid,int n,int m)
    {
        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        int rowSize=n;
        int colsSize=m;
        int res=0;
        Queue<int []> queue =new LinkedList<>();
        for(int row=0;row<rowSize;++row)
        {
            for(int col=0;col<colsSize;++col)
            {
                if(grid[row][col]=='1')
                {
                    ++res;

                }
            }
        }

        return res;
    }
    private boolean isValid(int x,int y,int n,int m)
    {
        return  x>=0 && x<n && y>=0 && y<=m?true:false;
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
        System.out.println(findTheNumberOfIslands.numIsIslands(grid,grid.length,grid[0].length));
    }
}
