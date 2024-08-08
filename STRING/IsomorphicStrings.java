package STRING;

import java.util.HashMap;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String str1= "foo";
        String str2= "bar";
        System.out.println(IsIsomorphicString(str1,str2));
    }
    private static boolean IsIsomorphicString(String str1,String str2) {
        if(str1.length()!=str2.length())
            return false;
        int n1=str1.length();
        int n2=str2.length();
        HashMap<String,String> hashMap1= new HashMap<>();
        for(int i=0; i<n1; ++i)
        {
            hashMap1.put(str1.charAt(i)+"",str2.charAt(i)+"");
        }
        HashMap<String,String> hashMap2 =new HashMap<>();
        for(int i=0; i<n1; ++i)
        {
            hashMap2.put(str2.charAt(i)+"",str1.charAt(i)+"");
        }
        System.out.println(hashMap1);
        System.out.println(hashMap2);
        return false;
    }
}
