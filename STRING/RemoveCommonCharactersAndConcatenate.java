package STRING;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        String string1 = "abcs";
        String string2 = "cxzca";
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
        ArrayList<String> duplicates =new ArrayList<>();
       for(String ele:hashSet1)
           if(hashSet2.contains(ele)) {
               hashSet2.remove(ele);
               duplicates.add(ele);
           }
       for(String ele:duplicates)
           hashSet1.remove(ele);

       StringBuilder stringBuilder =new StringBuilder();
       for(int i=0; i<s1.length(); ++i)
           if (hashSet1.contains(s1.charAt(i)))
               stringBuilder.append(s1.charAt(i));
       for(int i=0; i<s2.length(); ++i)
           if(hashSet2.contains(s2.charAt(i)))
               stringBuilder.append(s2.charAt(i));

        System.out.println(hashSet1);
        System.out.println(hashSet2);
       return "";
    }
}
