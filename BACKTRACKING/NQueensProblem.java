package BACKTRACKING;

import java.util.*;
public class NQueensProblem
{
    List<List<String>> result =new ArrayList<>();
    boolean [][] chessBoardTrack ;
    boolean [][] chessBoard;
    public List<List<String>> solveNQueens(int n)
    {
        chessBoardTrack= new boolean [n][n];
        chessBoard= new boolean [n][n];
        for(int i=0;i<n;++i)
        {
            fillTracks(i,0,n,true);
            chessBoard[i][0]=true;
            NQueens(1,n);
            fillTracks(i,0,n,false);
            chessBoard[i][0]=false;
        }
        return result;
    }
    public void NQueens(int col,int n)
    {
        if(col==n)
        {
            addToList(n);
            return;
        }
        for(int i=0;i<n;++i)
        {
            if(!chessBoardTrack[i][col])
            {

                fillTracks(i,col,n,true);
                chessBoard[i][col]=true;

                NQueens(col+1,n);

                fillTracks(i,col,n,false);
                chessBoard[i][col]=false;
            }
        }
    }
    public void addToList(int n)
    {
        List<String> list =new ArrayList();

        for(int i=0;i<n;++i)
        {
            StringBuilder str =new StringBuilder();
            for(int j=0;j<n;++j)
            {
                if(chessBoard[i][j])
                    str.append('Q');
                else str.append('.');
            }
            list.add(str.toString());
        }
        result.add(list);
    }
    public void fillTracks(int row,int col,int n,boolean value)
    {
        for(int i=0;i<n;++i)
            chessBoardTrack[i][col]=value;

        for(int j=0;j<n;++j)
            chessBoardTrack[row][j]=value;

        int i=row-1;
        int j=col-1;
        while (isValid(i, j, n))
        {
            chessBoardTrack[i][j] = value;
            i -= 1;
            j -= 1;
        }

        i=row-1;
        j=col+1;
        while(isValid(i,j,n))
        {
            chessBoardTrack[i][j]=value;
            i-=1;
            j+=1;
        }

        i=row+1;
        j=col-1;
        while(isValid(i,j,n))
        {
            chessBoardTrack[i][j]=value;
            i+=1;
            j-=1;
        }

        i=row+1;
        j=col+1;
        while(isValid(i,j,n))
        {
            chessBoardTrack[i][j]=value;
            i+=1;
            j+=1;
        }
    }
    private boolean isValid(int x,int y,int n)
    {
        return x>=0 && y>=0 && x<n && y<n?true:false;
    }
    public static void main(String[] args)
    {
        int n=4;
        NQueensProblem queensProblem =new NQueensProblem();
        List<List<String>> result =queensProblem.solveNQueens(n);

    }
}



import java.util.*;
class TUF {
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
        for (List < String > it: queen) {
            System.out.println("Arrangement " + i);
            for (String s: it) {
                System.out.println(s);
            }
            System.out.println();
            i += 1;
        }

    }
}