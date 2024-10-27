package GRAPH;

import java.util.ArrayList;

public class GraphRepresentationAdjacencyList
{
    private ArrayList<ArrayList<Integer>> AdjacencyList;

    GraphRepresentationAdjacencyList(int vertices)
    {
        AdjacencyList =new ArrayList<>(vertices);
        for(int i=0;i<vertices;++i)
        {
            AdjacencyList.add(new ArrayList<>());
        }
    }
    private void addAdjacent(int s,int d)
    {
        AdjacencyList.get(s).add(d);
        AdjacencyList.get(d).add(s);
    }
    public static void main(String[] args)
    {
        GraphRepresentationAdjacencyList graph1=new GraphRepresentationAdjacencyList();
        graph1.addAdjacent();
    }
}
