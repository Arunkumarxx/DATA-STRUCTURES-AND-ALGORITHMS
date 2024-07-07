package MATRIX;

public class MedianOfARowWiseSortedMatrixJava {
    static int MedianOfRow(int [][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;
        int median=(n*m)/2;
        for (int i=0; i<n; i++)
        {

            for (int j=0; j<m; j++)
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
                if(count==median)
                    return ele;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [][] matrix ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(MedianOfRow(matrix));
    }
}