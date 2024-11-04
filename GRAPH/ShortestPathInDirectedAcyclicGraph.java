package GRAPH;

import java.util.ArrayList;

public class ShortestPathInDirectedAcyclicGraph
{
    private void ShortestPathInDirectedAcyclicGraph(ArrayList<ArrayList<Integer>> adj)
    {
        int n=adj.size();
        boolean [] visited =new boolean[n];
        
    }
    private void dfs()
    {

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
