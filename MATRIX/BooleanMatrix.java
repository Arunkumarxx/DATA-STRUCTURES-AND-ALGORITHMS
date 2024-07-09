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
        for (int i=0; i<n;i++)
        {
            if(truthy[i]==true) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j]=1;
                }
            }
            else matrix[i][0]=1;
        }
        
    }
}
