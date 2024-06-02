package BIT_WISE;

public class LongestConsecutiveOnes {
    static int BruteForce(int n) {
        int count = 1;
        while (n > 0) {
            if ((n & (n << 1)) != 0) {
                count++;
            }
            n = (n & (n << 1));
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 222;
        int result = BruteForce(n);
        System.out.println(result);

    }
}
