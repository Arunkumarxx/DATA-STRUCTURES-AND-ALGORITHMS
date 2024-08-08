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
        int i=0,j=0;
        int n1=s1.length();
        int n2=s2.length();
        while(i<n1 && j<n2)
        {
            if(hashSet1.contains(s1.charAt(i)) )
                hashSet1.remove(s1.charAt(i));
            else hashSet1.add(String.valueOf(s1.charAt(i)));
            if(hashSet2.contains(s1.charAt(i)))
                hashSet2.remove(s2.charAt(i));

            if(hashSet1.contains(s2.charAt(j)) )
                hashSet1.remove(s2.charAt(j));
            else hashSet2.add(String.valueOf(s2.charAt(j)));
            if(hashSet2.contains(s2.charAt(j)))
                hashSet2.remove(s2.charAt(j));

            ++i; ++j;
        }
        while(i<n1) {
            if(hashSet1.contains(s1.charAt(i)) )
                hashSet1.remove(s1.charAt(i));
            else hashSet1.add(String.valueOf(s1.charAt(i)));
            if(hashSet2.contains(s1.charAt(i)))
                hashSet2.remove(s2.charAt(i));
            ++i;
        }
        while(j<n2)
        {
            if(hashSet1.contains(s2.charAt(j)) )
                hashSet1.remove(s2.charAt(j));
            else hashSet2.add(String.valueOf(s2.charAt(j)));
            if(hashSet2.contains(s2.charAt(j)))
                hashSet2.remove(s2.charAt(j));
            ++j;
        }
        StringBuilder stringBuilder =new StringBuilder();

        System.out.println(hashSet1);
        System.out.println(hashSet2);
        return "";
    }
}
