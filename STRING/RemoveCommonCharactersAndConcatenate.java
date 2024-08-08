package STRING;

import java.util.HashSet;
import java.util.Iterator;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        String string1 = "aacdb";
        String string2 = "gafd";
        System.out.println(concatenatedString(string1,string2));
    }
    private static String concatenatedString(String s1,String s2)
    {
        HashSet<String> hashSet1 =new HashSet<>();
        HashSet<String > hashSet2=new HashSet<>();
        int min=Math.max(s1.length(),s2.length());
        int i=0;
        for(; i<min; ++i) {
            hashSet1.add(String.valueOf(s1.charAt(i)));
            hashSet2.add(String.valueOf(s2.charAt(i)));
        }
        for(;i<s1.length(); ++i)
            hashSet1.add(String.valueOf(s1.charAt(i)));
        for(;i<s2.length(); ++i)
            hashSet2.add(String.valueOf(s2.charAt(i)));

        System.out.println(hashSet1);
        System.out.println(hashSet2);
       return "";
    }
}
