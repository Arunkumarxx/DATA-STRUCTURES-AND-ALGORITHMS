package PATTERN;

public class RhombusStarPattern {
    public static void main(String[] args) {
        int n=4;
        for (int i=0; i<n;i++){
            for (int j=0;j<i; j++){
                System.out.print(" ");
            }
            for (int k=0; k<n; k++)
                System.out.print("*");
            System.out.println();
        }
    }
}
