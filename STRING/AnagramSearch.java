package STRING;

import java.util.Arrays;

public class AnagramSearch {

    public static void main(String[] args) {
        String txt="forxxorfxdofr";
        String pattern ="for";
        System.out.println(search(txt,pattern));
    }
    private static int search(String str,String pattern) {
        int n1=str.length();
        int n2=pattern.length();

        if(n2>n1) return 0;

        int result=0;
        int [] windowHash  =new int[26];
        int [] patternHash = new int[26];

        for(int j=0; j<n2; ++j)
            ++patternHash[pattern.charAt(j)-'a'];

        for(int i=0; i<n2; ++i)
            ++windowHash[str.charAt(i)-'a'];

        if(isMatchFound(windowHash,patternHash))
            ++result;
        for(int i=n2; i<n1; ++i)
        {
            --windowHash[str.charAt(i-n2)-'a'];
            ++windowHash[str.charAt(i)-'a'];
            if(isMatchFound(windowHash,patternHash))
                ++result;
        }
        return result;
    }
    private static boolean isMatchFound(int[] windowHash, int[] patternHash) {
        for(int i=0; i<26;++i)
        {
            if(windowHash[i]!=patternHash[i])
                return false;
        }
        return true;
    }
}
