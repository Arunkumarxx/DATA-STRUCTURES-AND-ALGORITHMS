package MATRIX;

public class TransposeOfAMatrix {
    public static void main(String[] args) {
        int [][] matrix = {{1, 1, 1, 1},
                           {2, 2, 2, 2},
                           {3, 3, 3, 3},
                           {4, 4, 4, 4}};
        int n=matrix.length;
        for (int i=0; i<n; i++)
        {
            for (int j=0; j<matrix[i].length; j++)
            {
                if(i==j||i>j)
                    continue;
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int [] x:matrix) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
}
