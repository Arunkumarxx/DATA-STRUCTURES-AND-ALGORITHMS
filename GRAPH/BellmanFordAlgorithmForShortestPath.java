package GRAPH;

import java.lang.foreign.PaddingLayout;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BellmanFordAlgorithmForShortestPath
{
    private int [] bellsManFord(int v,int [][] edges,int src)
    {
        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<v;++i)
            adj.add(new ArrayList<>());
        for(int row=0;row<v;++row)
        {
            for(int col=0;col<edges[row].length;++col)
            {
                adj.get(edges[row][col])
            }
        }
    }
    public static void main(String[] args)
    {
        int [][] edges =
                {
                        {0,1,5},
                        {1,0,3},
                        {1,2,-1},
                        {2,0,1},
                };
    }
}
