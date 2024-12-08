package GRAPH;

import java.util.*;

public class TopologicalSort {
    private ArrayList<Integer> topologicalSortBreathFirstSearch(ArrayList<ArrayList<Integer>> adj) {
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
    private void topologicalSortDepthFirstSearch(ArrayList<ArrayList<Integer>> adj)
    {
        int n=adj.size();
        boolean [] visited = new boolean[n];
        Stack<Integer> result =new Stack<>();
        for(int i=0;i<n;++i)
        {
            if(!visited[i])
            {
                depthFirstSearch(adj,result,visited,i);
            }
        }
        while(!result.isEmpty())
        {
            System.out.print(result.peek()+" ");
            result.pop();
        }
        System.out.println();
    }
    private void depthFirstSearch(ArrayList<ArrayList<Integer>> adj,Stack<Integer> result,boolean [] visited,int source)
    {
        visited[source]=true;
        for(int edges:adj.get(source))
        {
            if(!visited[edges])
            depthFirstSearch(adj, result, visited, edges);
        }
        result.push(source);
    }

    public static void main(String[] args) {
        TopologicalSort obj = new TopologicalSort();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            adj.add(new ArrayList<Integer>());
        }
        adj.get(6).add(4);
        adj.get(6).add(5);
        adj.get(5).add(4);
        adj.get(4).add(0);
        adj.get(4).add(2);
        adj.get(2).add(3);
        adj.get(0).add(1);
        adj.get(1).add(3);

        ArrayList<Integer> result = obj.topologicalSortBreathFirstSearch(adj);
        obj.topologicalSortDepthFirstSearch(adj);
        System.out.println("Topological Sort: " + result);
    }
}
