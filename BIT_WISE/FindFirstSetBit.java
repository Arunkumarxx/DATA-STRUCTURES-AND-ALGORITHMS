package BIT_WISE;

public class FindFirstSetBit {
    static void BruteForce() {
        boolean bit = true;
        int count = 0;
        int n = 0;
        if (n == 0) {
            System.out.println(-1);
        }
        while (bit) {
            if (((n >> count) & 1) != 0) {
                bit = false;
            }
            count++;
        }
        System.out.println(count);
    }

    static int Effective(int n) {
        int pos = 1;
        int masked = 1;
        if (n == 0)
            return 0;

        while ((n & masked) == 0) {
            masked <<= 1;
            pos++;
        }
        return pos;
    }

    static void MoreEffective(int n) {
        int x = (int) (Math.log10(n ^ (n & (n - 1))) / Math.log10(2)) + 1;
        System.out.println(x);
    }

    public static void main(String[] args) {
        int n = 12;
        System.out.println(Effective(n));
    }
}