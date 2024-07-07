package MATRIX;

public class SumOfUpperAndLowerTriangles {

    public static void main(String[] args) {
        int [][] matrix ={
                {6,5,4},
                {1,2,5},
                {7,8,7}
        };
        int n=matrix.length;
        for (int i =0; i<n; i++)
        {
            for (int j=i+1; j< matrix[i].length; j++)
            {
                    System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

}
