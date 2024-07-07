package MATRIX;

public class MedianOfARowWiseSortedMatrixJava {
    static int MedianOfRowWiseSortedBruteForce(int [][] matrix) {
        int n= matrix.length;
        int m=matrix[0].length;
        int median=(n*m)/2;

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
                        if(matrix[k][s]<ele)
                            count++;
                        if(count>median)
                            break;
                    }
                    if(count>median)
                        break;

                }
                if(count==median)
                    return ele;
                if(count<median)
                    break;
            }
        }
        return -1;
    }
    static int MedianOfRowWiseSortedEfficient(int [][] matrix) {

    }
    public static void main(String[] args) {
        int [][] matrix ={
                {1,10,20},
                {15,25,35},
                {5,30,40}
        };
        System.out.println(MedianOfRowWiseSortedBruteForce(matrix));
    }
}