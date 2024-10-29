package GRAPH;

import java.util.ArrayList;

public class PreOrderTraversalInUndirectedGraph {

    ArrayList<Integer> result = new ArrayList<Integer>();

    public ArrayList<Integer> dfsOfGraph(ArrayList<ArrayList<Integer>> adj) {
        DFS(adj);
        return result;
    }

    private void DFS(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        DepthFirstSearch(adj, visited, 0);
    }

    private void DepthFirstSearch(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source) {
        visited[source] = true;
        result.add(source);
        for (Integer val : adj.get(source)) {
            if (!visited[val]) {
                DepthFirstSearch(adj, visited, val);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(1).add(0);
        adj.get(1).add(2);
        adj.get(1).add(4);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(0);
        adj.get(3).add(2);
        adj.get(4).add(1);
        adj.get(4).add(5);
        adj.get(5).add(4);

        PreOrderTraversalInUndirectedGraph Graph = new PreOrderTraversalInUndirectedGraph();
        ArrayList<Integer> result = Graph.dfsOfGraph(adj);
        System.out.println(result);
    }
}
