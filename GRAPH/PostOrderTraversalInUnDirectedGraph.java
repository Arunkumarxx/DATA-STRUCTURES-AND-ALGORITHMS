package GRAPH;

import java.util.ArrayList;

public class PostOrderTraversalInUnDirectedGraph {

    ArrayList<Integer> result = new ArrayList<>();

    public ArrayList<Integer> postOrderTraversal(ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[adj.size()];
        for (int i = 0; i < adj.size(); i++) {
            if (!visited[i]) {
                postOrderDFS(adj, visited, i);
            }
        }
        return result;
    }

    private void postOrderDFS(ArrayList<ArrayList<Integer>> adj, boolean[] visited, int source) {
        visited[source] = true;
        for (Integer val : adj.get(source)) {
            if (!visited[val]) {
                postOrderDFS(adj, visited, val);
            }
        }
        result.add(source);
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
     

        PostOrderTraversalInUnDirectedGraph obj = new PostOrderTraversalInUnDirectedGraph();
        ArrayList<Integer> result = obj.postOrderTraversal(adj);

        System.out.println(result);
    }
}
