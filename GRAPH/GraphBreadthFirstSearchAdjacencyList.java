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
        int srcIndex = charToIndex(source);
        int destIndex = charToIndex(destination);
        adjacencyList.get(srcIndex).add(destination);
        adjacencyList.get(destIndex).add(source);
    }
    private char indexToChar(int val) {
        return val < 26 ? (char) ('a' + val) : (char) ('A' + (val - 26));
    }

    private int charToIndex(char c) {
        if (Character.isLowerCase(c))
            return c - 'a';
        else
            return 26 + (c - 'A');

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
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[adjacencyList.size()];

        int startNode = -1;
        for (int i = 0; i < adjacencyList.size(); ++i)
        {
            if (!adjacencyList.get(i).isEmpty())
            {
                startNode = i;
                break;
            }
        }
        if(startNode==-1)
            return;
        queue.add(startNode);
        visited[startNode]=true;
        while(!queue.isEmpty())
        {
            int curr=queue.poll();
            System.out.print(indexToChar(curr));

            for(Character val:adjacencyList.get(curr))
            {
                if(!visited[val])
                {
                    queue.add(charToIndex(val));
                    visited[charToIndex(val)]=true;
                }
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
