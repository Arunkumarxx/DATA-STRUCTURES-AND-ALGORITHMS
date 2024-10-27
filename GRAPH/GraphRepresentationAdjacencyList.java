package GRAPH;

import java.util.ArrayList;

public class GraphRepresentationAdjacencyList
{
    private ArrayList<ArrayList<Integer>> AdjacencyList;

    GraphRepresentationAdjacencyList()
    {
        AdjacencyList=new ArrayList<>();
    }
    private void addAdjacent(int s,int d)
    {
        if(AdjacencyList.get(s)==null)
        {
            AdjacencyList.add(s, new ArrayList<Integer>());
            AdjacencyList.add(s,d);
        }
    }
    public static void main(String[] args)
    {
        GraphRepresentationAdjacencyList graph1=new GraphRepresentationAdjacencyList();

    }
}
