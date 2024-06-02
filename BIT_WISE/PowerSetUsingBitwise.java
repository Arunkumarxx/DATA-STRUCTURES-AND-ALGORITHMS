package BIT_WISE;

public class PowerSetUsingBitwise {
    static void PowerSetUsingBitwise(String str) {
        int n = str.length();
        int Power = (int) Math.pow(2, n);
        for (int i = 0; i < Power; i++) {
            for (int j = 0; j < str.length(); j++) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.print(" ");
        }
    }

    public static void main(String[] args) {
        String string = "abc";
        PowerSetUsingBitwise(string);
    }
}
