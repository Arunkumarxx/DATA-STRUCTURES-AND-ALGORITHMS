package MATRIX;

public class ExchangeMatrixColumns {

    public static void main(String[] args) {
       int  matrix[][] = {
                       {4, 3, 2},
                       {1, 5, 6}
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
       for (int [] temp:matrix) {
           for (int x : temp)
               System.out.print(x + " ");
           System.out.println();
       }
    }

}
