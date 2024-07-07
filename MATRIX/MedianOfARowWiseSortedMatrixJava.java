package MATRIX;

public class MedianOfARowWiseSortedMatrixJava {
    public static void main(String[] args) {
        int [][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n= matrix.length;
        int m=matrix[0].length;
        int median=matrix.length/2;
        for (int i=0; i<n; i++)
        {
            int count=0;
            for (int j=m; j>=0; j--)
            {
                int ele=matrix[i][j];
                for (int k=0; k<n; k++)
                {
                    for (int s=0; s<matrix[k].length; s++)
                    {
                        if(count>n/2)
                            break;
                        if(matrix[i][j]<ele)
                            count++;

                    }
                }
            }
        }
    }
}