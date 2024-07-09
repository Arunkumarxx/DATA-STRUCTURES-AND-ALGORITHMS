package MATRIX;

public class BooleanMatrix {
    public static void main(String[] args) {
     int    matrix[][] = {
             { 1, 0, 0},
             { 1, 0, 0},
             { 1, 0, 0},
             { 0, 0, 0}
     };
       int n=matrix.length;
       boolean []  row= new boolean[n];
       boolean [] col = new boolean[matrix[0].length];
       for (int i=0; i<n; i++)
       {
           for (int j=0; j<matrix[0].length; j++)
           {
               if(matrix[i][j]==1)
               {
                   row[i]=true;
                   col[j]=true;
               }
           }
       }
       for (int i=0; i<n ;i++)
       {
           for (int j=0; j<matrix[0].length; j++)
           {
               if(row[i]||col[j])
                   matrix[i][j]=1;
           }
       }
        for (int [] x:matrix) {
            for (int y : x)
                System.out.print(y + " ");
            System.out.println();
        }
    }
}
