package GRAPH;

import java.util.*;

public class DetectCycleInUndirectedGraph {
    private boolean isCycle(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                Queue<int[]> queue = new LinkedList<>();
                queue.add(new int[]{i, -1});
                visited[i] = true;
                while (!queue.isEmpty()) {
                    int[] curr = queue.poll();
                    int src = curr[0];
                    int parent = curr[1];
                    for (Integer newSrc : adj.get(src)) {
                        if (visited[newSrc] && parent != newSrc)
                            return true;
                        if (!visited[newSrc]) {
                            queue.add(new int[]{newSrc, src});
                            visited[newSrc] = true;
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        DetectCycleInUndirectedGraph obj = new DetectCycleInUndirectedGraph();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(0);
        adj.get(1).add(3);
        adj.get(2).add(0);
        adj.get(2).add(3);
        adj.get(3).add(1);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(3);

        System.out.println("Cycle detected: " + obj.isCycle(adj));
    }
}
