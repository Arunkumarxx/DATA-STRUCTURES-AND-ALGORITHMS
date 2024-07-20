package HASHING;

import java.util.Arrays;

public class HASHING {
    public static void main(String[] args) {
        System.out.println(isSumPalindrome(23));
    }
    static long isSumPalindrome(long n) {
        // code here

        long res=0;
        long tempn=n;
        while(tempn!=0)
        {
            res=(res*10)+(tempn%10);
            tempn/=10;
        }
        String str=Long.toString(res+n);
        System.out.println(str);
        return -1;
    }
}
