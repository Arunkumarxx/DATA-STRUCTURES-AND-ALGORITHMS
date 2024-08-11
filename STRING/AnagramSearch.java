package STRING;

import java.util.Arrays;

public class AnagramSearch {

    static   int [] windowHash  =new int[26];
    static   int [] patternHash = new int[26];

    public static void main(String[] args) {
        String txt="forxxorfxdofr";
        String pattern ="fxr";
        System.out.println(search(txt,pattern));
    }
    private static int search(String str,String pattern) {
        int n1=str.length();
        int n2=pattern.length();
        int k=pattern.length();
        if(n2>n1) return -1;

        for(int i=0; i<n1;++i)
            windowHash[str.charAt(i)-'a']++;

        for(int j=0; j<n2; ++j)
            patternHash[pattern.charAt(j)-'a']++;

        int winPatternCount=0;
        for(int i=0; k<n1; ++k)
            winPatternCount+=windowHash[str.charAt(i)-'a'];
        System.out.println(winPatternCount);
        System.out.println(Arrays.toString(windowHash));
        System.out.println(Arrays.toString(patternHash));

        return -1;
    }

}
