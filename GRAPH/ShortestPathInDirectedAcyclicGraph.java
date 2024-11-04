package GRAPH;

import java.util.*;


public class ShortestPathInDirectedAcyclicGraph
{

    public static void main(String[] args)
    {
        ArrayList<ArrayList<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(6).add(new int []{4,2});
        adj.get(6).add(new int []{5,3});
        adj.get(5).add(new int []{4,1});
        adj.get(4).add(new int []{0,3});
        adj.get(4).add(new int []{2,1});
        adj.get(2).add(new int []{3,3});
        adj.get(0).add(new int []{1,2});
        adj.get(1).add(new int []{3,1});
    }

}
