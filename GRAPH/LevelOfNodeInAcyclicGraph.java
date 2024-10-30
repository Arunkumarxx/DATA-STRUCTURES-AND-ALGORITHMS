package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class LevelOfNodeInAcyclicGraph {
    private int BreathFirstSearch(int v, ArrayList<ArrayList<Integer>> adj, int x) {

        boolean[] visited=new boolean[v];
        Queue<int[]> queue=new LinkedList<>();
        queue.add(new int[]{0, 0});
        visited[0]=true;
        while(!queue.isEmpty()) {
            int[] current=queue.poll();
            int node=current[0];
            int level=current[1];
            if(node==x) {
                return level;
            }
            for(int neighbor:adj.get(node)) {
                if(!visited[neighbor]) {
                    visited[neighbor]=true;
                    queue.add(new int[]{neighbor, level+1});
                }
            }
        }
        return -1;
    }
    private int DepthFirstSearch(int v, ArrayList<ArrayList<Integer>> adj, int x)
    {
        boolean [] visited = new boolean[v];
        return levelOfX(adj,x,visited,0,0);
    }
    private int  levelOfX(ArrayList<ArrayList<Integer>>adj ,int x,boolean[] visited,int source,int level)
    {
        if(source==x)
            return level;

        visited[source]=true;
        for(Integer neigh:adj.get(source))
        {
            if(!visited[neigh])
            {
                int foundLevel=levelOfX(adj,x,visited,neigh,level+1);
                if(foundLevel!=-1)
                    return foundLevel;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        LevelOfNodeInAcyclicGraph obj=new LevelOfNodeInAcyclicGraph();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<5;i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);
        System.out.println("Level of node 4: "+obj.BreathFirstSearch(5, adj, 4));
        System.out.println("Level of node 4: "+obj.DepthFirstSearch(5, adj, 4));
    }
}
