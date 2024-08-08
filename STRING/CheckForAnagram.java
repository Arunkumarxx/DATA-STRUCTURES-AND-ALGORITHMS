package STRING;

import java.util.HashMap;
import java.util.Iterator;

public class CheckForAnagram {
    public static void main(String[] args) {
        String str1 ="geeksforgeeks";
        String str2 ="forgeeksgeeks";
        System.out.println(isAnagram(str1,str2));
    }
    private static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length())
            return false;

        HashMap<Character,Integer> hashMap = new HashMap<>();
        for(int i=0;i<a.length(); ++i)
        {
            hashMap.put(a.charAt(i),hashMap.getOrDefault(a.charAt(i),0)+1);
            hashMap.put(b.charAt(i),hashMap.getOrDefault(b.charAt(i),0)-1);
        }
        System.out.println(hashMap);
        int i=0;
        for(; i<hashMap.size() && ( hashMap.get(i)==0);)
            ++i;
        if(i==a.length())
            return true;
        return false;
    }
}
