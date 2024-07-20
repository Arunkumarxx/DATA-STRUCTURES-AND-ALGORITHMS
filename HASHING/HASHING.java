package HASHING;


import java.util.Arrays;

public class HASHING {
    public static void main(String[] args) {
        int n=-01;
        long res=0;

        while(n!=0)
        {
            res=(res*10)+(n%10);
            n=n/10;
        }
        System.out.println(res);
    }
}
