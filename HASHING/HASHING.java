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
            while(start<end && (chars[start]!='a' && chars[start]!='e' && chars[start]!='i' && chars[start]!='o' && chars[start]!='u'))
                ++start;
            while(start<end && (chars[end]!='a' && chars[end]!='e' && chars[end]!='i' && chars[end]!='o' && chars[end]!='u'))
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
