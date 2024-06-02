package MATHEMATICAL;

public class AdditionUnderModulo {
    public static void main(String[] args) {
        long a = 1000000007;
        long b = 1000000007;
        long mod = 10 ^ 9 + 7;
        long ans = ((a % mod) + (b % mod)) % mod;
        System.out.println(ans);
    }
}
