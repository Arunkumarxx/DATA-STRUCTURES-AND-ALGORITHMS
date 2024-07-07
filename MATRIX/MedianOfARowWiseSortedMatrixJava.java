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
    static int MedianOfRowWiseSortedEfficient(int [][] matrix, int r,int c) {
        // pick smallest element
        int n= matrix.length;

        int min=matrix[0][0];

        int max=matrix[0][0];
        // find smallest element in matrix
        for (int i=0; i<n;i++)
           min= Math.min(matrix[i][0],min);
        //find largest element in matrix
        for (int i=0; i<n;i++)
            max=Math.max(max,matrix[i][matrix[i].length-1]);

        //median =n*n/2 bcz consider matrix is odd dude.....
        int median=r*c;

        while(min<max)
        {
            int mid=(min+max)/2;
            for (int i=0;i<n; i++)
            {

            }
        }

        return -1;
    }
    static int countSmallestNumber(int [][] matrix,int mid) {
        int count=0;
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[0].length; j++) {
                if (matrix[i][j] <= mid) count++;
                else break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [][] matrix ={
                {1,10,20},
                {15,25,35},
                {5,30,40}
        };
        System.out.println(MedianOfRowWiseSortedBruteForce(matrix));
        System.out.println(MedianOfRowWiseSortedEfficient(matrix,matrix.length,matrix[0].length));
    }
}