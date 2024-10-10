package RECURSION;

public class RecursionDirectAndInDirect {
    static void funOne() {
        System.out.println("FunOne");
        funTwo();
    }

    static void funTwo() {
        System.out.println("FunTwo");
    }

    static int Recursion(int n) {
        if (n == 0)
            return 1;
        Recursion(n - 1);
        System.out.println(n);
        return 0;
    }

    public static void main(String[] args) {
        funOne();
        Recursion(10);
    }
}
