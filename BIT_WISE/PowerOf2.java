package BIT_WISE;

public class PowerOf2 {
    static void BruteForceApproach(int n) {
        int count = 0;
        while (n > 0) {
            n = n >>> 1;
            if ((n & 1) == 1)
                count++;
        }
        if (count == 1)
            System.out.println("Yes");
        else System.out.println("No");
    }

    static boolean MoreEffcient(int n) {
        if (n <= 0)
            return false;

        return (n & (n - 1)) == 0;
    }

    public static void main(String[] args) {
        int n = 1;
        BruteForceApproach(n);
        MoreEffcient(n);
    }
}
