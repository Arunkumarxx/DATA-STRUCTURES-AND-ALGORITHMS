package RECURSION;

public class DigitalRoot {
    // complete the function
    static int result(int n) {
        int nn=  DigitalRoot(n);
        if (nn<=9)
            return nn%10;
        return result(nn/10)+(nn%10);
    }
    static int DigitalRoot(int n) {
        if (n<=9)
            return n%10;
        return DigitalRoot(n/10)+(n%10);
    }
    public static void main(String[] args) {
        int n=8426693;
     int res=result(n);
        System.out.println(res);
    }
}
