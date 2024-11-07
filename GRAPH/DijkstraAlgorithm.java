package GRAPH;

import java.util.*;

public class DijkstraAlgorithm {
    private class iPair {
        int first, second;
        iPair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

   private ArrayList<Integer> dijkstra(ArrayList<ArrayList<iPair>> adj, int src) {
        ArrayList<Integer> result = new ArrayList<>();
        PriorityQueue<iPair> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a.second, b.second));
        int n = adj.size();
        boolean[] visited = new boolean[n];
        minHeap.add(new iPair(src, 0));
        int[] distance = new int[n];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[src] = 0;
        while (!minHeap.isEmpty()) {
            iPair curr = minHeap.poll();
            int node = curr.first;
            if (visited[node])
                continue;
            visited[node] = true;
            for (iPair pair : adj.get(node)) {
                int newNode = pair.first;
                int newWeight = pair.second;
                if (!visited[newNode] && distance[node] + newWeight < distance[newNode]) {
                    distance[newNode] = distance[node] + newWeight;
                    minHeap.add(new iPair(newNode, distance[newNode]));
                }
            }
        }
        for (int i = 0; i < distance.length; ++i)
            result.add(distance[i]);
        return result;
    }

    public static void main(String[] args) {
        DijkstraAlgorithm obj = new DijkstraAlgorithm();
        int V = 5;

        ArrayList<ArrayList<iPair>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        adj.get(0).add(obj.new iPair(1, 2));
        adj.get(0).add(obj.new iPair(4, 1));
        adj.get(1).add(obj.new iPair(2, 3));
        adj.get(4).add(obj.new iPair(2, 2));
        adj.get(4).add(obj.new iPair(3, 3));
        adj.get(2).add(obj.new iPair(3, 1));

        int source = 0;
        ArrayList<Integer> shortestPaths = obj.dijkstra(adj, source);
        System.out.println("Shortest paths from source " + source + ": " + shortestPaths);
    }
}
