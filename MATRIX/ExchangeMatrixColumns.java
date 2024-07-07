package MATRIX;

public class ExchangeMatrixColumns {

    public static void main(String[] args) {
       int  matrix[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15,16}
       };
       int n= matrix.length;
       int m1= matrix[0].length-1;
       int i=0;
       while(i<n)
       {
           int temp=matrix[i][0];
           matrix[i][0]=matrix[i][m1];
           matrix[i][m1]=temp;
           i++;
       }

    }

}
