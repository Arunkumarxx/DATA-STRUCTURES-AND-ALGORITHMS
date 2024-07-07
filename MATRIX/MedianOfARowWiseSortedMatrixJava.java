package MATRIX;

public class MedianOfARowWiseSortedMatrixJava {
    public static void main(String[] args) {
        int [][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n= matrix.length;
        int m=matrix[0].length-1;
        int median=matrix.length/2;
        for (int i=0; i<n; i++)
        {

            for (int j=m-1; j>=0; j--)
            {
                int count=0;
                int ele=matrix[i][j];
                for (int k=0; k<n; k++)
                {
                    for (int s=0; s<matrix[k].length; s++)
                    {
                        if(matrix[i][j]<ele)
                            count++;
                    }

                }
            }
        }
    }
}