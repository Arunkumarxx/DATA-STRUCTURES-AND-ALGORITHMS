package BIT_WISE;

public class CountTotalSetBits {
    static int CountTotalSetBits(int n) {
        if (n == 0)
            return 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            int x = i;
            while (x > 0) {
                if ((x & 1) == 1) {
                    count++;
                }
                x /= 2;
            }
        }
        return count;
    }

    static void CountTotalSetBitsTwo() {

    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(CountTotalSetBits(n));
        System.out.println(CountTotalSetBits(n));

    }
}
