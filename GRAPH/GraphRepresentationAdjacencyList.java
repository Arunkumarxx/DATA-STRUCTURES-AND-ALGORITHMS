package GRAPH;

import java.util.ArrayList;

public class GraphRepresentationAdjacencyList
{
    private ArrayList<ArrayList<Integer>> AdjacencyList;

    private void addAdjacent(int s,int d)
    {
        AdjacencyList.add(s,AdjacencyList.get(s).add(d));
    }
    public static void main(String[] args)
    {
        GraphRepresentationAdjacencyList graph1=new GraphRepresentationAdjacencyList();

    }
}
