package BIT_WISE;

public class CheckWhetherKThBitIsSetOrNot {

    static void CheckWhetherKthBitIsSetOrNot2(int n, int k) {
        if (((n & 1 << k) != 0)) {
            System.out.println("Yes");
        } else System.out.println("No");
    }

    public static void main(String[] args) {
        int n = 4;//100
        int k = 2;//001
        CheckWhetherKthBitIsSetOrNot2(n, k);
        System.out.println("Welcome");
        for (int i = 0; i <= 10; i++) {

        }


    }
}
