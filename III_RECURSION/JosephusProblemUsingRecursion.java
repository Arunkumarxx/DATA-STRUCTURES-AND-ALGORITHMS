package RECURSION;

public class JosephusProblemUsingRecursion {
    static int jose(int n,int k) {
        if (n==1)
            return 0;
        return (jose(n-1,k)+k)%n;
    }
    public static void main(String[] args) {
        int n=3;
        int k=2;
        System.out.println(jose(n,k));
    }
}
