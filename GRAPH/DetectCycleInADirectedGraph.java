package GRAPH;

import java.util.ArrayList;

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
                if(detectCycle(visited,pathVisited,i))
                    return true;
            }
        }
        return false;
    }
    private boolean detectCycle(ArrayList<>boolean[] visited,boolean[] pathVisited,int src)
    {

    }
    public static void main(String[] args)
    {
        DetectCycleInADirectedGraph detectCycleInADirectedGraph =new DetectCycleInADirectedGraph();
        System.out.println(detectCycleInADirectedGraph.detectCycleInDirectedGraph());
    }

}
