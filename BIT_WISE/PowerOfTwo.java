package BIT_WISE;

public class PowerOfTwo {
    static boolean PowerOfTwo(int n) {
        if (n == 0)
            return false;
        for (int i = n; i >= 2; i = i / 2) {

            if (i % 2 != 0) {
                return false;
            }
        }
        return true;
    }

    static boolean PowerOfTwo2(int n) {
        if (n == 0)
            return false;

        return ((n & (n - 1)) == 0);
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(PowerOfTwo2(n));
        //0000010011010101
        //0000010011010100
    }
}
