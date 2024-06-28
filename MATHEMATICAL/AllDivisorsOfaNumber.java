package MATHEMATICAL;

public class AllDivisorsOfaNumber {
    static void DivisorOfaNumber(int n) {
        int i = 0;
        for (i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        for (; i >= 1; i--) {
            if (n % i == 0 && i != n / i) {
                System.out.print(n / i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 100;
        DivisorOfaNumber(n);
    }
}