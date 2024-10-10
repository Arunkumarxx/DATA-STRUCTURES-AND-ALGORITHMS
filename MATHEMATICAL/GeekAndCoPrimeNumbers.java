package MATHEMATICAL;

public class GeekAndCoPrimeNumbers {
    public static void main(String[] args) {
        int N=6;
        int M=5;
        long divisor=Math.max(N,M);
        long n=N/divisor;
        long m=M/divisor;
        System.out.println(n);
        System.out.println(m);
        System.out.println(n+m);

    }
}
