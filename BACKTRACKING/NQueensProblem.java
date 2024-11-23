package BACKTRACKING;

import java.util.*;

class NQueens
{
    // Solution 1: Using Depth-First Search (DFS) and Validation
    public static List<List<String>> solveNQueensDFS(int n)
    {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> res = new ArrayList<>();
        dfs(0, board, res);
        return res;
    }

    static boolean validate(char[][] board, int row, int col)
    {
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0)
        {
            if (board[row][col] == '♕') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0)
        {
            if (board[row][col] == '♕') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length)
        {
            if (board[row][col] == '♕') return false;
            col--;
            row++;
        }
        return true;
    }

    static void dfs(int col, char[][] board, List<List<String>> res)
    {
        if (col == board.length)
        {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++)
        {
            if (validate(board, row, col))
            {
                board[row][col] = '♕';
                dfs(col + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    static List<String> construct(char[][] board)
    {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++)
        {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    // Solution 2: Using Boolean Arrays for Columns and Diagonals
    public List<List<String>> solveNQueensBoolean(int n)
    {
        List<List<String>> result = new ArrayList<>();
        boolean[] cols = new boolean[n];
        boolean[] diag1 = new boolean[2 * n - 1];
        boolean[] diag2 = new boolean[2 * n - 1];

        char[][] board = new char[n][n];
        for (char[] row : board)
        {
            Arrays.fill(row, '.');
        }

        placeQueens(0, n, board, cols, diag1, diag2, result);
        return result;
    }

    private void placeQueens(int row, int n, char[][] board, boolean[] cols, boolean[] diag1, boolean[] diag2, List<List<String>> result)
    {
        if (row == n)
        {
            addToList(board, result);
            return;
        }

        for (int col = 0; col < n; col++)
        {
            if (cols[col] || diag1[row - col + n - 1] || diag2[row + col])
            {
                continue;
            }

            board[row][col] = '♕';
            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = true;

            placeQueens(row + 1, n, board, cols, diag1, diag2, result);

            board[row][col] = '.';
            cols[col] = diag1[row - col + n - 1] = diag2[row + col] = false;
        }
    }

    private void addToList(char[][] board, List<List<String>> result)
    {
        List<String> solution = new ArrayList<>();
        for (char[] row : board)
        {
            solution.add(new String(row));
        }
        result.add(solution);
    }

    public static void main(String[] args)
    {
        NQueens obj = new NQueens();

        System.out.println("Solution 1: Using Depth-First Search (DFS) and Validation");
        List<List<String>> res1 = solveNQueensDFS(4);
        printSolution(res1);

        System.out.println("Solution 2: Using Boolean Arrays for Columns and Diagonals");
        List<List<String>> res2 = obj.solveNQueensBoolean(4);
        printSolution(res2);
    }

    public static void printSolution(List<List<String>> solution)
    {
        int i = 1;
        for (List<String> it : solution)
        {
            System.out.println("Arrangement " + i);
            for (String s : it)
            {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }
    }
}
