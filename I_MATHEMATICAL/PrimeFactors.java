package MATHEMATICAL;

public class PrimeFactors {
    static void PrimeFactor(int n) {
        int i = 2;
        while (n > 1) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n /= i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        int n = 23;
        int d = 2;
        PrimeFactor(n);

    }
}