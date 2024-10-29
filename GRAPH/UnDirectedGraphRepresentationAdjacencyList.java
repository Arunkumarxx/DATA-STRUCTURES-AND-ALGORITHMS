package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class UnDirectedGraphRepresentationAdjacencyList
{
    private ArrayList<ArrayList<Integer>> AdjacencyList;

    UnDirectedGraphRepresentationAdjacencyList(int vertices)
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
        UnDirectedGraphRepresentationAdjacencyList Graph1=new UnDirectedGraphRepresentationAdjacencyList(5);
        Graph1.addAdjacent(0,1);
        Graph1.addAdjacent(0,4);
        Graph1.addAdjacent(1,4);
        Graph1.addAdjacent(1,3);
        Graph1.addAdjacent(1,2);
        Graph1.addAdjacent(3,4);
        Graph1.printGraph();
    }
}
