package MATRIX;

public class SearchInRowWiseAndColumnWiseSortedMatrix {
    static String  SearchElementBruteForce(int [][] matrix,int x) {
        int n=matrix.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==x) return "("+i+","+j+")";
            }
        }
        return "-1";
    }
    static String SearchElementInMatrixEfficient(int [][] matrix,int x) {
        int k=0;
        int n=matrix.length;
        for (int j=n-1; j>=0 && k<n; j--)
        {
            if(matrix[k][j]==x)
                return "("+k+""+j+")";
        }
        return "-1";
    }
    public static void main(String[] args) {
        int [] [] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };
        System.out.println(SearchElementBruteForce(matrix,10));
        System.out.println(SearchElementInMatrixEfficient(matrix,29));
    }
}
