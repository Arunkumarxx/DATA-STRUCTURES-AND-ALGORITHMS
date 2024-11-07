package GRAPH;

import java.util.*;

public class MinimumSpanningTree {
    private int spanningTree(int v, int e, List<List<int[]>> adj) {
        boolean[] visited = new boolean[v];
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[0], b[0]));
        int sum = 0;
        minHeap.add(new int[]{0, 0});
        while (!minHeap.isEmpty()) {
            int[] edge = minHeap.poll();
            int weight = edge[0];
            int node = edge[1];

            if (visited[node])
                continue;

            visited[node] = true;
            sum += weight;
            for (int[] neighbor : adj.get(node)) {
                int neighborNode = neighbor[0];
                int neighborWeight = neighbor[1];

                if (!visited[neighborNode])
                    minHeap.add(new int[]{neighborWeight, neighborNode});
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        MinimumSpanningTree obj = new MinimumSpanningTree();
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(new int[]{1, 2});
        adj.get(0).add(new int[]{3, 6});
        adj.get(1).add(new int[]{0, 2});
        adj.get(1).add(new int[]{2, 3});
        adj.get(1).add(new int[]{3, 8});
        adj.get(1).add(new int[]{4, 5});
        adj.get(2).add(new int[]{1, 3});
        adj.get(2).add(new int[]{4, 7});
        adj.get(3).add(new int[]{0, 6});
        adj.get(3).add(new int[]{1, 8});
        adj.get(4).add(new int[]{1, 5});
        adj.get(4).add(new int[]{2, 7});

        System.out.println("Minimum Spanning Tree Cost: " + obj.spanningTree(5, 7, adj));
    }
}
