package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {

    public static void main(String[] args) {
        int [][] matrix ={
                       {1, 2, 3,},
                {5,6,7}
        };
        int n= matrix.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int k=0;
        for (int i=0; i<matrix[0].length-1; i++)
            arrayList.add(matrix[k][i]);

        for (int i=0; i<n-1;i++) {
            k=matrix[i].length-1;
            arrayList.add(matrix[i][k]);
        }
        k=matrix[n-1].length-1;
        for (;k>=1;k--)
        {
            arrayList.add(matrix[n-1][k]);
        }
        k=0;
        for ( int i=n-1; i>=1; i--)
            arrayList.add(matrix[i][0]);

        System.out.println(arrayList);
    }
}