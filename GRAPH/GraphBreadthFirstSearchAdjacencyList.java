package GRAPH;

import javax.security.auth.callback.CallbackHandler;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
    private void breadthFirstSearch()
    {
        Queue<Integer> queue =new LinkedList<>();
        int i=0;
        for(;i<adjacencyList.size();++i)
        {
            if(adjacencyList.get(i).isEmpty())
                continue;
            else break;
        }
        queue.add(i);
        while(!queue.isEmpty())
        {
            int ch =queue.poll();
            System.out.print(ch<26? 'a'+ch:'A'+(ch-26));
            for(Character val:adjacencyList.get(ch))
            {
                queue.add(Character.isLowerCase(val)?'a'-val:'A'-val);
            }
        }
    }
    public static void main(String[] args)
    {
        GraphBreadthFirstSearchAdjacencyList graph =new GraphBreadthFirstSearchAdjacencyList(8);
        graph.addAdjacency('a', 'e');
        graph.addAdjacency('a', 'b');
        graph.addAdjacency('a', 'g');
        graph.addAdjacency('e', 'd');
        graph.addAdjacency('e', 'f');
        graph.addAdjacency('b','c');
        graph.addAdjacency('b','h');
        graph.addAdjacency('g','b');
        graph.addAdjacency('d','c');
        graph.addAdjacency('f','b');
        graph.addAdjacency('c','h');
//        graph.printGraph();
        graph.breadthFirstSearch();
    }
}
