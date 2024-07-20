package HASHING;

import java.util.Arrays;

public class HASHING {
    public static void main(String[] args) {

    }
    String removeVowels(String S) {
        // code here
        String str="";
        for(int i=0; i<s.length();++i)
        {
            if(!(isVowel(s.charAt(i))))
                str+=s.charAt(i);
        }
        return str;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
