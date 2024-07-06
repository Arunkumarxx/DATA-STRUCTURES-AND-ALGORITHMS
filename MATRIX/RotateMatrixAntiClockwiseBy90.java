package MATRIX;

public class RotateMatrixAntiClockwiseBy90 {
    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n=matrix.length;
        int m=matrix[0].length;
        for (int i=0;  i<n; i++)
        {
            int start=0;
            int end=m-1;
            while(start<end)
            {
                int temp=matrix[i][start];
                matrix[i][start]=matrix[i][end];
                matrix[i][end]=temp;
            }
        }
        
    }
}
