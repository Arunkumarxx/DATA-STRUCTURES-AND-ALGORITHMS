package BIT_WISE;

public class CountSetBits {
    static void CountSetBits(int n) {
        int temp = 0;
        for (int i = n; i >= 1; i = i / 2) {
            if (i % 2 == 1) {
                temp++;
//                System?.out.print(i%2);
            }

        }
        System.out.println(temp);
    }

    static void CountSetBits2(int n) {
        int count = 0;
        while (n > 0) {
            n = n & n - 1;
            count++;
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        int n = 255;
        long c1 = System.currentTimeMillis();
        CountSetBits(n);
        CountSetBits2(n);
        long c11 = System.currentTimeMillis();

    }
}