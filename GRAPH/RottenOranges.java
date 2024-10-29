package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class RottenOranges
{
    private int orangesRotting(int [][] grid)
    {
        int row=grid.length;
        int col=grid[0].length;
        int rowSize=grid.length;
        int colSize=grid[0].length;
        Queue<int [] > queue =new LinkedList<>();
        boolean[][] visited =new boolean[rowSize][colSize];
        for(int i=0;i<rowSize;++i)
        {
            for(int j=0;j<colSize;++j)
            {
                if(grid[i][j]==2)
                {
                    visited[i][j] = true;
                    queue.add(new int[]{row,col, 0});
                }
            }
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
