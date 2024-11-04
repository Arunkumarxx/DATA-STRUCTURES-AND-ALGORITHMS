package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumCostPath
{
    public int minimumCostPath(int[][] grid)
    {
        int n=grid.length;
        boolean [][] visited =new boolean[n][n];
        int [] y ={-1,1,0,0};
        int [] x ={0,0,-1,1};
        int sum=0;
        for(int row=0;row<n;++row)
        {
            for(int col=0;col<n;++col)
            {
                if(!visited[row][col])
                {
                    Queue<int[]> queue =new LinkedList<>();
                    queue.add(new int []{row,col});
                    while(!queue.isEmpty())
                    {
                        int [] curr= queue.poll();
                        sum+=grid[curr[0]][curr[1]];
                        System.out.print(grid[curr[0]][curr[1]]+" ");
                        int currRow=curr[0];
                        int currCol=curr[1];
                        int [] minValueRowAndCol=new int [2];
                        int minValue=Integer.MAX_VALUE;
                        for(int i=0;i<4;++i)
                        {
                            int newCurrRow=currRow+x[i];
                            int newCurrCol=currCol+y[i];

                            if(isValid(newCurrRow,newCurrCol,n) && !visited[newCurrRow][newCurrCol])
                            {
                                visited[newCurrRow][newCurrCol]=true;
                                if(grid[newCurrRow][newCurrCol]<minValue)
                                {
                                    minValueRowAndCol[0]=newCurrRow;
                                    minValueRowAndCol[1]=newCurrCol;
                                }
                            }
                        }
                        if(minValue!=Integer.MAX_VALUE)
                            queue.add(new int [] {minValueRowAndCol[0],minValueRowAndCol[1]});
                    }
                }
            }
        }
        return sum;
    }
    private boolean isValid(int x,int y,int n)
    {
        return x>=0 && x<n && y>=0 && y<n? true : false;
    }
    public static void main(String[] args)
    {
        int[][] grid =
                {
                        {9,4,9,9},
                        {6,7,6,4},
                        {8,3,3,7},
                        {7,4,9,10}
                };
        MinimumCostPath minimumCostPath =new MinimumCostPath();
        System.out.println(minimumCostPath.minimumCostPath(grid));
    }
}
