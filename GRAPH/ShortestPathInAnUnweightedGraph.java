package GRAPH;

import java.util.ArrayList;

public class ShortestPathInAnUnweightedGraph
{
    ArrayList<ArrayList<Integer>> adj;
    ShortestPathInAnUnweightedGraph(int vertices)
    {
        adj=new ArrayList<>();
        for(int i=0;i<vertices;++i)
            adj.add(new ArrayList<>());
    }
    private void addAdjacency(int source,int destination)
    {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }
    public static void main(String[] args)
    {
        ShortestPathInAnUnweightedGraph Graph1 =new ShortestPathInAnUnweightedGraph(89);
        Graph1.addAdjacency(1,2);
        Graph1.addAdjacency(1,0);
        Graph1.addAdjacency(0,3);
        Graph1.addAdjacency(3,7);
        Graph1.addAdjacency(3,4);
        Graph1.addAdjacency(7,4);
        Graph1.addAdjacency(7,6);
        Graph1.addAdjacency(4,6);
        Graph1.addAdjacency(4,5);
        Graph1.addAdjacency(5,6);
    }

}
