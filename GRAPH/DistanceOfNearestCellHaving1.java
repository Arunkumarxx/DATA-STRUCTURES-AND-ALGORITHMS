package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCellHaving1
{
    private int [][] nearest(int [][] grid)
    {
        Queue<int []> queue =new LinkedList<>();
        boolean [][] visited = new boolean[grid.length][grid[0].length];
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
            int [] cell= queue.poll();
            int row=cell[0], col= cell[1] ,steps=cell[2];


            // check for left
            if(col>0)
            {

            }
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
