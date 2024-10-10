package RECURSION;

public class SumOfDigitsUsingRecursion {
    static int SumOfDigItsUsingRecursion(int n) {
        if (n==0)
            return 0;
        return SumOfDigItsUsingRecursion(n/10)+n%10;
    }
    public static void main(String[] args) {
        int n=9987;
        int x = SumOfDigItsUsingRecursion(n);
        System.out.println(x);
        System.out.println();

    }
}
