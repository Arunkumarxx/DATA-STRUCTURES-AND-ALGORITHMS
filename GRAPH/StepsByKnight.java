package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class StepsByKnight
{
    private int minStepToReachTarget(int []knightPos, int []targetPos, int n)
    {
        int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {1, 2, 2, 1, -1, -2, -2, -1};
        Queue<int []> queue =new LinkedList<>();
        queue.add(new int[]{knightPos[0]-1,knightPos[1]-1,0});

        while(!queue.isEmpty())
        {
            int [] curr= queue.poll();
            int currX=curr[0];
            int currY=curr[1];
            int currDis=curr[2];
            
        }
    }
    private boolean isValid(int x,int y,)
    {
        if(x>=0 && x<=)
    }
    public static void main(String[] args)
    {

    }

}
