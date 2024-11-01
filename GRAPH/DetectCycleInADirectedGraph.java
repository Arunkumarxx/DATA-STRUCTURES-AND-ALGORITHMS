package GRAPH;

import java.util.ArrayList;
import java.util.Arrays;

public class DetectCycleInADirectedGraph
{
    private boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj)
    {
        boolean [] visited =new boolean[v];
        boolean [] pathVisited = new boolean[v];
        for(int i=0;i<v;++i)
        {
            if(!visited[i])
            {
                if(detectCycle(adj,visited,pathVisited,i))
                    return true;
            }
        }
        return false;
    }
    private boolean detectCycle(ArrayList<ArrayList<Integer>>adj,boolean[] visited,boolean[] pathVisited,int src)
    {
        visited[src]=true;
        pathVisited[src]=true;
        for(int edges:adj.get(src))
            if(!visited[edges])
                detectCycle(adj,visited,pathVisited,edges);
            else if(pathVisited[edges])
                return true;
            pathVisited[src]=false;
        return false;
    }
    public static void main(String[] args)
    {
        DetectCycleInADirectedGraph detectCycleInADirectedGraph =new DetectCycleInADirectedGraph();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<4;++i)
        {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(3);
        System.out.println(detectCycleInADirectedGraph.isCyclic(adj.size(),adj));
    }

}
