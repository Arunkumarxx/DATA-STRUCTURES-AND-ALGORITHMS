package GRAPH;

import java.lang.foreign.PaddingLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BellmanFordAlgorithmForShortestPath
{
    private int [] bellsManFord(int v,int [][] edges,int src)
    {
        ArrayList<ArrayList<int []>> adj =new ArrayList<>();
        for(int i=0;i<=v;++i)
            adj.add(new ArrayList<>());
        for (int row = 0; row < v; ++row) {
            int[] curr = new int[]{edges[row][0], edges[row][1], edges[row][2]};
            adj.get(curr[0]).add(new int[]{curr[1], curr[2]});
        }
        for(int i=0;i<v;++i)
        {
            System.out.print(i+" ");
            for(int [] edg:adj.get(i))
            {
                System.out.print(Arrays.toString(edg)+" ");
            }
            System.out.println();
        }
        int [] dis =new int[v];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Queue<int[]> queue =new LinkedList<>();
        while(!queue.isEmpty())
        {
            
        }
    }
    public static void main(String[] args)
    {
        int [][] edges =
                {
                        {0,1,5},
                        {1,0,3},
                        {1,2,-1},
                        {2,0,1},
                };
        BellmanFordAlgorithmForShortestPath bellmanFordAlgorithmForShortestPath = new BellmanFordAlgorithmForShortestPath();
        bellmanFordAlgorithmForShortestPath.bellsManFord(edges.length,edges,0);

    }
}
