package MATHEMATICAL;

public class TrailingZerosInFactorial {
    static int CheckZerosCount(int fact) {
        int count = 0;
        while (fact % 10 == 0) {
            count++;
            fact = fact / 10;
        }
        return count;
    }

    static void Iterative(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }

//        int res= CheckZerosCount(fact);
//        System.out.println(fact);
//        System.out.println(res);

        String string = Integer.toString(fact);
        System.out.println(fact);
        int c = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '0') {
                c++;
            }
        }
        System.out.println(c);
    }

    static void Effective(int n) {
        int res = 0;
        for (int i = 5; i <= n; i *= 5) {
            res += n / i;
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        int n = 1;
        Effective(n);

    }
}
