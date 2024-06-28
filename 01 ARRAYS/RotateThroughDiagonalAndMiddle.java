package ARRAYS;

class RotateThroughDiagonalAndMiddle {
     static void RotateThroughDiagonal_Middle(int matrix[][],int n){
         // rotate through diagonal
         //matrix[0][1]=matrix[1][0] 
         //matrix[0][2]=matrix[2][0]
         //matrix[1][2]=matrix[2][1] 
         for (int i=0; i<n; i++){
             for (int j=0;j<i;j++){
                 int temp=matrix[i][j];
                 matrix[i][j]=matrix[j][i];
                 matrix[j][i]=temp;
             }
         }
         //rotate through middle
         //matrix[0][0]=matrix[0][2]n-1
         //matrix[1][0]=matrix[1][2]n-1
         //matrix[2][0]=matrix[2][2]n-1
         //       i  j         i  n-1-j
         // Here i use -j because what suppose we have 5*5 matrix
         // show that coming left is  necessary
         int cycles = n/2;
         for (int i =0; i< n; ++i){
             for (int j=0; j< cycles; j++){
                 int temp=matrix[i][j];
                 matrix[i][j]=matrix[i][(n-1)-j];
                 matrix[i][(n-1)-j]=temp;
             }
         }
     }
     public static void main(String[] args) {
         int matrix[][] = {
                 {1, 2, 3},
                 {4, 5, 6},
                 {7, 8, 9}
         };
         int n = matrix.length;
         RotateThroughDiagonal_Middle(matrix, n);
         for (int i = 0; i < matrix.length; i++) {
             for (int j = 0; j < matrix[i].length; j++) {
                 System.out.print(matrix[i][j]);
             }
             System.out.println();
         }
     }
}
