package MATRIX;

public class MakeMatrixBeautiful {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 2},
                {3, 4}
        };
        int n= matrix.length;
        int [] row=new int[n];
        int [] cols = new int[matrix[0].length];
        // row max value
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
            {
                row[i]+=matrix[i][j];
            }
        }
        int i=0;
        int j=0;
        while(i<matrix[0].length && j<n)
        {
            
        }
    }
}
