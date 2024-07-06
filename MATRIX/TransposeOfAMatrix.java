package MATRIX;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1, 1, 1, 1},
                           {2, 2, 2, 2},
                           {3, 3, 3, 3},
                           {4, 4, 4, 4}};

        int n=matrix.length;
        for (int i=0; i<n;i++)
        {
            int k=0;
            for (int j=0; j<matrix[i].length && k<n;j++)
            {
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][k];
                matrix[i][k]=temp;
            }
            k++;
        }
        for (int []y:matrix) {
            for (int x : y)
                System.out.print(x + " ");
            System.out.println();
        }
    }
}
