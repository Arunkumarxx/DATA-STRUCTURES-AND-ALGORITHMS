package ARRAYS;

//rotation in matrix by row or column transpose of the matrix
// using extra space first
class transposeOfMatrixUsingExtraSpace {
    static void transpose(int matrixOriginal[][],int matrixDuplicate[][],int n) {
        for (int i =0; i<n; i++){
            for (int j=0;j<n;j++){
                matrixDuplicate[i][j]=matrixOriginal[j][i];
            }
        }
    }

    public static void main(String[] args) {
        int matrixOriginal[][]={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int matrixDuplicate[][]=new int[matrixOriginal.length][matrixOriginal.length];
        int n=matrixOriginal.length;
        System.out.println("Original Matrix");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrixOriginal[i][j]+" ");
            }
            System.out.println();
        }
        transpose(matrixOriginal,matrixDuplicate,n);
        System.out.println("Modified matrix ");
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matrixDuplicate[i][j]+" ");
            }
            System.out.println();
        }
    }
}
