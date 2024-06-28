package MATHEMATICAL;

public class CheckPrime {
    public static void CheckPrimeOne(int n) {
        int RemainderCount = 0;
        int i = n;
        while (i != 0) {
            if (n % i == 0) {
                RemainderCount++;
            }
            i--;
        }
        if (RemainderCount == 2) {
            System.out.println("Input " + n + " is Prime number ");
        } else {
            System.out.println("No it's not a PrimeNumber");
        }
    }

    static boolean CheckPrimeNumber(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= (n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean CheckPrimeMoreEfficient(int n) {
        if (n == 1) {
            return false;
        }
        if (n == 2 || n == 3) {
            return true;
        }
        if ((n % 2 == 0 || n % 3 == 0)) {
            return false;
        }
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 77;
        System.out.println(CheckPrimeMoreEfficient(n));
    }
}
