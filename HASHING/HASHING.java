package HASHING;

import ARRAYS.Arrays;

public class HASHING {
    public static void main(String[] args) {
        System.out.println(97-65);
        System.out.println((int)'B');
        System.out.println( transform("welcome"));
    }
    public static String transform(String s)
    {
        // code here
        String str="";
        int n=s.length();
        int cs=(int)s.charAt(0);
        cs+=32;
        System.out.println((char)cs);
        System.out.println(cs);
        for(int i=1; i<n-1; ++i)
        {
            if(s.charAt(i-1)==' ' || s.charAt(i+1)==' ')
            {
                str+= (char)((s.charAt(i)+32));
            }
            str+=s.charAt(i);
        }
        return str;
    }
}
