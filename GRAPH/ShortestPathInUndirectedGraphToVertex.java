package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUndirectedGraphToVertex
{
    private int[] shortestPath(int[][] edges,int n,int m ,int source) {
        boolean [] visited =new boolean[n];
        Queue<int []> queue =new LinkedList<>();
        queue.add(new int[]{source,0});
        visited[source]=true;
        int [] distance =new int[n];
        while(!queue.isEmpty())
        {
            int [] curr=queue.poll();
            int  src=curr[0];
            int dis=curr[1];
            for(int neighbour:edges[src])
            {
                if(!visited[neighbour])
                {
                    queue.add(new int []{neighbour,dis+1});
                    distance[neighbour]=dis;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int [][] edges =
                {
                        {0,1},
                        {0,3},
                        {3,4},
                        {4,5},
                        {5,6},
                        {1,2},
                        {2,6},
                        {6,7},
                        {6,7},
                        {7,8},
                        {6,8},
                };

    }
}
