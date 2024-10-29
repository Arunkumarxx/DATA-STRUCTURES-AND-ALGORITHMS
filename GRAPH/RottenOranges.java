package GRAPH;

public class RottenOranges
{
    private int orangesRotting(int [][] grid)
    {
        
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
