package GRAPH;

public class UnitAreaOfLargestRegionOfOnes
{
    private void findMaxAreaOfOnes(int[][] grid)
    {
        int [] x ={-1, 0, 1,-1,1,1,0,-1};
        int [] y ={-1,-1,-1, 0, 0, 1, 1, 1};
    }
    public static void main(String[] args)
    {
        int [] [] grid ={
                {1,1,1,0},
                {0,0,1,0},
                {0,0,0,1},
        };
        UnitAreaOfLargestRegionOfOnes unitAreaOfLargestRegionOfOnes =new UnitAreaOfLargestRegionOfOnes();
        unitAreaOfLargestRegionOfOnes.findMaxAreaOfOnes(grid);
    }
}
