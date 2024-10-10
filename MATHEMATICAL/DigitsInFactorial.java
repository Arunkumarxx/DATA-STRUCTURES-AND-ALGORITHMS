package MATHEMATICAL;

public class DigitsInFactorial {
    public static void main(String[] args) {
        // code here
        int n = 5;
        int Fac = 1;
        for (int i = 1; i <= n; i++) {
            Fac *= i;
        }
        int res = 0;
        while (Fac > 0) {
            Fac = Fac / 10;
            res++;
        }
        System.out.println(res);
    }
}
