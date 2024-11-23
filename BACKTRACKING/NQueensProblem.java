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
                checkAllPossibleWays(i,j,n);
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
                    ++totalQueens;
                    chessBoard[i][j]='♕';
                    fillQueensTrack(i,j,n);
                }
                else chessBoard[i][j]='.';
            }
        }
        if(totalQueens==n)
        {

            for(int i=0;i<n;++i)
            {
                System.out.println();
                for(int j=0;j<n;++j)
                {
                    if(chessBoard[i][j]=='\u0000')
                        System.out.print(" "+'.'+" ");
                    else
                    System.out.print(" "+chessBoard[i][j]+" ");
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

        // all possible ways of diagonal for queen
        {
            int i=row-1;
            int j=col-1;
            while (isValid(i, j, n))
            {
                chessBoardTrack[i][j] = true;
                i -= 1;
                j -= 1;
            }

            i=row-1;
            j=col+1;
            while(isValid(i,j,n))
            {
                chessBoardTrack[i][j]=true;
                i-=1;
                j+=1;
            }

            i=row+1;
            j=col-1;
            while(isValid(i,j,n))
            {
                chessBoardTrack[i][j]=true;
                i+=1;
                j-=1;
            }

            i=row+1;
            j=col+1;
            while(isValid(i,j,n))
            {
                chessBoardTrack[i][j]=true;
                i+=1;
                j+=1;
            }
        }
    }
    private boolean isValid(int x,int y,int n)
    {
        return x>=0 && y>=0 && x<n && y<n?true:false;
    }
    public static void main(String[] args)
    {
        int n=1;
        NQueensProblem queensProblem =new NQueensProblem();
        queensProblem.nQueensProblem(n);

    }

}
