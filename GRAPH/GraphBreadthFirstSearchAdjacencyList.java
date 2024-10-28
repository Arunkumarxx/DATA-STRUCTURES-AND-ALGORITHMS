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
        adjacencyList.get(srcIndex).add(destination);
        adjacencyList.get(destIndex).add(source);
    }
    private int charToInd (char c)
    {
        if(Character.isLowerCase(c))
            return c-'a';
        else return 26+(c-'A');
    }
    private void printGraph()
    {
        int size=adjacencyList.size();
        for(int i=0;i<size;++i)
        {
            if(!adjacencyList.get(i).isEmpty())
            {
                System.out.print((i < 26 ? (char) (i + 'a') : (char) ('A' + (i - 26))) + " -> ");
                for (Character val : adjacencyList.get(i))
                {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)
    {
        GraphBreadthFirstSearchAdjacencyList Graph1 =new GraphBreadthFirstSearchAdjacencyList(8);
        Graph1.addAdjacency('a', 'e');
        Graph1.addAdjacency('b', 'f');
        Graph1.addAdjacency('A', 'B');
        Graph1.printGraph();
    }
}
