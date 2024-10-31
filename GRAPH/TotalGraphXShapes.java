package GRAPH;

import GREEDY.GREEDY;

public class TotalGraphXShapes
{
    private int xShape(char [][] grid)
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
