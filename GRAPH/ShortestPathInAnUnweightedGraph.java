package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInAnUnweightedGraph
{
    ArrayList<ArrayList<Integer>> adj;
    ShortestPathInAnUnweightedGraph(int vertices)
    {
        adj=new ArrayList<>();
        for(int i=0;i<vertices;++i)
            adj.add(new ArrayList<>());
    }
    private void addAdjacency(int source,int destination)
    {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }
    private void print()
    {
        for(int i=0;i< adj.size();++i)
        {
            if(!adj.get(i).isEmpty())
            {
                System.out.print(i + " -> ");

                for (Integer val : adj.get(i))
                {
                    System.out.print(val+" ");
                }
                System.out.println();
            }
        }
    }
    private void ShortestPath(int source,int destination)
    {
        int n=adj.size();
        boolean[] visited =new boolean[n];
        int [] parent =new int[n];
        Queue<Integer> queue = new LinkedList<>();
        parent[source]=-1;
        visited[source]=true;
        queue.add(source);
        boolean found=false;
        while(!queue.isEmpty())
        {
            int src= queue.poll();
            if(src==destination)
            {
                found=true;
                break;
            }
            for(Integer newSrc:adj.get(src))
            {
                if(!visited[newSrc])
                {
                    visited[newSrc]=true;
                    queue.add(newSrc);
                    parent[newSrc]=src;
                }
            }
        }
        if(found)
        {
            System.out.println("source "+source+" to destination "+destination+" ");
            printPath(parent,destination);
        }
    }
    private void printPath(int []parent,int destination)
    {
        if(destination==-1)
            return;
        printPath(parent,parent[destination]);
        System.out.print(destination+" ");
    }
    public static void main(String[] args)
    {
        ShortestPathInAnUnweightedGraph Graph1 =new ShortestPathInAnUnweightedGraph(10);
        Graph1.addAdjacency(1,2);
        Graph1.addAdjacency(1,0);
        Graph1.addAdjacency(0,3);
        Graph1.addAdjacency(3,7);
        Graph1.addAdjacency(3,4);
        Graph1.addAdjacency(7,4);
        Graph1.addAdjacency(7,6);
        Graph1.addAdjacency(4,6);
        Graph1.addAdjacency(4,5);
        Graph1.addAdjacency(5,6);
        Graph1.print();
        System.out.println();
        Graph1.ShortestPath(0,7);
    }

}
