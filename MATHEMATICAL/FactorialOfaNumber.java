package MATHEMATICAL;

public class FactorialOfaNumber {
    static int recursion(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
        return n * recursion(n - 1);
    }

    static void Iterative(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static void main(String... args) {
        int n = 4;
//        System.out.println(recursion(n));
        Iterative(n);
    }
}
