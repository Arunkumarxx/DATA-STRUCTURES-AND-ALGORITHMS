package PATTERN;

public class HollowSquareStarPatternWithDiagonal {
    public static void main(String[] args) {
        int n=9;
        for (int i=1; i<=n; i++){
            for (int j=1;j<=n;j++){
//                    if(i==1||j==n-i+1||j==i||j==n||i==n||j==1)
                    if(i==1||i==n||j==1||j==n-i+1||i==j||j==n){
                 System.out.print("*");}
                    else System.out.print(" ");
            }

            System.out.println();
        }
    }
}
