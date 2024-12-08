package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchCharactersAdjacencyListInUndirectedGraph
{
    List<List<Character>> Adjacency ;
    DepthFirstSearchCharactersAdjacencyListInUndirectedGraph()
    {
        Adjacency =new ArrayList<>();
        for(int i=0;i<52;++i)
            Adjacency.add(new ArrayList<>());
    }
    private void addAdjacency(char source,char destination)
    {
        int sourceInd =charToInd(source);
        int destinationInd= charToInd(destination);
        Adjacency.get(sourceInd).add(destination);
        Adjacency.get(destinationInd).add(source);
    }
    private int charToInd(char c)
    {
        if(c>='a' && c<='z')
            return c-'a';
        else return 26+(c-'A');
    }
    private void print()
    {
        for(int i=0;i<Adjacency.size();++i)
        {
            if(!Adjacency.get(i).isEmpty())
            {
                System.out.print(intToChar(i)+"->");
                for(Character val:Adjacency.get(i))
                {
                    System.out.print(val);
                }
                System.out.println();
            }
        }
    }
    private char intToChar(int n)
    {
        if(n<26)
            return (char) ('a'+n);
        return(char) ('A'+(n-26));
    }

    private void DFS()
    {
        boolean [] visited=new boolean[Adjacency.size()];
        int startNode=-1;
        for(int i=0;i<Adjacency.size();++i)
        {
            if(!Adjacency.get(i).isEmpty())
            {
                startNode=i;
                break;
            }
        }

        DepthFirstSearch(Adjacency,visited,intToChar(startNode));
    }
    private void DepthFirstSearch(List<List<Character>> adj,boolean [] visited,char source)
    {

        visited[charToInd(source)]=true;
        for(Character val :adj.get(charToInd(source)))
        {
            if(!visited[charToInd(val)])
            {
                DepthFirstSearch(adj, visited, val);
            }
        }
        System.out.print(source+" ");
    }
    public static void main(String[] args)
    {
        DepthFirstSearchCharactersAdjacencyListInUndirectedGraph Graph =new DepthFirstSearchCharactersAdjacencyListInUndirectedGraph();
        Graph.addAdjacency('a','e');
        Graph.addAdjacency('a','b');
        Graph.addAdjacency('a','g');
        Graph.addAdjacency('e','d');
        Graph.addAdjacency('e','f');
        Graph.addAdjacency('d','c');
        Graph.addAdjacency('f','b');
        Graph.addAdjacency('c','b');
        Graph.addAdjacency('c','h');
        Graph.addAdjacency('b','g');
        Graph.addAdjacency('b','h');
        Graph.print();
        Graph.DFS();
    }
}
