package GRAPH;

import java.util.ArrayList;
import java.util.List;

public class PrintAdjacencyList {
    List<List<Integer>> adjacent;

    private void createAdjacent(int vertices) {
        adjacent = new ArrayList<>();
        for (int i = 0; i < vertices; ++i) {
            adjacent.add(new ArrayList<Integer>());
        }
    }

    public List<List<Integer>> printGraph(int vertices, int edges[][]) {
        if (adjacent == null || adjacent.size() != vertices)
            createAdjacent(vertices);
        for (int rows = 0; rows < edges.length; ++rows)
            addAdjacent(edges[rows][0], edges[rows][1]);
        return adjacent;
    }

    private void addAdjacent(int s, int d) {
        adjacent.get(s).add(d);
        adjacent.get(d).add(s);
    }

    public static void main(String[] args) {
        PrintAdjacencyList obj = new PrintAdjacencyList();
        int vertices = 5;
        int[][] edges = {{0, 1}, {0, 4}, {1, 2}, {1, 3}, {1, 4}, {2, 3}, {3, 4}};
        List<List<Integer>> adjacencyList = obj.printGraph(vertices, edges);
        for (int i = 0; i < adjacencyList.size(); ++i) {
            System.out.print(i + ": ");
            for (int j = 0; j < adjacencyList.get(i).size(); ++j) {
                System.out.print(adjacencyList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
