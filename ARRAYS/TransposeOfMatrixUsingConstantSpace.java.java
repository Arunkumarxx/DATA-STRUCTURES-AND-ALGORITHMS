package ARRAYS;

// rotation in matrix by row or column transpose of matrix
//using constant space
class TransposeOfMatrixUsingConstantSpace {
    static void transpose (int matrix[][],int n){
        for (int i=0; i<n; i++){
            for (int j=i; i<n; i++){
                int temp =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int matrix[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
         int n=matrix.length;
        System.out.println("Original matrix");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        transpose(matrix,n);
        System.out.println("Modified matrix ");
        for (int i =0; i<n; i++){
            for (int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
