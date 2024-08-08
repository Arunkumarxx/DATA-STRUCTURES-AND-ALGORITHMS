package STRING;

import java.util.HashSet;

public class RemoveCommonCharactersAndConcatenate {
    public static void main(String[] args) {
        String string1 = "aacdb";
        String string2 = "gafd";
        System.out.println(concatenatedString(string1,string2));
    }
    private static String concatenatedString(String s1,String s2)
    {
        HashSet<String> hashSet =new HashSet<>();
        int i=0,j=0;
        int n1=s1.length();
        int n2=s2.length();
        while(i<n1 && j<n2)
        {
            hashSet.add(String.valueOf(s1.charAt(i)));
            hashSet.add(String.valueOf(s2.charAt(j)));
            ++i; ++j;
        }
        while(i<n1) {
            hashSet.add(String.valueOf(s1.charAt(i)));
            ++i;
        }
        while(j<n2)
        {
            hashSet.add(String.valueOf(s2.charAt(j)));
            ++j;
        }
        String result =new String();
        System.out.println(hashSet);
return "";
    }
}
