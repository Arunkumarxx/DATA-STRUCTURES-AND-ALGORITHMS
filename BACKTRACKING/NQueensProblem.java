package BACKTRACKING;

public class NQueensProblem
{

    boolean [][] chessBoardTrack ;
    char [][] chessBoard;

    private void nQueensProblem(int n)
    {
        for(int i=0;i<n;++i)
        {
            for(int j=0;j<n;++j)
            {
            }
        }
    }
    private void checkAllPossibleWays(int row,int col,int n)
    {
        int totalQueens=0;
        chessBoardTrack= new boolean[n][n];
        chessBoard =new char[n][n];
        for(int i=row;i<n;++i)
        {
            for(int j=(i==row?col:0);j<n;++j)
            {
                if(!chessBoardTrack[i][j])
                {
                    chessBoard[i][j]='Q';
                    fillQueensTrack(i,j,n);
                }
            }
        }
    }
    private void fillQueensTrack(int row,int col,int n)
    {
        // top to bottom
        for(int i=0;i<n;++i)
            chessBoardTrack[i][col]=true;

        // left to right
        for(int j=0;j<n;++j)
            chessBoardTrack[row][j]=true;

        // diagonal top left to right bottom
    }
    public static void main(String[] args)
    {
        int n=4;

    }

}
