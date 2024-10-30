package GRAPH;

public class FindTheNumberOfIslands
{
    private int numIsIslands(char [][] grid)
    {
        
    }
    public static void main(String[] args)
    {
        char [][] grid ={
                {'0','1','1','0'},
                {'0','1','1','0'},
                {'0','0','1','0'},
                {'0','0','0','0'},
                {'1','1','0','1'},
        };
        FindTheNumberOfIslands findTheNumberOfIslands =new FindTheNumberOfIslands();
        System.out.println(findTheNumberOfIslands.numIsIslands(grid));
    }
}
