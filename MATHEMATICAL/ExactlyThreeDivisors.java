package MATHEMATICAL;

public class ExactlyThreeDivisors {
    public static void main(String[] args) {
        int n = 10;
        int count = 0;
        int out = 0;
        for (int i = 1; i * i <= n; i *= i) {
            int temp = i;
            for (int j = i; j >= 1; j--) {
                if (temp % j == 0) {
                    count++;
                }
            }
            if (count == 3)
                out++;


            count = 0;
        }
        System.out.println(out);
    }

}
