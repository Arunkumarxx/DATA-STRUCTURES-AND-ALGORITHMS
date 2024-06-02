package MATHEMATICAL;

public class GreatestCommonDivisor {
    static void GreatestCommonDivisor(int a, int b) {
        int ans = a > b ? a : b;
        while (ans > 0) {

            if (a % ans == 0 && b % ans == 0)

                break;

            ans--;
        }
        System.out.println(ans);
    }

    static int GreatestCommonDivisorEffcient(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a = 36;
        int b = 60;
        GreatestCommonDivisor(a, b);
        int res = GreatestCommonDivisorEffcient(a, b);
        System.out.println(res);

    }
}
