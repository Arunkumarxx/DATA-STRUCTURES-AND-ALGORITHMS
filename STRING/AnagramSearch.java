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
        if(n2>n1) return -1;
        int [] windowHash  =new int[26];
        int [] patternHash = new int[26];
        for(int i=0; i<n2; ++i) {
            patternHash[pattern.charAt(i) - 'a']++;
            windowHash[str.charAt(i)-'a']++;
        }
        System.out.println(Arrays.toString(windowHash));
        System.out.println(Arrays.toString(patternHash));

        return -1;
    }

}
