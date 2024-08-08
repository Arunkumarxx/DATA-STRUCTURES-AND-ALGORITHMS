package STRING;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        String string1 = "aacdb";
        String string2 = "gafd";
        long time =System.currentTimeMillis();
        System.out.println(concatenatedString(string1,string2));
        long timee=System.currentTimeMillis();
        System.out.println(timee-time);
    }
    private static String concatenatedString(String s1,String s2)
    {
        String ans = "";
        for(int i = 0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(s2.indexOf(ch)==-1)
                ans+=ch;
        }
        for(int i = 0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(s1.indexOf(ch)==-1)
                ans+=ch;
        }
        return ans==""?"-1":ans;
    }
}
