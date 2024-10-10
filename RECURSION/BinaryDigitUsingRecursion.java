package RECURSION;

public class BinaryDigitUsingRecursion {

    static void Recursion(int n) {
        if (n == 0)
            return;
        Recursion(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        int n = 7;
        Recursion(n);
    }
}
