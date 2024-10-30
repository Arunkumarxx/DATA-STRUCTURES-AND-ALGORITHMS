package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class FindWhetherPathExist
{
    public boolean is_Possible(int[][] grid)
    {
        int n=grid.length;
        Queue<int []> queue =new LinkedList();
        for(int rows=0;rows<n;++rows)
        {
            for(int cols=0;cols<n;++cols)
            {
                if(grid[rows][cols]==1)
                {
                    queue.add(new int []{rows,cols});
                }
            }
        }
        int [] r ={-1,1,  0,0};
        int [] c ={ 0,0, -1,1};
        while(!queue.isEmpty())
        {
            int []curr=queue.poll();
            int x=curr[0];
            int y=curr[1];
            for(int i=0;i<4;++i)
            {
                int newX=x+r[i];
                int newY=y+c[i];
                if(isValid(newX,newY,n))
                {
                    if(grid[newX][newY]==3)
                    {
                        queue.add(new int []{newX,newY});
                        grid[newX][newY]=0;
                    }
                    if(grid[newX][newY]==2)
                        return true;
                }
            }
        }
        return false;
    }
    private boolean isValid(int x,int y,int n)
    {
        if(x>=0 && x<n && y>=0 && y<n)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        int [][] grid =
                {
                        {3,0,3,0,0},
                        {3,0,0,0,3},
                        {3,3,3,3,3},
                        {0,2,3,0,0},
                        {3,0,0,1,3}
                };
        FindWhetherPathExist findWhetherPathExist =new FindWhetherPathExist();
        System.out.println(findWhetherPathExist.is_Possible(grid));
    }

}
