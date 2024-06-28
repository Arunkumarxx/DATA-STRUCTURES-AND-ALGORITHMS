package RECURSION;
 class PowerOfNumbersUsingRecursion {
    public static long power(int N, int R) {
        int mod = 1000000007;
        if (R == 1) return N;
        if (R == 0) return 1;
        long val = power(N, R / 2);
        val =val*val % mod;
        if ((R&1) == 1)
            val = (val * N) % mod;
        return val;
    }
    public static void main(String[] args) {
        Recursion solution = new Recursion();
        int N = 2;
        int R = 10;
        System.out.println(power(N,R));
    }
}