package MATHEMATICAL;

public class lowestCommonMultiple {
    static void LowestCommonMultiple(int a, int b) {
        int max = a > b ? a : b;
        int lcm = 0;
        while (true) {
            if (max % a == 0 && max % b == 0) {
                lcm = max;
                break;
            }
            max++;
        }
        System.out.println(lcm);

    }

    public static void main(String[] args) {
        int a = 4;
        int b = 6;
        LowestCommonMultiple(a, b);
    }
}
