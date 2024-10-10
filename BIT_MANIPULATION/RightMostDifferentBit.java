package BIT_WISE;

public class RightMostDifferentBit {
    static int RightMostDifferentBitOne(int m, int n) {
        int MXorN = m ^ n;
        int count = 0;
        if (n == m)
            return -1;

        while (MXorN > 0) {
            if ((MXorN & 1) == 1) {
                return count + 1;
            } else {
                count++;
                MXorN >>>= 1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int m = 52;
        int n = 4;
        int x = RightMostDifferentBitOne(m, n);
        System.out.println(x);
    }
}