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
        Queue<int []> queue =new LinkedList<>();

        queue.add(new int[]{source,0});

        int [] distance =new int[n];
        Arrays.fill(distance,-1);

        distance[source]=0;

        while(!queue.isEmpty())
        {
            int [] curr=queue.poll();
            int sr=curr[0];
            int dis=curr[1];

            for(int [] edge:edges)
            {
                int newSrc=edge[0];
                int newDes=edge[1];
                if(distance[newSrc]==-1)
                {
                    queue.add(new int [] {newSrc,newDes+1});
                    distance[newSrc]=newDes+1;
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
