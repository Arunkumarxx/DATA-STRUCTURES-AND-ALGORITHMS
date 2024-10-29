package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class StepsByKnight
{
    private final  int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
    private final  int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};

    private int minStepToReachTarget(int knightPos[], int targetPos[], int n)
    {
        boolean [][] visited = new boolean[n][n];
        Queue<int []> queue =new LinkedList<>();
        queue.add(new int[]{knightPos[0]-1,knightPos[1]-1,0});
        visited[knightPos[0]-1][knightPos[1]-1]=true;
        while(!queue.isEmpty() )
        {
            int [] curr= queue.poll();
            int currX=curr[0];
            int currY=curr[1];
            int currDis=curr[2];
            if(currX==(targetPos[0]-1) && currY==(targetPos[1]-1))
                return currDis;
            for(int i=0;i<8;++i)
            {
                if(isValid(currX-dx[i],currY-dy[i],n) && !visited[currX-dx[i]][currY-dy[i]])
                {
                    queue.add(new int []{currX-dx[i],currY-dy[i],currDis+1});
                    visited[currX-dx[i]][currY-dy[i]]=true;
                }
            }
        }
        return -1;
    }
    private boolean isValid(int x,int y,int n)
    {
        if(x>=0 && x<=n-1 && y<=n-1 && y>=0)
            return true;
        return false;
    }
    public static void main(String[] args)
    {
        StepsByKnight stepsByKnight =new StepsByKnight();
        int [] knightPos =  {4,5};
        int [] targetPos =  {1,1};
        System.out.println( stepsByKnight.minStepToReachTarget(knightPos,targetPos,6));
    }
}
