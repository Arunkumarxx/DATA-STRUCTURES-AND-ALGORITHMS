package STRING;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1= "aab";
        String str2= "xyz";
        System.out.println(IsIsomorphicString(str1,str2));
    }
    private static boolean IsIsomorphicString(String str1,String str2) {
        if(str1.length()!=str2.length())
            return false;
        int n1=str1.length();
        int n2=str2.length();
        HashMap<String,String> hashMap= new HashMap<>();
        for(int i=0; i<n1; ++i)
        {
            hashMap.put(str1.charAt(i)+"",str2.charAt(i)+"");
        }
        System.out.println(hashMap);
        return false;
    }
}
