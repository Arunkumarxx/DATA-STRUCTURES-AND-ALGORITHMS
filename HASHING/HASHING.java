package HASHING;

import java.util.Arrays;

public class HASHING {
    public static void main(String[] args) {
        System.out.println(97-65);
        System.out.println((int)'B');
        System.out.println( transform("welcome arun kumar"));
        long [] arr ={23};
        int n= arr.length;;
        Arrays.sort(arr);
        long x= (n&1)==0?arr[n/2]:arr[(n/2)+1];

    }
    public static String transform(String s)
    {
        // code here
        String str="";
        int n=s.length();
        String te=s.charAt(0)+"";
        str+=te.toUpperCase();
        for(int i=1; i<n; ++i)
        {
            if(s.charAt(i-1)==' ')
            {
                String temp=s.charAt(i)+"";
                str+=temp.toUpperCase();
            }
           else  str+=s.charAt(i);
        }

        return str;
    }
}
