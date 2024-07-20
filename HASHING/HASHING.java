package HASHING;

import ARRAYS.Arrays;

public class HASHING {
    public static void main(String[] args) {
        String str= "practice";
        char [] chars  =new char[str.length()];
        for (int i=0 ;i<str.length(); ++i)
            chars[i]=str.charAt(i);

        int start=0;
        int end=chars.length-1;
        while(true)
        {
            char c1=chars[start];
            while(start<end && (c1!='a' && c1!='e' && c1!='i' && c1!='o' && c1!='u'))
                ++start;

            char c2=chars[end];
            while(start<end && (c2!='a' && c2!='e' && c2!='i' && c2!='o' && c2!='u'))
                --end;

            char temp=chars[start];
            chars[start]=chars[end];
            chars[end]=temp;

            ++start;
            --end;
            if(start==end)
                return;
        }

    }
}
