package MATRIX;

public class SearchInRowWiseAndColumnWiseSortedMatrix {
    static String  SearchElementBruteForce(int [][] matrix,int x) {
        int n=matrix.length;
        for (int i=0; i<n; i++){
            for (int j=0; j<matrix[0].length; j++)
            {
                if(matrix[i][j]==x) return i+""+j;
            }
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
      String res=  SearchElementBruteForce(matrix,29);
        System.out.println(res);
    }
}
