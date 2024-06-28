package SEARCHING;

public class ToggleTheMiddle {
    static String str = "";

    static void recursion(int n) {
        if (n == 0)
            return;
        recursion(n / 2);
        str += n % 2;
    }

    public static void main(String[] args) {
        int n = 5;
        recursion(n);
        System.out.println(str);
        int len = str.length();
        String strs = "";
        for (int i = 0; i < len; i++) {
            if (len % 2 == 1 && i == len / 2)
                strs += '0';
            else if (len % 2 == 0 && (i == len / 2 - 1 || i == len / 2))
                strs += "1";
            else {
                strs += str.charAt(i);
            }
        }
        System.out.println(strs);
    }
}
