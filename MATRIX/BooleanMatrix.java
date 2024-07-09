package MATRIX;

public class BooleanMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 0, 0},
                { 1, 0, 0},
                { 1, 0, 0},
                { 0, 0, 0},
                { 0, 1, 0}
        };
        int n=matrix.length;
        boolean [] truthy =  new boolean [n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<matrix[i].length; j++)
            {
                if(matrix[i][j]==1){
                    truthy[i]=true;
                    break;
                }
            }
        }
        for (boolean x:truthy)
            System.out.print(x+" ");
        
    }
}
