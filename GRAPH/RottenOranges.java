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

        for(int row=0;row<rowSize;++row)
        {
            for(int col=0;col<colSize;++col)
            {
                if(grid[row][col]==2)
                {
                    visited[row][col] = true;
                    queue.add(new int[]{row,col, 0});
                }
            }
        }

        while(!queue.isEmpty())
        {
            int [] curr=queue.poll();
            int row=curr[0], col=curr[1],time=curr[2];

            // check for left
        }
    }
    public static void main(String[] args)
    {
        RottenOranges rottenOranges =new RottenOranges();
        int [][] matrix  =
                {
                        {0,1,2},
                        {0,1,2},
                        {2,1,1}
                };
        rottenOranges.orangesRotting(matrix);
    }

}
