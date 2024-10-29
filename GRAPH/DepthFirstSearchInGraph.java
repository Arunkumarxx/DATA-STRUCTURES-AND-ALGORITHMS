package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstSearchInGraph
{
    List<List<Integer>> Adjacency ;
    DepthFirstSearchInGraph()
    {
        Adjacency =new ArrayList<>();
        for(int i=0;i<52;++i)
            Adjacency.add(new ArrayList<>());
    }
    private void addAdjacency(char source,char destination)
    {
        int sourceInd =
    }
    private int charToInd(char c)
    {
        if(c<='z')
            return c-'a';
        else return 26+(c-'A');
    }
    public static void main(String[] args)
    {

    }
}
