package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges
{
    private int orangesRotting(int [][] grid)
    {
        int rowSize=grid.length;
        int colSize=grid[0].length;
        Queue<int [] > queue =new LinkedList<>();

        boolean[][] visited =new boolean[rowSize][colSize];
        int [][] result =new int[rowSize][colSize];
        int freshOrangeCount=0;
        for(int row=0;row<rowSize;++row)
        {
            for(int col=0;col<colSize;++col)
            {
                if(grid[row][col]==2)
                {
                    visited[row][col] = true;
                    queue.add(new int[]{row,col, 0});
                }
                else if(grid[row][col]==1)
                    ++freshOrangeCount;
            }
        }
        if(freshOrangeCount==0)return 0;
        int res =-1;
        while(!queue.isEmpty())
        {
            int [] curr=queue.poll();
            int row=curr[0], col=curr[1],time=curr[2];

            res=Math.max(res,time);
            result[row][col]=time;
            // check for left
            if(col>0 && !visited[row][col-1] && grid[row][col-1]!=0)
            {
                visited[row][col-1]=true;
                queue.add(new int []{row,col-1,time+1});
                --freshOrangeCount;
            }
            //check for right
            if(col<colSize-1 && !visited[row][col+1] && grid[row][col+1]!=0)
            {
                visited[row][col+1]=true;
                queue.add(new int []{row,col+1,time+1});
                --freshOrangeCount;
            }
            //check for down
            if(row<rowSize-1 && !visited[row+1][col] && grid[row+1][col]!=0)
            {
                visited[row+1][col]=true;
                queue.add(new int []{row+1,col,time+1});
                --freshOrangeCount;
            }
            //check for up
            if(row>0 && !visited[row-1][col] && grid[row-1][col]!=0)
            {
                visited[row-1][col]=true;
                queue.add(new int []{row-1,col,time+1});
                --freshOrangeCount;
            }
        }
        return freshOrangeCount==0?res:-1;
    }
    public static void main(String[] args)
    {
        RottenOranges rottenOranges =new RottenOranges();
        int [][] matrix  =
                {
                        {2,2,2},
                        {0,2,0}
                };
        System.out.println( rottenOranges.orangesRotting(matrix));
    }

}
