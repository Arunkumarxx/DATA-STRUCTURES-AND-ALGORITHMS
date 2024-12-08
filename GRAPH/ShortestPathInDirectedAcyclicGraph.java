package GRAPH;

import java.util.*;


public class ShortestPathInDirectedAcyclicGraph
{
    private void ShortestPathInDirectedAcyclicGraph(ArrayList<ArrayList<int[]>>adj)
    {
        int n=adj.size();
        boolean[] visited =new boolean[n];
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<n;++i)
        {
            if(!visited[i])
            {
                dfs(adj,stack,visited,i);
            }
        }
        int [] dis =new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        dis[0]=0;
        while(!stack.isEmpty())
        {
            int unit=stack.pop();
            if(dis[unit]!=Integer.MAX_VALUE)
            {
                for(int[] edges:adj.get(unit))
                {
                    int vertex=edges[0];
                    int weight=edges[1];
                    if(dis[vertex]>weight+dis[unit])
                        dis[vertex]=weight+dis[unit];
                }
            }
        }
        System.out.println(Arrays.toString(dis));
    }
    private void dfs(ArrayList<ArrayList<int []>> adj ,Stack<Integer> stack,boolean [] visited,int source)
    {
        visited[source]=true;
        for(int [] pair:adj.get(source))
        {
            if(!visited[pair[0]])
            dfs(adj,stack,visited,pair[0]);
        }
        stack.push(source);
    }
    public static void main(String[] args)
    {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(6).add(new int []{4,2});
        adj.get(6).add(new int []{5,3});
        adj.get(5).add(new int []{4,1});
        adj.get(4).add(new int []{0,3});
        adj.get(4).add(new int []{2,1});
        adj.get(2).add(new int []{3,3});
        adj.get(0).add(new int []{1,2});
        adj.get(1).add(new int []{3,1});
        ShortestPathInDirectedAcyclicGraph shortestPathInDirectedAcyclicGraph =new ShortestPathInDirectedAcyclicGraph();
        shortestPathInDirectedAcyclicGraph.ShortestPathInDirectedAcyclicGraph(adj);


    }

}
