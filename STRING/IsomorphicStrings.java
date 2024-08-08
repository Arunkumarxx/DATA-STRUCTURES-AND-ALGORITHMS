package STRING;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1= "aab";
        String str2= "xxy";
        System.out.println(IsIsomorphicString(str1,str2));
    }
    private static boolean IsIsomorphicString(String str1,String str2) {
        if(str1.length()!=str2.length())
            return false;
        int n=str1.length();
        HashMap<Character,Character> hashMap1 =new HashMap<>();
        HashMap<Character,Character> hashMap2 =new HashMap<>();
        for(int i=0; i<n; ++i)
        {
            char c1=str1.charAt(i);
            char c2=str2.charAt(i);
            if(hashMap1.containsKey(str1.charAt(i)) && hashMap1.get(str1.charAt(i))!=c1)
                return false;
            else hashMap1.put(str1.charAt(i),str2.charAt(i));
            if(hashMap2.containsKey(str2.charAt(i)) && hashMap1.get(str2.charAt(i))!=c2)
                return false;
            else hashMap2.put(str2.charAt(i),str1.charAt(i));
        }
            return true;
    }
}
