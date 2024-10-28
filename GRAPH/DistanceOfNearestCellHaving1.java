package GRAPH;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DistanceOfNearestCellHaving1 {
    private int [][] nearest(int [][] grid) {
        Queue<int []> queue = new LinkedList<>();
        int rowSize = grid.length;
        int colsSize = grid[0].length;
        boolean [][] visited = new boolean[rowSize][colsSize]; // Updated to use correct sizes
        int [][] result = new int[rowSize][colsSize];

        // Initialize the result array with -1 for unvisited cells
        for (int row = 0; row < rowSize; ++row) {
            for (int col = 0; col < colsSize; ++col) {
                if (grid[row][col] == 1) {
                    queue.add(new int[] {row, col, 0});
                    visited[row][col] = true;
                } else {
                    result[row][col] = -1; // Mark unvisited cells with -1
                }
            }
        }

        while (!queue.isEmpty()) {
            int [] cell = queue.poll();
            int row = cell[0], col = cell[1], steps = cell[2];

            // Update the result for the current cell
            result[row][col] = steps;

            // Check for left
            if (col > 0 && !visited[row][col - 1]) {
                visited[row][col - 1] = true;
                queue.add(new int [] {row, col - 1, steps + 1}); // Update steps
            }
            // Check for right
            if (col < colsSize - 1 && !visited[row][col + 1]) {
                visited[row][col + 1] = true;
                queue.add(new int [] {row, col + 1, steps + 1}); // Update steps
            }
            // Check for down
            if (row < rowSize - 1 && !visited[row + 1][col]) {
                visited[row + 1][col] = true;
                queue.add(new int [] {row + 1, col, steps + 1}); // Update steps
            }
            // Check for up
            if (row > 0 && !visited[row - 1][col]) {
                visited[row - 1][col] = true;
                queue.add(new int [] {row - 1, col, steps + 1}); // Update steps
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DistanceOfNearestCellHaving1 obj = new DistanceOfNearestCellHaving1();
        int [][] grid = {
                {0, 1, 1, 0},
                {1, 1, 0, 0},
                {0, 0, 1, 1}
        };
        int [][] res = obj.nearest(grid);
        for (int [] row : res) {
            System.out.println(Arrays.toString(row));
        }
    }
}
