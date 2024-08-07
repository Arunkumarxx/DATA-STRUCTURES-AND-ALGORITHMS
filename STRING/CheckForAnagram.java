package STRING;

import java.util.HashMap;
import java.util.Iterator;

public class CheckForAnagram {
    public static void main(String[] args) {
        String str1 ="arunkumar";
        String str2 ="kumararun";
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
        Iterator itr = hashMap.values().iterator();
        while(itr.hasNext())
            if((int)itr.next()!=0)
                return false;
            return true;
    }
}
