package GRAPH;

import java.util.*;

public class ShortestPathInDirectedAcyclicGraph
{
    class Pair
    {
        int value;
        int distance;
        Pair(int value,int distance)
        {
            this.value=value;
            this.distance=distance;
        }
    }
    private void ShortestPathInDirectedAcyclicGraph(ArrayList<ArrayList<Integer>> adj)
    {
        int n=adj.size();
        boolean [] visited =new boolean[n];
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<n;++i)
        {
            if(!visited[i])
            {
                dfs(adj,visited,stack,i);
            }
        }
        int [] dis =new int[n];
        Arrays.fill(dis,-1);
        dis[stack.peek()]=0;

    }
    private void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] visited,Stack<Integer> stack,int source)
    {
        visited[source]=true;
        for(int vertices:adj.get(source))
        {
            if(!visited[vertices])
                dfs(adj,visited,stack,vertices);
        }
        stack.push(source);
    }
    public static void main(String[] args)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(6).add(4);
        adj.get(6).add(5);
        adj.get(5).add(4);
        adj.get(4).add(0);
        adj.get(4).add(2);
        adj.get(2).add(3);
        adj.get(0).add(1);
        adj.get(1).add(3);
    }

}
