package BIT_WISE;

public class NumberIsSparseOrNot {
    static boolean NumberIsSparseOrNot(int n) {
        return (n & n << 1) == 0;


    }

    public static void main(String[] args) {
        int n = 2;
        boolean res = NumberIsSparseOrNot(n);
        System.out.println(res ? 1 : 0);
    }
}
