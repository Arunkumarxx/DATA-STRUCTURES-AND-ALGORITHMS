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

        for(int i=0; i< pattern.length; ++i) {
            patternHash[pattern.charAt(i) - 'a']++;
            windowHash[str.charAt(i)-'a']++;
        }
        int windowHashCount=0;
        for(int i=0; i< windowHash.length; ++i)
        {
            windowHashCount+=windowHash[i];
        }
        System.out.println(windowHashCount);
        return -1;
    }

}
