package GRAPH;

import java.util.*;

public class PossiblePathBetweenTwoVerticesInGraph {
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{source, 0});
        boolean[] visited = new boolean[V];
        int pathCount = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int node = current[0];
            int distance = current[1];
            if (node == destination)
                pathCount++;
            visited[node] = true;
            for (Integer neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(new int[]{neighbor, distance + 1});
                }
            }

            visited[node] = false;
        }

        return pathCount;
    }

    public static void main(String[] args) {
        PossiblePathBetweenTwoVerticesInGraph obj = new PossiblePathBetweenTwoVerticesInGraph();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; ++i) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(4);
        adj.get(1).add(3);
        adj.get(1).add(4);
        adj.get(2).add(4);
        adj.get(3).add(2);
        adj.get(4).add(3);
        int source = 0;
        int destination = 4;
        System.out.println("Number of paths from " + source + " to " + destination + ": " + obj.countPaths(5, adj, source, destination));
    }
}
