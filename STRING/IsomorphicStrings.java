package STRING;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1= "abab";
        String str2= "cdcd";
        System.out.println(IsIsomorphicString(str1,str2));
    }
    private static boolean IsIsomorphicString(String str1,String str2) {
        if(str1.length()!=str2.length())
            return false;
        return true;
    }
}
