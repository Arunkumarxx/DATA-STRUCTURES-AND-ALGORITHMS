package RECURSION;

public class PrintNtoOneUsingRecursion {
    static void Recursion(int n) {
        if (n == 0)
            return;
        System.out.print(n + " ");
        Recursion(n - 1);
    }

    public static void main(String[] args) {
        Recursion(5);
    }
}
