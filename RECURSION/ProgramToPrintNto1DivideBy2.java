package RECURSION;

public class ProgramToPrintNto1DivideBy2 {
    static int Recursion(int n) {
        if (n == 1)
            return 0;
        return 1 + Recursion(n / 2);
    }

    public static void main(String[] args) {
        int x = Recursion(16);
        System.out.println(x);
        int j = 0;
        for (int i = 16; i > 1; i /= 2) {
            j++;
        }
        System.out.println(j);
    }
}
