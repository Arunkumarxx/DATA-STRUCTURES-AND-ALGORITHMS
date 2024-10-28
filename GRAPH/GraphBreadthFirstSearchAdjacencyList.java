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
        int srcIndex = charToInd(source);
        int destIndex = charToInd(destination);
        adjacencyList.get(srcIndex).add(destIndex);
    }
    private int charToInd (char c)
    {
        if(Character.isLowerCase(c))
            return c-'a';
        else return 26+(c-'A');
    }
    public static void main(String[] args)
    {
        GraphBreadthFirstSearchAdjacencyList Graph1 =new GraphBreadthFirstSearchAdjacencyList(8);
        Graph1.addAdjacency('a','e');
    }
}
