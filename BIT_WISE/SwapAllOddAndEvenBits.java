package BIT_WISE;

public class SwapAllOddAndEvenBits {
    static void SwapAllOddAndEvenBitsOne() {
        //010111
        //101011
        //101011
        int n = 23;
        int Even = 0xAAAAAAAA;
        int Odd = 0x55555555;
        int x = n >>> 1;
        int y = n << 1;
        int x2 = x & Odd;
        int y2 = y & Even;
        System.out.println(x2 | y2);
    }

    public static void main(String[] args) {
        SwapAllOddAndEvenBitsOne();
    }
}
