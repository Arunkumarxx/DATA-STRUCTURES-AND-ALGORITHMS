package GRAPH;

import java.util.*;

public class TopologicalSort {
    private ArrayList<Integer> topologicalSort(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        int[] degree = new int[adj.size()];
        for (int i = 0; i < n; ++i)
            for (Integer edges : adj.get(i))
                ++degree[edges];

        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < n; i++)
            if (degree[i] == 0)
                queue.add(i);

        ArrayList<Integer> result = new ArrayList<Integer>();
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            result.add(curr);
            for (int edge : adj.get(curr)) {
                --degree[edge];
                if (degree[edge] == 0)
                    queue.add(edge);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TopologicalSort obj = new TopologicalSort();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(5).add(2);
        adj.get(5).add(0);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(2).add(3);
        adj.get(3).add(1);

        ArrayList<Integer> result = obj.topologicalSort(adj);
        System.out.println("Topological Sort: " + result);
    }
}
