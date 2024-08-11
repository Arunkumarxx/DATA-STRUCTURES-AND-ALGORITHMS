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

        for(int i=0; i<n2; ++i) {
            patternHash[pattern.charAt(i) - 'a']++;
            windowHash[str.charAt(i)-'a']++;
        }
        int patternHashCount = 0;
        for(int i=0; i<n2; ++i)
            patternHashCount+=patternHash[i];
//        System.out.println(n1-k);
//        System.out.println(n1);
//        System.out.println(n1-(k+1));

        for(int i=1; i<=n1-k;++i)
        {

        }
        System.out.println(Arrays.toString(windowHash));
        System.out.println(Arrays.toString(patternHash));

        return -1;
    }
    private static int  isPatternFoundCount() {
        int patterCount=0;
        for(int i=0; i<26; ++i)
        {
            if(patternHash[i]>0 && windowHash[i]==patternHash[i])
                ++patterCount;
        }
        return patterCount;
    }
}
