package HASHING;

import java.util.Arrays;

public class HASHING {
    public static void main(String[] args) {
        System.out.println(isSumPalindrome(23));
    }
    static long isSumPalindrome(long n) {
        // code here

        long res=0;
        while(n!=0)
        {
            res=(res*10)+(n%10);
            n/=10;
        }
        System.out.println(res-2);
        String str=Long.toString(res);
        return -1;
    }
}
