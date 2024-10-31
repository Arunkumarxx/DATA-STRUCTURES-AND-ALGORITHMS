package GRAPH;

import GREEDY.GREEDY;

import java.util.LinkedList;
import java.util.Queue;

public class TotalGraphXShapes
{
    private int xShape(char [][] grid)
    {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
        int []  x ={};
        int []  y ={};
        for(int row=0;row<n;++row)
        {
            for(int col=0;col<m;++col)
            {
                if(grid[row][col]=='X')
                {
                    ++count;
                    Queue<int []> queue =new LinkedList<>();
                    queue.add(new int[]{row,col});
                    grid[row][col]='O';
                    while(!queue.isEmpty())
                    {
                        int [] curr =queue.poll();
                        int currX=curr[0];
                        int currY=curr[1];
                    }
                }
            }
        }
    }
    private boolean isValid(int )
    {

    }
    public static void main(String[] args)
    {
        char [][] grid ={
                {'X','O','X'},
                {'O','X','O'},
                {'X','X','X'}
        };
        TotalGraphXShapes totalGraphXShapes =new TotalGraphXShapes();
        System.out.println(totalGraphXShapes.xShape(grid));
    }

}
