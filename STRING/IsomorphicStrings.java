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
            if(hashMap1.containsKey(c1) && hashMap1.get(c1)!=c1)
                return false;
            else hashMap1.put(c1,c2);
            if(hashMap2.containsKey(c2) && hashMap2.get(c2)!=c2)
                return false;
            else hashMap2.put(c2,c1);
        }
            return true;
    }
}
