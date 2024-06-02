package PATTERN;
public class HollowSquareStarPattern {
    public static void main(String[] args) {
        int n=10;
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
                if ((i==0||i==n-1)) {
                    System.out.print("*");
                    continue;
                }
                if (j==0||j==n-1) {
                    System.out.print("*");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
