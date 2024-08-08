package STRING;

import java.util.ArrayList;
import java.util.HashSet;

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
        for(int i=0; i<s1.length(); ++i)
            hashSet1.add(String.valueOf(s1.charAt(i)));

        for(int i=0; i<s2.length(); ++i)
            hashSet2.add(String.valueOf(s2.charAt(i)));
       HashSet<Character> common =new HashSet<>();
       common.retainAll(hashSet1);
       hashSet1.remove(common);
       hashSet2.remove(common);

       StringBuilder stringBuilder =new StringBuilder();
       for(int i=0; i<s1.length(); ++i)
           if (hashSet1.contains(String.valueOf(s1.charAt(i))))
               stringBuilder.append(s1.charAt(i));
       for(int i=0; i<s2.length(); ++i)
           if(hashSet2.contains(String.valueOf(s2.charAt(i))))
               stringBuilder.append(String.valueOf(s2.charAt(i)));
        if(stringBuilder.length()==0) return "-1";
       return stringBuilder.toString();
    }
}
