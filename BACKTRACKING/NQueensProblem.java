package BACKTRACKING;

import java.util.*;
public class NQueensProblem
{
    public static List < List < String >> solveNQueens(int n) {
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                board[i][j] = '.';
        List < List < String >> res = new ArrayList < List < String >> ();
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

    static void dfs(int col, char[][] board, List < List < String >> res) {
        if (col == board.length)
        {
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
    static List < String > construct(char[][] board) {
        List < String > res = new LinkedList < String > ();
        for (int i = 0; i < board.length; i++) {
            String s = new String(board[i]);
            res.add(s);
        }
        return res;
    }
    public static void main(String args[]) {
        int N = 4;
        List < List < String >> queen = solveNQueens(N);
        int i = 1;
        for (List < String > it: queen)
        {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }

    }


    class Solution
    {
        List<List<String>> result=new ArrayList<>();
        boolean[] cols;
        boolean[] diag1;
        boolean[] diag2;

        public List<List<String>> solveNQueens(int n)
        {
            cols=new boolean[n];
            diag1=new boolean[2*n-1];
            diag2=new boolean[2*n-1];

            char[][] board=new char[n][n];
            for(char[] row:board)
            {
                Arrays.fill(row, '.');
            }

            placeQueens(0, n, board);
            return result;
        }

        private void placeQueens(int row, int n, char[][] board)
        {
            if(row==n)
            {
                addToList(board);
                return;
            }

            for(int col=0;col<n;col++)
            {
                if(cols[col]||diag1[row-col+n-1]||diag2[row+col])
                {
                    continue;
                }

                board[row][col]='Q';
                cols[col]=diag1[row-col+n-1]=diag2[row+col]=true;

                placeQueens(row+1, n, board);

                board[row][col]='.';
                cols[col]=diag1[row-col+n-1]=diag2[row+col]=false;
            }
        }

        private void addToList(char[][] board)
        {
            List<String> solution=new ArrayList<>();
            for(char[] row:board)
            {
                solution.add(new String(row));
            }
            result.add(solution);
        }
    }

}