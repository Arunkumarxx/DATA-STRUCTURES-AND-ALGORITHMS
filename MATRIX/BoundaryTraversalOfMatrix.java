package MATRIX;

import java.util.ArrayList;

public class BoundaryTraversalOfMatrix {
    static ArrayList<Integer> PrintClockWise(int [][] matrix) {
        int n= matrix.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        if(n==1)
        {
            for(int []x:matrix)
                for(int y:x)
                    arrayList.add(y);
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
                       {1, 2, 3, 4 },
                       { 5, 6, 7, 8},
                       {9,10, 11,12},
                       {13,14,15,16}
        };
       ArrayList<Integer> arrayList =  PrintClockWise(matrix);
        System.out.println(arrayList);
    }
}