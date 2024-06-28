package RECURSION;

public class PrintOneToNusingRecursion {
    static void Recursion(int n) {
        if (n == 0)
            return;

        Recursion(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        int n = 5;
        Recursion(n);
    }
}
