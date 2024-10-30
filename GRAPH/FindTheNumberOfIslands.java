package GRAPH;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheNumberOfIslands {
    private int numIsIslands(char[][] grid, int n, int m) {
        int rowSize = n;
        int colsSize = m;
        int res = 0;

        int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

        for (int row = 0; row < rowSize; ++row) {
            for (int col = 0; col < colsSize; ++col) {
                if (grid[row][col] == '1') {
                    res++;
                    Queue<int[]> queue = new LinkedList<>();
                    queue.add(new int[]{row, col});
                    grid[row][col] = '0'; // Mark as visited

                    while (!queue.isEmpty()) {
                        int[] curr = queue.poll();
                        int currX = curr[0];
                        int currY = curr[1];

                        for (int i = 0; i < 8; ++i) {
                            int newX = currX + dx[i];
                            int newY = currY + dy[i];

                            if (isValid(newX, newY, n, m) && grid[newX][newY] == '1') {
                                queue.add(new int[]{newX, newY});
                                grid[newX][newY] = '0'; // Mark as visited
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    private boolean isValid(int x, int y, int n, int m) {
        return x >= 0 && x < n && y >= 0 && y < m;
    }

    public static void main(String[] args) {
        char[][] grid = {
                {'0', '1', '1', '0'},
                {'0', '1', '1', '0'},
                {'0', '0', '1', '0'},
                {'0', '0', '0', '0'},
                {'1', '1', '0', '1'},
        };
        FindTheNumberOfIslands findTheNumberOfIslands = new FindTheNumberOfIslands();
        System.out.println(findTheNumberOfIslands.numIsIslands(grid, grid.length, grid[0].length));
    }
}
