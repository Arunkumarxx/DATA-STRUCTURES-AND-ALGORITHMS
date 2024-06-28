package BIT_WISE;

public class BitDifference {
    static int BitDifferenceOne(int a, int b) {
        // Your code here
        int count = 0;
        int AXorB = a ^ b;
        while (AXorB > 0) {
            if ((AXorB & 1) == 1) {
                count++;

            }
            AXorB >>>= 1;

        }
        return count;
    }

    public static void main(String[] args) {
        int A = 20;
        int B = 25;
        int x = BitDifferenceOne(A, B);
        System.out.println(x);
    }
}