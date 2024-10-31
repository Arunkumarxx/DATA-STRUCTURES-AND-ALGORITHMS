package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInAnUnweightedGraph {
    ArrayList<ArrayList<Integer>> adj;

    ShortestPathInAnUnweightedGraph(int vertices) {
        adj = new ArrayList<>();
        for (int i = 0; i < vertices; ++i)
            adj.add(new ArrayList<>());
    }

    private void addAdjacency(int source, int destination) {
        adj.get(source).add(destination);
        adj.get(destination).add(source);
    }

    private void print() {
        for (int i = 0; i < adj.size(); ++i) {
            if (!adj.get(i).isEmpty()) {
                System.out.print(i + " -> ");
                for (Integer val : adj.get(i)) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }

    private void ShortestPath(int source, int destination) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        int[] parent = new int[n];  // To track the path

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;  // Source node has no parent

        boolean found = false;

        while (!queue.isEmpty()) {
            int src = queue.poll();

            if (src == destination) {
                found = true;
                break;
            }

            for (Integer neighbor : adj.get(src)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    parent[neighbor] = src;  // Set parent for path reconstruction
                }
            }
        }

        if (found) {
            System.out.println("Shortest path from " + source + " to " + destination + ":");
            printPath(parent, destination);
        } else {
            System.out.println("No path exists from " + source + " to " + destination);
        }
    }

    private void printPath(int[] parent, int destination) {
        if (destination == -1) return;
        printPath(parent, parent[destination]);
        System.out.print(destination + " ");
    }

    public static void main(String[] args) {
        ShortestPathInAnUnweightedGraph graph = new ShortestPathInAnUnweightedGraph(10);
        graph.addAdjacency(1, 2);
        graph.addAdjacency(1, 0);
        graph.addAdjacency(0, 3);
        graph.addAdjacency(3, 7);
        graph.addAdjacency(3, 4);
        graph.addAdjacency(7, 4);
        graph.addAdjacency(7, 6);
        graph.addAdjacency(4, 6);
        graph.addAdjacency(4, 5);
        graph.addAdjacency(5, 6);

        graph.ShortestPath(0, 7);
    }
}
