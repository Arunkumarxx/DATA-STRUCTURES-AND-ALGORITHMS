package GRAPH;

import java.util.*;

public class ShortestPathInUndirectedOneWeightedGraphToAllVertex
{
    private int[] shortestPath(int[][] edges,int n,int m ,int source) {
        List<List<Integer>> adj =new ArrayList<>();
        for(int i=0;i<n;++i)
            adj.add(new ArrayList<>());
        for(int [] edge:edges)
        {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        Queue<Integer> queue =new LinkedList<>();

        queue.add(source);

        int [] distance =new int[n];
        Arrays.fill(distance,-1);

        distance[source]=0;

        while(!queue.isEmpty())
        {
            int src=queue.poll();
            int currDistance=distance[src];
            for(int  neighbour:adj.get(src))
            {
                if(distance[neighbour]==-1)
                {
                    distance[neighbour]=currDistance+1;
                    queue.add(neighbour);
                }
            }
        }
        return distance;
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
        ShortestPathInUndirectedOneWeightedGraphToAllVertex shortestPathInUndirectedGraphToVertex = new ShortestPathInUndirectedOneWeightedGraphToAllVertex();
        System.out.println(Arrays.toString(shortestPathInUndirectedGraphToVertex.shortestPath(edges,edges.length,edges[0].length,0)));
    }
}
