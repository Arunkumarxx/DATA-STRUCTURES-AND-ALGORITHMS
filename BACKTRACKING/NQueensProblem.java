package BACKTRACKING;

import java.util.*;

public class NQueensProblem {
    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List<List<String>> res = new ArrayList<>();
        dfs(0, board, res);
        return res;
    }

    static boolean validate(char[][] board, int row, int col) {
        int duprow = row;
        int dupcol = col;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0) {
            if (board[row][col] == 'Q') return false;
            col--;
        }

        row = duprow;
        col = dupcol;
        while (col >= 0 && row < board.length) {
            if (board[row][col] == 'Q') return false;
            col--;
            row++;
        }
        return true;
    }

    static void dfs(int col, char[][] board, List<List<String>> res) {
        if (col == board.length) {
            res.add(construct(board));
            return;
        }

        for (int row = 0; row < board.length; row++) {
            if (validate(board, row, col)) {
                board[row][col] = 'Q';
                dfs(col + 1, board, res);
                board[row][col] = '.';
            }
        }
    }

    static List<String> construct(char[][] board) {
        List<String> res = new LinkedList<>();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }

    public static void main(String args[]) {
        int n = 4; // Change this value for different board sizes
        List<List<String>> solutions = solveNQueens(n);
        int count = 1;

        for (List<String> solution : solutions) {
            System.out.println("Solution " + count + ":");
            printChessBoard(solution);
            System.out.println();
            count++;
        }
    }

    static void printChessBoard(List<String> solution) {
        for (int i = 0; i < solution.size(); i++) {
            for (int j = 0; j < solution.get(i).length(); j++)
                if (solution.get(i).charAt(j) == 'Q')
                    System.out.print("♛ ");
                 else
                if ((i + j) % 2 == 0)
                    System.out.print("\u001B[47m    \u001B[0m");
                 else
                    System.out.print("\u001B[40m    \u001B[0m");
            System.out.println();
        }
    }
}
