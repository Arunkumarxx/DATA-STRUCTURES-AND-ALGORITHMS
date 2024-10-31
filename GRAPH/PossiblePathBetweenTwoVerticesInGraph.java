package GRAPH;

import java.util.*;

public class PossiblePathBetweenTwoVerticesInGraph {
    public int countPaths(int V, ArrayList<ArrayList<Integer>> adj, int source, int destination) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        int pathCount = 0;

        while (!queue.isEmpty()) {
            int node = queue.poll();

            if (node == destination) {
                pathCount++;
                continue;
            }

            for (Integer neighbor : adj.get(node)) {
                queue.add(neighbor);
            }
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
