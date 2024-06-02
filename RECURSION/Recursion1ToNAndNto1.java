package RECURSION;

public class Recursion1ToNAndNto1 {
    static void Recursion(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        Recursion(n - 1);
        System.out.print(n + " ");
    }
    public static void main(String[] args) {
        Recursion(3);
    }
}
