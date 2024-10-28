package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class GraphBreadthFirstSearchAdjacencyList
{
    List<List<Character>> adjacencyList ;
    GraphBreadthFirstSearchAdjacencyList(int vertices)
    {
        vertices=Math.max(52,vertices);
        adjacencyList=new ArrayList<>();
        for(int i=0;i<vertices;++i)
            adjacencyList.add(new ArrayList<>());
    }
    private void addAdjacency(char source,char destination)
    {
        adjacencyList.get(source).add(destination);
        adjacencyList.get(destination).add(source);
    }
    public static void main(String[] args)
    {
        GraphBreadthFirstSearchAdjacencyList Graph1 =new GraphBreadthFirstSearchAdjacencyList(8);
        Graph1.addAdjacency('a','e');
    }
}
