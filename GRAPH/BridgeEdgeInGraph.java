package GRAPH;

import java.util.*;

public class BridgeEdgeInGraph {
    static void DFS(int s, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[s]=true;
        for(int u:adj.get(s)) {
            if(!visited[u]) {
                DFS(u, adj, visited);
            }
        }
    }
    static int isBridge(int V, ArrayList<ArrayList<Integer>> adj, int c, int d) {
        if(c>=V && d>=V && c<0 && d<0) {
            return 0;
        }
        boolean[] visited=new boolean[V];
        int count=0;

        for(int i=0;i<V;i++) {
            if(!visited[i]) {
                count++;
                DFS(i, adj, visited);
            }
        }
        adj.get(c).remove(Integer.valueOf(d));
        adj.get(d).remove(Integer.valueOf(c));
        Arrays.fill(visited,false);
        int count2=0;
        for(int i=0;i<V;i++) {
            if(!visited[i]) {
                DFS(i, adj, visited);
                count2++;
            }
            if(count2>count)
                return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        BridgeEdgeInGraph obj=new BridgeEdgeInGraph();
        int V=5;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        adj.get(3).add(4);
        adj.get(4).add(3);
        int c=1, d=2;
        System.out.println("Is edge ("+c+", "+d+") a bridge: "+obj.isBridge(V, adj, c, d));
    }
}
