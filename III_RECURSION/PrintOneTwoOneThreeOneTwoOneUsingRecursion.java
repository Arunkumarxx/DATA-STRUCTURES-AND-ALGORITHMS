package RECURSION;

public class PrintOneTwoOneThreeOneTwoOneUsingRecursion {
    static void Recursion(int n) {
        if (n == 0)
            return;
        Recursion(n - 1);
        System.out.println(n);
        Recursion(n - 1);
    }

    public static void main(String[] args) {
        Recursion(3);

    }
}
