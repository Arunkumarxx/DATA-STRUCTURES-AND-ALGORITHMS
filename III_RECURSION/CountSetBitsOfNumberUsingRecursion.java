package RECURSION;
class CountSetBitsOfNumberUsingRecursion {
    static int count = 0;
    static int DecimalToBinary(int n) {
        if (n == 0)
            return 0;
        DecimalToBinary(n / 2);
        if (n % 2 == 1) {
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 21;
        int res = DecimalToBinary(n);
        System.out.println(res);
    }
}