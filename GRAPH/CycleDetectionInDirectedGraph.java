package GRAPH;

public class CycleDetectionInDirectedGraph
{
    public boolean isCyclic(int v, ArrayList<ArrayList<Integer>> adj) {
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
        {
            if(!visited[edges])
            {
                if(detectCycle(adj,visited,pathVisited,edges))
                    return true;
            }
            else if(pathVisited[edges])
                return true;
        }
        pathVisited[src]=false;
        return false;
    }

    public static void main(String[] args)
    {

    }
}
