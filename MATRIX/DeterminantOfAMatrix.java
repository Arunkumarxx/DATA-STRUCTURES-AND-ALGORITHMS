package MATRIX;

public class DeterminantOfAMatrix {
     static void getCofactor(int[][] matrix, int[][] temp, int p, int q, int n) {
        int i = 0, j = 0;

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (row != p && col != q) {
                    temp[i][j++] = matrix[row][col];

                    if (j == n - 1) {
                        j = 0;
                        i++;
                    }
                }
            }
        }
    }

    public static int determinantOfMatrix(int[][] matrix, int n) {
        if (n == 1) {
            return matrix[0][0];
        }

        int determinant = 0;
        int sign = 1;

        int[][] temp = new int[n][n];

        for (int f = 0; f < n; f++) {
            getCofactor(matrix, temp, 0, f, n);
            determinant += sign * matrix[0][f] * determinantOfMatrix(temp, n - 1);
            sign = -sign;
        }

        return determinant;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 0, 2, -1},
                {3, 0, 0, 5},
                {2, 1, 4, -3},
                {1, 0, 5, 0}
        };
        int n1 = 4;
        System.out.println("Determinant of the matrix is: " + determinantOfMatrix(matrix1, n1));
    }
}
