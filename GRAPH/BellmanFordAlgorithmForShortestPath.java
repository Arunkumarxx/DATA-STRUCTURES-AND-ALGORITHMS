package GRAPH;

import java.util.Arrays;

public class BellmanFordAlgorithmForShortestPath
{
    private int [] bellsManFord(int v,int [][] edges,int src)
    {
        int [] dis =new int [v];
        Arrays.fill(dis,100000000 );
        dis[src]=0;

        for(int i=0;i<v-1;++i)
        {
            for(int [] edge:edges)
            {
                int unit=edge[0];
                int vertex=edge[1];
                int weight=edge[2];

                if(dis[unit]!=100000000  && dis[unit]+weight<dis[vertex])
                    dis[vertex]=dis[unit]+weight;
            }
        }
        for(int i=0;i<v-1;++i)
        {
            for(int [] edge:edges)
            {
                int unit=edge[0];
                int vertex=edge[1];
                int weight=edge[2];
                if(dis[unit]!=100000000  && dis[unit]+weight<dis[vertex])
                    return new int []{-1};
            }
        }
        return dis;
    }
    public static void main(String[] args)
    {
        int [][] edges =
                {
                        {0,1,-1},
                        {1,0,-1}
                };
        BellmanFordAlgorithmForShortestPath bellmanFordAlgorithmForShortestPath = new BellmanFordAlgorithmForShortestPath();
        System.out.println(Arrays.toString(bellmanFordAlgorithmForShortestPath.bellsManFord(edges.length,edges,0)));
    }
}
