package MATHEMATICAL;

public class CountDigits {

    public static void main(String[] args) {
        int n = 100;
        int res = 0;
        while (n > 0) {
            n /= 10;
            res++;
        }
        System.out.println(res);
    }

}
