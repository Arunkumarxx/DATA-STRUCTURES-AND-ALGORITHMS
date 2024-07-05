package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {
    static ArrayList<Integer> PrintClockWise(int [][] matrix,int n,int m) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        // If there is only one row, return that row
        if (n == 1) {
            for (int i = 0; i < m; i++) {
                arrayList.add(matrix[0][i]);
            }
            return arrayList;
        }

        // If there is only one column, return that column
        if (m == 1) {
            for (int i = 0; i < n; i++) {
                arrayList.add(matrix[i][0]);
            }
            return arrayList;
        }

        // Traverse the top row
        for (int i = 0; i < m; i++) {
            arrayList.add(matrix[0][i]);
        }

        // Traverse the right column
        for (int i = 1; i < n; i++) {
            arrayList.add(matrix[i][m - 1]);
        }

        // Traverse the bottom row
        if (n > 1) { // Ensure we are not traversing the same row twice
            for (int i = m - 2; i >= 0; i--) {
                arrayList.add(matrix[n - 1][i]);
            }
        }

        // Traverse the left column
        if (m > 1) { // Ensure we are not traversing the same column twice
            for (int i = n - 2; i > 0; i--) {
                arrayList.add(matrix[i][0]);
            }
        }

        return arrayList;
    }

    public static void main(String[] args) {
        int [][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
       ArrayList<Integer> arrayList =  PrintClockWise(matrix,matrix.length,matrix[0].length);
        System.out.println(arrayList);
    }
}