package MATRIX;

public class MedianOfARowWiseSortedMatrixJava {
    static int MedianOfRow(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int totalElements = n * m;
        int medianIndex = totalElements / 2;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int ele = matrix[i][j];
                int count = 0;

                for (int k = 0; k < n; k++) {
                    for (int s = 0; s < m; s++) {
                        if (matrix[k][s] < ele) {
                            count++;
                        }
                    }
                }

                if (count == medianIndex) {
                    return ele;
                }
            }
        }
        return -1; // This case should not occur if the matrix is non-empty and properly sorted.
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println(MedianOfRow(matrix)); // Expected output: 5
    }
}
