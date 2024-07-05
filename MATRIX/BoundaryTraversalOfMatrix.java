package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {
    static ArrayList<Integer> PrintClockWise(int [][] matrix,int n,int m) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        if (n == 1) {
            for (int i = 0; i < m; i++) {
                arrayList.add(matrix[0][i]);
            }
            return arrayList;
        }


        if (m == 1) {
            for (int i = 0; i < n; i++) {
                arrayList.add(matrix[i][0]);
            }
            return arrayList;
        }


        for (int i = 0; i < m; i++)
            arrayList.add(matrix[0][i]);


        for (int i = 1; i < n; i++)
            arrayList.add(matrix[i][m - 1]);


        if (n > 1)
            for (int i = m - 2; i >= 0; i--)
                arrayList.add(matrix[n - 1][i]);


        if (m > 1)
            for (int i = n - 2; i > 0; i--)
                arrayList.add(matrix[i][0]);

        
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