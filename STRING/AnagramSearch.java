package STRING;

import java.util.Arrays;

public class AnagramSearch {



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
        int result=0;
        int [] windowHash  =new int[26];
        int [] patternHash = new int[26];

        for(int j=0; j<n2; ++j)
            patternHash[pattern.charAt(j)-'a']++;

        for(int i=0; i<k; ++i)
            ++windowHash[str.charAt(i)-'a'];

        int winPatternCount=isMatchFound(windowHash,patternHash,0,25);
        if(winPatternCount==k)
            ++result;
        System.out.println(result);
        for(int i=1;i<n1;++i)
        {

        }
        System.out.println(winPatternCount);
        System.out.println(Arrays.toString(windowHash));
        System.out.println(Arrays.toString(patternHash));

        return -1;
    }
    private static int isMatchFound(int [] windowHash,int [] patternHash,int i,int j) {
        int c=0;
        while(i<=j)
        {
            if(windowHash[i]==0 && patternHash[i]==0) {
                ++i;
                continue;
            }
            if(windowHash[i]==patternHash[i])
                ++c;
            ++i;
        }
        return c;
    }
}
