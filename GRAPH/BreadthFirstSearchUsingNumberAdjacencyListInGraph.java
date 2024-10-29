package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearchUsingNumberAdjacencyList {
    private ArrayList<Integer> bfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> result=new ArrayList<>();
        boolean visited[]=new boolean[adj.size()];
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        visited[0]=true;
        while(!queue.isEmpty()) {
            int curr=queue.poll();
            result.add(curr);
            for(Integer val:adj.get(curr)) {
                if(!visited[val]) {
                    visited[val]=true;
                    queue.add(val);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int vertices = 5;
        for (int i = 0; i < vertices; ++i) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);
        adj.get(3).add(4);

        BreadthFirstSearchUsingNumberAdjacencyList obj = new BreadthFirstSearchUsingNumberAdjacencyList();
        ArrayList<Integer> bfsResult = obj.bfsOfGraph(adj);
        System.out.println("BFS traversal of the graph: " + bfsResult);
    }
}
