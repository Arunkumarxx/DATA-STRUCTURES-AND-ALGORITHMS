package GRAPH;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCellHaving1
{
    private int [][] nearest(int [][] grid)
    {
        Queue<int []> queue =new LinkedList<>();
        int rowSize=grid.length;
        int colsSize=grid[0].length;
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        int [][] result =new int [grid.length][grid[0].length];
        for(int row=0;row<grid.length;++row)
        {
            for(int cols=0;cols<grid[row].length;++cols)
            {
                if(grid[row][cols]==1)
                {
                    queue.add(new int[] {row,cols,0});
                    visited[row][cols]=true;
                }
            }
        }
        while(!queue.isEmpty())
        {
            int [] cell= queue.poll();
            int row=cell[0], col= cell[1] ,steps=cell[2];

            // check for left
            if(col>0 && !visited[row][col-1] )
            {
                result[row][col-1]=result[row][col]+1;
                visited[row][col-1]=true;
                queue.add(new int [] {row,col-1,result[row][col-1]});
            }
            // check for right
            if(col<colsSize-1 && !visited[row][col+1])
            {
                result[row][col+1]=result[row][col]+1;
                visited[row][col-1]=true;
                queue.add(new int [] { row,col+1,result[row][col+1]});
            }
            // check for down
            if(row<rowSize-1 && !visited[row+1][col])
            {
                result[row+1][col]=result[row][col]+1;
                visited[row+1][col]=true;
                queue.add(new int [] {row+1,col,result[row+1][col]});
            }
            // check for up
            if(row>0 && !visited[row][col])
            {
                result[row-1][col]=result[row][col]+1;
                visited[row-1][col]=true;
                queue.add(new int [] {row-1,col,result[row-1][col]});
            }
        }
        return result;
    }
    public static void main(String[] args)
    {
        DistanceOfNearestCellHaving1 obj =new DistanceOfNearestCellHaving1();
        int [][] grid = {
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1}
        };
         int [][] res = obj.nearest(grid);
        System.out.println(Arrays.toString(res));
    }
}