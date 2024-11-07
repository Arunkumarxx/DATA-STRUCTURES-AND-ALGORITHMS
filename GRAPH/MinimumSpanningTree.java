package GRAPH;
import java.util.*;

public class MinimumSpanningTree
{
    private int spanningTree(int v, int e, List<List<int[]>> adj) {
        boolean [] visited =new boolean [v];

        PriorityQueue<int []> minHeap =new PriorityQueue<>((a, b)->Integer.compare(a[0],b[0]));
        int sum=0;
        minHeap.add(new int [] {0,0});
        while(!minHeap.isEmpty())
        {
            int[] edge = minHeap.poll();
            int weight = edge[0];
            int node = edge[1];

            if(visited[node])
                continue;

            visited[node]=true;
            sum+=weight;
            for(int [] neighbor:adj.get(node))
            {
                int neighborNode=neighbor[0];
                int neighborWeight=neighbor[1];

                if(!visited[neighborNode])
                    minHeap.add(new int []{neighborWeight,neighborNode});
            }
        }
        return sum;
    }
    public static void main(String[] args)
    {

    }

}
