package MATRIX;

import java.util.ArrayList;

public class PrintMatrixInSnakePattern {
    public static void main(String[] args) {
     int [][] matrix  ={
             {1,2,3},
             {4,5,6},
             {7,8,9}
     };
        int n= matrix.length;
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i=0; i<n; i++)
        {
            if((i&1)==0)
                for (int j = 0; j <matrix[i].length; j++)
                    arrayList.add(matrix[i][j]);
            if((i&1)==1) {
                for (int j = matrix[i].length-1; j>=i;j--)
                    arrayList.add(matrix[i][j]);
            }
        }
        System.out.println(arrayList);
    }
}
