package PATTERN;

public class RectangleStarPattern {
    public static void main(String[] args) {
        int n=4;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
