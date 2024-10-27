package GRAPH;

import java.util.ArrayList;
import java.util.List;

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
    private void printGraph()
    {
        for(List<Integer> source:AdjacencyList)
        {
            for(Integer destination:source)
            {
                System.out.print(destination +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        GraphRepresentationAdjacencyList graph1=new GraphRepresentationAdjacencyList(5);
        graph1.addAdjacent(1,2);
        graph1.addAdjacent(1,0);
        graph1.addAdjacent(2,0);
        graph1.printGraph();
    }
}
