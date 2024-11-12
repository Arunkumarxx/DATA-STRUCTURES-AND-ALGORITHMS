package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class BellmanFordAlgorithmForShortestPath
{
    private int [] bellsManFord(int v,int [][] edges,int src)
    {
        Queue<int []> queue =new LinkedList<>();
        int n=v;
        queue.add(new int[]{0,0});
        int [] dis =new int[n];
        while(!queue.isEmpty())
        {
            int [] curr = queue.poll();
            int currSrc=curr[0];
            int currDis=curr[1];
            
        }
    }
    public static void main(String[] args)
    {

    }
}
