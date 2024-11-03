package GRAPH;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MotherVertex {
    private int findMotherVertex(int V, ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] visited = new boolean[n];
        int lastVisited = -1;
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; ++i) {
            if (!visited[i]) {
                lastVisited = i;
                queue.add(i);
                visited[i] = true;
                while (!queue.isEmpty()) {
                    int curr = queue.poll();
                    for (Integer edges : adj.get(curr)) {
                        if (!visited[edges]) {
                            queue.add(edges);
                            visited[edges] = true;
                        }
                    }
                }
            }
        }
        visited = new boolean[n];
        queue.clear();
        queue.add(lastVisited);
        visited[lastVisited] = true;
        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (Integer edges : adj.get(curr)) {
                if (!visited[edges]) {
                    visited[edges] = true;
                    queue.add(edges);
                }
            }
        }
        for (boolean val : visited)
            if (!val)
                return -1;
        return lastVisited;
    }

    public static void main(String[] args) {
        MotherVertex obj = new MotherVertex();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(0);
        adj.get(2).add(1);
        adj.get(4).add(0);
        adj.get(4).add(2);

        System.out.println("Mother Vertex: " + obj.findMotherVertex(5, adj));
    }
}
