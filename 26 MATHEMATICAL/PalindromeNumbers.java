package MATHEMATICAL;

public class PalindromeNumbers {
    static boolean PalindromeNumbers(int n) {
        int temp = n;
        int rev = 0;
        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;
        }
        return (rev == n);
    }

    public static void main(String[] args) {
        int n = 202;
        PalindromeNumbers(n);
        System.out.println(PalindromeNumbers(n));
        System.out.println(15 % 3);
    }
}