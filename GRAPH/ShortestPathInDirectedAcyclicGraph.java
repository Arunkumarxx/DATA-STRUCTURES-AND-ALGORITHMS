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
        Arrays.fill(dis,-1);
        dis[stack.peek()]=0;
        fillDistance(dis,adj,stack.pop());
    }
    private void fillDistance(int [] dis,ArrayList<ArrayList<int[]>> adj,int source)
    {
        Queue<int []> queue =new LinkedList<>();
        queue.add(new int []{source,dis[source]});
        while(!queue.isEmpty())
        {
            int [] pair=queue.poll();
            int currValue=pair[0];
            int distance=pair[1];
            for(int []vertexPair:adj.get(currValue))
            {
                int[] newPair=vertexPair;
                int newCurrValue=newPair[0];
                int newCurrDistance=newPair[0];
                if(dis[newCurrValue]==-1)
                {
                    dis[newCurrValue] = newCurrDistance;
                    queue.add(new int [] {newCurrValue,distance+newCurrDistance});
                }
                else
                {
                    dis[newCurrValue]=Math.min(dis[newCurrValue],newCurrDistance+distance);

                }
            }
        }
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
