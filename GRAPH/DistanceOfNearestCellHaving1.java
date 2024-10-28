package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCellHaving1
{
    private int [][] nearest(int [][] grid)
    {
        Queue<int []> queue =new LinkedList<>();
        for(int row=0;row<grid.length;++row)
        {
            for(int cols=0;cols<grid[row].length;++cols)
            {
                if(grid[row][cols]==1)
                {
                    queue.add(new int[] {row,cols,0});
                }
            }
        }
        while(!queue.isEmpty())
        {
            
        }
    }
    public static void main(String[] args)
    {
        DistanceOfNearestCellHaving1 obj =new DistanceOfNearestCellHaving1();
        int [][] grid = {
                {0,1,1,0},
                {1,1,0,0},
                {0,0,1,1}
        };
        obj.nearest(grid);
    }
}
