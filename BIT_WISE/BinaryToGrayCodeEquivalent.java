package BIT_WISE;

public class BinaryToGrayCodeEquivalent {
    static int BinaryToGrayCode(int n) {
        return (n >> 1) & n;
    }

    public static void main(String[] args) {
        int n = 7;
        int x = BinaryToGrayCode(n);
        System.out.println(Integer.toBinaryString(x));
    }
}
