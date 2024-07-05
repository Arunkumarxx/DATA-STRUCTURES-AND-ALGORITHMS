package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {
    static ArrayList<Integer> PrintClockWise(int [][] matrix) {
        int n= matrix.length;

        ArrayList<Integer> arrayList = new ArrayList<>();
        if(n==1)
        {
            for(int i=0; i<matrix[0].length;i++)
                arrayList.add(matrix[0][i]);
            return arrayList;
        }
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
        return arrayList;
    }

    public static void main(String[] args) {
        int [][] matrix ={
                       {3,8,2}
        };
       ArrayList<Integer> arrayList =  PrintClockWise(matrix);
        System.out.println(arrayList);
    }
}